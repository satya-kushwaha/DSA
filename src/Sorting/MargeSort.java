package Sorting;

public class MargeSort {
    // time complexity O(n log n)
    public static void divideMarge(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divideMarge(arr, start, mid);
        divideMarge(arr, mid + 1, end);
        conquerMarge(arr, start, mid, end);
    }
    public static void conquerMarge(int[] arr, int start, int mid, int end) {
        int[] marge = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        // merge both halves
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                marge[x++] = arr[idx1++];
            } else {
                marge[x++] = arr[idx2++];
            }
        }
        // copy remaining left half
        while (idx1 <= mid) {       marge[x++] = arr[idx1++];     }
        // copy remaining right half
        while (idx2 <= end) {             marge[x++] = arr[idx2++];      }
        // copy merged elements back to original array
        for (int i = 0; i < marge.length; i++) {
            arr[start + i] = marge[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 2, 1};
        int start = 0, end = arr.length - 1;
        divideMarge(arr, start, end);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
