package Sorting;

public class BubbleSort {
//time complexity O(n^2)
    public int[] bubbleSort(int[] arr) {
        final int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"->");
        }
        return arr;
    }
    public int[] selectionSort(int[] arr) {
        final int n = arr.length;
        int small;
        for (int i = 0; i < arr.length - 1; i++) {
            int index=i;
            small=arr[i];
            for (int j = i +1 ; j < arr.length - 1; j++) {
                if (small > arr[j ]) {
                    index = j;
                  small = arr[j];
                }
            }
            int temap = arr[i];
            arr[i]=small;
            arr[index]=temap;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"->");
        }
        return arr;
    }
    public int[] InsertionSort(int[] arr)  {
        for (int i = 0; i < arr.length ; i++) {
           int current =arr[i];
           int prev = i-1;
           while (prev >= 0 && arr[prev]>current){
               arr[prev+1]=arr[prev];
               prev--;
            }
           arr[prev +1 ]=current;
        }
        for(int val:arr){
            System.out.print(val+"->");
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr={7,8,3,2,1};
        BubbleSort b = new BubbleSort();
//        b.bubbleSort(arr);
//        b.selectionSort(arr);
        b.InsertionSort(arr);
    }
}
