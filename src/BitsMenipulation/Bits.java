package BitsMenipulation;

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        int n = 5;
        int post = 2;
        int bitMask= 1<<post;

        //Get Bit
/*        if((bitMask & n) == 0 ){
            System.out.println("Bit was zero");
        }
        else {
            System.out.println("Bit was one  ");
        }*/

        // Set Bit
/*        int newNumber = bitMask | n;
        System.out.println(newNumber);*/

        //Clear Bit
     /*   int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);*/
        //Update Bit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter set oper o or 1");
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
        int bitMasku = 1<<post;
        if(oper == 1) {
            //set
            int newNumber = bitMasku | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMasku);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }


    }
}
