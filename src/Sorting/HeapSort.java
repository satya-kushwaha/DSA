package Sorting;

public class HeapSort {

             static void heapiyg(int[] arr,int n,int i){
                 int longest = i;
                 int left = 2*i  ;
                 int right = 2*i+1;
                 //checking left is not overflow and left is grater then root
                 if(left < n && arr[left] > arr[longest]){
                     longest= left;
                 }
                 if(right < n && arr[right]> arr[longest]){
                     longest=right;
                 }
                 if(longest != i){
                     int temp = arr[i];
                     arr[i]=arr[longest];
                     arr[longest]=temp;
                     // Recursively heapify the affected subtree
                     heapiyg(arr,n,longest);
                 }
             }
       // Main function to perform Heap Sort
       // Step 1: Build a Max Heap
         static void buildHeap(int[] arr,int n){
            for(int i=n/2;i>=0;i--){
                heapiyg(arr,n,i);
            }
             // Step 2: Extract elements one by one
             for(int i=n-1;i>0;i--){
                 // Swap root (max) with the last eleme
                 int teamp = arr[0];
                 arr[0]=arr[i];
                 arr[i]=teamp;
                 // Heapify the reduced heap
                 heapiyg(arr,i,0);
             }

      }
      static  void print(int[] arr,int n){
                 for(int i=0;i<n;i++){
                     System.out.print(arr[i]+" ");
                 }
          System.out.println();
      }
      public static int  insert(int arr[],int n, int value){
                    arr[n]=value;
                   int i=n;
                 while (i> 1){
                     int parent =i/2;
                     if (arr[i] > arr[parent]) {  // if child > parent → swap
                         int temp = arr[i];
                         arr[i] = arr[parent];
                         arr[parent] = temp;
                         i = parent; // move up
                     } else {
                         break; // heap property satisfied
                     }
                 }
                 return n+1;
      }
    public static int deleteMax(int[] arr, int n) {
        if (n <= 0) return 0; // empty heap
        arr[0] = arr[n - 1]; // move last element to root
        n = n - 1;           // reduce heap size
        int i = 0;
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }
            if (largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                i = largest; // move down
            } else {
                break; // heap property restored
            }
        }

        return n; // return new heap size
    }

    public static void main(String[] args) {
        int[] arr = new int[10]; // bigger array
        arr[0] = 20;
        arr[1] = 15;
        arr[2] = 10;
        arr[3] = 25;
        arr[4] = 30;
        arr[5] = 45;
                 int n = 6;

        System.out.println("Original array:");
        print(arr,n);

        buildHeap(arr,n);
        System.out.println("sort array:");
        print(arr,n);

        n  = insert(arr,n,12);
        buildHeap(arr,n);
        System.out.println("After Insertion ");
        print(arr,n);

    }
}
