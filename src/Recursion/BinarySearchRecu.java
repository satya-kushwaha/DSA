package Recursion;

public class BinarySearchRecu {

    public  int binarySearch(int[] arr , int target,int start , int end ) {

        if (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
//            start = mid +1;
                return binarySearch(arr, target, mid + 1, end);
            } else if (arr[mid] > target) {
//            end = mid -1;
                return binarySearch(arr, target, start, mid - 1);
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,3,4,5,9,12};
        int target=40;
        BinarySearchRecu b = new BinarySearchRecu();
        System.out.println(b.binarySearch(arr,target,0,arr.length-1));
    }
}
