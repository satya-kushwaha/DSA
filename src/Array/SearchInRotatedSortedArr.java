package Array;

public class SearchInRotatedSortedArr {

    public static void main(String[] args) {
        //ascending order : distinct values
        int[] arr={3,4,5,6,0,1,2};
        int tar=0;
        int start=0,end=arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]== tar){
                System.out.println(mid);
            }
            //left half
            if(arr[start] <= arr[mid] ){
                if(arr[start] <= tar && tar <= arr[mid] ){
                    end=mid-1;
                }else {
                    start = mid +1;
                }
            }//right half
            else if (arr[mid] >= arr[end] ) {
                if(arr[start] <= tar && tar <= arr[mid] ){
                    start = mid +1;
                }else {
                    end=mid-1;
                }
            }
        }
    }
}
