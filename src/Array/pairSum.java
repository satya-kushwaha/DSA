package Array;

import java.util.Scanner;
import java.util.Vector;

//Return pair in sorted array with target sum {2,7,8,9} target sum = 9
public class pairSum {

    Vector<Integer> pairSums(int[] arrs,int tar) {
        Vector<Integer> v = new Vector<>();
        //Brute force
/*        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] + arrs[j] == tar) {
                    v.add(i);
                    v.add(j);
                    return v;
                }
            }
        }*/
        //log n complexity tow pointer approch
        int start=0,end=arrs.length-1;
        int n = arrs.length;
          while (start < end){
              if(arrs[start]+arrs[end] > tar){
                  end--;
              }
              if(arrs[start]+arrs[end] < tar){
                  start++;
              }
              if(arrs[start]+arrs[end] == tar){
               v.add(start);
               v.add(end);
               return v;
              }
          }
        return  v;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a pair target  Sum ");
        int target = s.nextInt();
            pairSum p = new pairSum();
            System.out.println(p.pairSums(arr,target));
    }
}
