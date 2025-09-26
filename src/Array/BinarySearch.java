package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,4,5,9,12};
        int target=9;
        int start=0,end=arr.length-1;
        while (start <= end){

//            int mid=start +(end-start)/2;
            //stop overflow conditon when adding tow interger mix value
            int mid = start + (end - start) / 2;

            if(arr[mid] < target){
                start = mid+1;
            }else {
                end = mid -1;
            }
            if(arr[mid] == target){
                System.out.println("Index of Array = "+mid+" And value of "+arr[mid]);
            }
        }
    }
}
