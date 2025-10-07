package Array2D;

import java.util.Scanner;

public class Basic2DA {

    Boolean linearSearch(int mar[][],int rows , int colu) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colu; j++) {
                if (mar[i][j] == 10) {
                    System.out.println("Linear Search: Found 10 at position (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr =new int[3][4];
        int row=3,colume=4;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Array element ");
        for(int i=0;i<row;i++){
            for(int j=0;j<colume;j++){
                arr[i][j]=s.nextInt();
            }
        }
        Basic2DA b = new Basic2DA();
        boolean found = b.linearSearch(arr, row, colume);

        if (!found) {
            System.out.println("10 not found in the matrix");
        }
    }
}
