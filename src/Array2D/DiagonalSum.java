package Array2D;

import java.util.Scanner;

public class DiagonalSum {
    int diSum(int arr[][],int n){
//        Primary Diagonal j=1
//        secondary Diagonal j= n-1-i
        int pd=0,sd=0;
/*        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    pd +=arr[i][j];
                }else if(j == n-i-1) {
                    sd +=arr[i][j];
                }
            }
        }*/
        for(int i=0;i<n;i++){
            pd += arr[i][i];
            if(i != n-1-i){
                sd +=arr[i][i];
            }
        }
        return pd+sd;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Nth number of array : ");
        int n = s.nextInt();
        int[][] arr =new int[n][n];
        int row=n,colum=n;
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                arr[i][j]=s.nextInt();
            }
        }
        DiagonalSum d = new DiagonalSum();
        System.out.println(d.diSum(arr,n));
    }
}
