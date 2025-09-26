package Collection;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //vvi
        // Unorder data set
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(10);
        s.add(40);
        s.add(10);
//        System.out.println(s.contains(5)); // add /remove
//        System.out.println(s.size());// print size
//        System.out.println(s);//print all element
        //Iterator         for traversal
        Iterator it = s.iterator(); // Iterator have two function 1) hasNext;  2)next
//        System.out.print(it.next()+" ");// first time it point to null than 1 and 2 and more
//        System.out.print(it.next()+" ");
//        System.out.print(it.next()+" ");
//        System.out.println(it.hasNext());// this function return only true and false value
        while (it.hasNext()){
            System.out.print(it.next()+"->");
        }

//        for (int val: s){
//            System.out.print(val+"->");
//        }
        System.out.println();
        Set<Integer> s1 = new TreeSet<>();
        s1.add(9);
        s1.add(4);
        s1.add(2);
        s1.add(9);
        s1.add(5);
        System.out.println(s1);
        for(int val: s1){
            System.out.print(val+"->");
        }
        System.out.println();
        Set<Integer> l = new LinkedHashSet<>();
        l.add(8);
        l.add(8);
        l.add(4);
        l.add(6);
        System.out.println(l);
        for (int val: l){
            System.out.print(val+"->");
        }
    }
}
