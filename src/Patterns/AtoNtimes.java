package Patterns;

import com.sun.security.jgss.GSSUtil;

public class AtoNtimes {
    public static void main(String[] args) {
        int n =4 ;
/*        for(int i=0;i<n;i++){
            Character ch = 'A';//A=65 a=97
            for(int j=0;j<n;j++){
                System.out.print("\t"+ch);
                ch++;
            }
            System.out.println();
        } */
        int s=0;
        Character ch = 63;//A=65 a=97
/*        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("\t"+ ++ch);
            }
            System.out.println();
        }*/
        /*      for(int i=0;i<n;i++){
            ch++;
            for(int j=0;j<i;j++){
                System.out.print("\t"+ch);
            }
            System.out.println();
        } */
/*        // 1 2
         //  2
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print((i+1));
            }
            System.out.println();
        } */
        //pyramid p..
/*        for(int i=0;i<n;i++){
            //space n-i-1
            for(int j=0;j<n-i-1;j++){
                System.out.print((" "));
            }
            //num
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            //num2
            for(int j=i;j>0;j--){
                System.out.print((j));
            }
            System.out.println();
        }  */
        //Hollow Diamond Patten
/*
        *
  * *
 *   *
*     *
 *   *
  * *
   *
      */
        //Top part
        for(int i=0;i<n;i++) {
            //space n-i-1
            for (int j = 0; j<n-i-1; j++) {
                System.out.print((" "));
            }
            System.out.print("*");
            if (i != 0) {
                //space
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print((" "));
                }
                System.out.print("*");
            }
            System.out.println();
        }
        // Bottom half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print first star
            System.out.print("*");
            // Print spaces between stars
            if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
