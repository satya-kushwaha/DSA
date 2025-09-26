package Mathes;

import java.util.Scanner;

//Binary Exponentiation
public class ComputeXpowerN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double  x value ");
        double x= scanner.nextFloat();
        System.out.println("Enter power of  n value ");
        int n = scanner.nextInt();

        if(n== 1) System.out.println("1.0");
        if (x== 0)System.out.println("0.0");
        if(x==1) System.out.println("1");
        if(x == -1 && n%2== 0) System.out.println("1.0");
        if(x == -1 && n%2!= 0) System.out.println("- 1.0");
        long binForm=n;
        if(n<0){
            x = 1/x;
            binForm =- binForm;
        }
        double ans = 1;
        while (binForm > 0){
            if(binForm%2 == 1){
                ans *= x;
            }
            x *= x;
            binForm =binForm/2;
        }
        System.out.println(ans);
    }
}
