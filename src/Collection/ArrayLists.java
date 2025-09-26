package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ArrayLists {
    public static void main(String[] args) {

        System.out.println("Linked List ");
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        for(int val: l){
            System.out.print("\t"+val);
        }

        System.out.println("\nArray List ");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        for(int val : arr){
            System.out.print("\t"+val);
        }

        System.out.println("\nVector ");
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        System.out.println(v.get(0));

        System.out.println("Stack ");
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        for(int val : s){
            System.out.print("\t"+val);
        }
    }
}
