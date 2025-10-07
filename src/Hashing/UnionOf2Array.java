package Hashing;

import java.util.HashSet;

public class UnionOf2Array {

    public static void main(String[] args) {
        int[] arr1={7,3,9,};
        int[] arr2={6,3,9,6,2,4};
        HashSet<Integer> s = new HashSet<>();
        for (int i : arr1) {
            s.add(i);
        }
        for (int i : arr2) {
            s.add(i);
        }
        System.out.println(s.size());
        for(int value: s){
            System.out.print(value +" ");
        }
    }
}
