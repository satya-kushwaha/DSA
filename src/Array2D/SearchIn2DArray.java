package Array2D;

import java.util.Scanner;
//Apply Binary Search but lon(m*n) time complexity
public class SearchIn2DArray {

    public  static boolean  searchInRow(int[][] arr,int target,int row){
                int n=arr[0].length;
                int st=0,end= n-1;
                while (st<=end){
                    int mid = st + (end-st)/2;
                    if(target == arr[row][mid]){
                        return  true;
                    } else if (target > arr[row][mid]) {
                        st = mid+1;
                    }else
                    {
                     end = mid-1;
                    }
                }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Nth row and colum number of array : ");
        int r = s.nextInt();
        int c = s.nextInt();
        System.out.print("Enter a target value : ");
        int target = s.nextInt();
        int[][] arr =new int[r][c];
        int row=r,colum=c;
        System.out.println("Enter a Matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                arr[i][j]=s.nextInt();
                System.out.println(i+"\t"+j);
            }
        }
        int m =arr.length,n=arr[0].length;
        int sr =0,er =m-1,midr=0;
        boolean found = false;

        while (sr <= er){
            midr = sr+(er-sr)/2;
            if(target >= arr[midr][0]  && target <= arr[midr][n-1] ){
                //Found the row => BS on this row
               found = searchInRow(arr,target,midr);
               break;
            }else if( target > arr[midr][n-1] ){
                sr=midr+1;
                //down => right

            } else if ( target < arr[midr][n-1]) {
                // up => left
                er=midr-1;
            }
        }
        if (found) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Target not found in the matrix.");
        }

    }
}
