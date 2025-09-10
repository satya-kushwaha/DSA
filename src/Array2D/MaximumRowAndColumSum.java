package Array2D;

import java.util.Scanner;

public class MaximumRowAndColumSum {

    int MaximuRow(int arr[][],int row,int colum){
        int sum=0;
        for(int i=0;i<row;i++){
            int row1=0;
            for(int j=0;j<colum;j++){
               row1 +=arr[i][j];
            }
            sum = Math.max(sum,row1);
        }
        return sum;
    }
    int MaxiColumSum(int arr[][],int row,int colum){
        int sum=0;
        for(int i=0;i<row;i++){
            int row1=0;
            for(int j=0;j<colum;j++){
               row1 +=arr[j][i];
            }
            sum = Math.max(sum,row1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr =new int[3][3];
        int row=3,colume=3;
        Scanner s = new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<colume;j++){
                arr[i][j]=s.nextInt();
            }
        }
    MaximumRowAndColumSum m = new MaximumRowAndColumSum();
        System.out.println("Maximum 2D : "+m.MaximuRow(arr,row,colume));
        System.out.println("Minimum 2D : "+m.MaxiColumSum(arr,row,colume));
    }
}
