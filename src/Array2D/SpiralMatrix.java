package Array2D;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows and columns of array: ");
        int r = s.nextInt();
        int c = s.nextInt();

        System.out.print("Enter target value: ");
        int target = s.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the matrix (row by row):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int srow =0,erow=r-1;
        int scol =0,ecol=c-1,i;
        while (srow <= erow && scol <= ecol ){
            //top
            for( i=scol;i<=ecol;i++){
                System.out.print(arr[srow][i]);
            }
            //right
            for( i=srow;i<=erow;i++){
                System.out.print(arr[i][ecol]);
            }
            //bottom
            for(int j=ecol;j>=scol;j++){
                if(srow == erow){
                    break;
                }
                System.out.print(arr[ecol][j]);
            }
            //left
            for(int j=erow-1;j >= srow +1;j--){
                if(scol == ecol){
                    break;
                }
                System.out.print(arr[j][scol]);
            }
            srow++;erow--;scol++;ecol--;
        }
    }
}
