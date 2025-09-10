package Array2D;

import java.util.Scanner;

public  class SearchIn2DMatrixII {


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

        int row = 0, col = c - 1;
        boolean found = false;

        while (row < r && col >= 0) {
            if (arr[row][col] == target) {
                found = true;
                break;
            } else if (arr[row][col] > target) {
                col--;  // Move left
            } else {
                row++;  // Move down
            }
        }

        if (found) {
            System.out.println("Target is found.");
        } else {
            System.out.println("Target is not found.");
        }

    }
}