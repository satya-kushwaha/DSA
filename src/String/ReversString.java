package String;


import static java.util.Collections.swap;

public class ReversString {

    public static void main(String[] args) {
        String ram = "mohan i am going";
        int st=0,end= ram.length()-1;
        for(int i=ram.length()-1;i>=0;i--){
            System.out.print(ram.charAt(i));
        }
        char[] arr = ram.toCharArray();
        while (st<end){
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}
