package String;

import java.util.Scanner;

//String & Character Arrays
public class StringCharacterA {
    public static void main(String[] args) {
//        Character[] ch = {'a','b','c','d','e','\0'};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a nth number of String : ");
        int size = s.nextInt();
            s.nextLine();
/*        Character[] sh =new Character[size];
        for(int i=0;i<size;i++){
            sh[i]=s.next().charAt(0);
        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(sh[i]+"\t");
        }*/
 /*       String st = "Ram Ram";
        for(int j=0;j<st.length();j++){
            System.out.print(st.charAt(j)+"\t");
        }*/

        String[] starr=new String[size];
        System.out.print("Enter String :");
        for (int i=0;i<size;i++){
            starr[i]=s.nextLine();
        }
    for (int i=0;i<size;i++){
             System.out.println(starr[i] );
   }

    }
}
