package Hashing;

import java.util.HashSet;

public class IntersectionOf2Arr {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,6,2,4};
        // 3,9 ans return
        HashSet<Integer>  set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if( set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}
