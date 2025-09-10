package Mathes;

import java.util.Scanner;

public class BasicMath {

    public String isPrimeN(int n){
        //Prime Number
        for(int i=2;i<=n;i++){
//            System.out.println(i*2-1);
            if(n/i == 0){
                return "Not Prime Number";
            }
        }
        return  "Prime Number";
    }
    public int countOfDigit(int n){
        int a=0,coutn=0,sum=0;

        while (n != 0){
            a=n%10;
            System.out.print(a);
            sum += a;
            n=n/10;
            coutn++;
        }
        System.out.println("\nsum = "+sum);
        return coutn;
    }
    public boolean armstrongN(int n){
        int arm = n;
        int a=0,c=0;
        while(n != 0){
            a=n%10;
            c+=a*a*a;
            n=n/10;
        }
        if(arm == c){
            return true;
        }
        return false;
    }
    //importance for compertetive programming
    public int gCD(int a,int b){
        int ged = 1;
        if(a == 0)return a;
        if (b == 0) return  b;
        if (a == b) return  b;

/*        for(int i=1;i <= Math.min(a,b);i++){
            if(a%i == 0 && b%i == 0){
                ged=i;
            }
        }*/
        //Euclid’s Algorithm?
        while (a > 0 && b >0){
            if(a > b){
                a=a%b;
            }else {
                b=b%a;
            }
        }
        if(a == 0 ) return  b;
        return a;
//      return  ged;
    }
    public int lcm(int a,int b){
        int ged = gCD(a,b);
        return (a*b)/ged;
    }
    public int reverseNu(int n){
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            if(reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10){
                return 0;
            }
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return reversed;
    }
    public  boolean palindromeN(int n){
        if(n < 0 ){
            return false;
        }
        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return reversed == original;
    }
    //Modulo Arithmetics
    public void moduloArith(int n){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Nth number \n");
        int n = scanner.nextInt();
        int s=28;
        BasicMath b = new BasicMath();
//        System.out.println(b.isPrimeN(n));
//        System.out.println(b.countOfDigit(n));
//        System.out.println(b.armstrongN(n));
//        System.out.println(b.gCD(n,s));
//        System.out.println(b.lcm(n,s));
//        System.out.println(b.reverseNu(n));
        System.out.println(b.palindromeN(n));
    }
}
