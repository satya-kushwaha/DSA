package Collection;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        //VVI
        System.out.println("\nHash Map");
        Map<Integer,String> hmap = new HashMap<>();
        //Insertion
        hmap.put(1,"Satya kushwaha");
        hmap.put(2,"Satya Kumar kushwaha");
        hmap.put(3,"Subhash  kushwaha");
        //update
        hmap.put(3,"Subhash  kushwaha t ");
        hmap.put(4,"Shashi kushwaha");
        //deletion
        hmap.remove(4);
        //Search
        System.out.println(hmap.containsKey(2));
        if(!hmap.containsKey(4)){
            System.out.println("Key is present in the map ");
        }
        else {
            System.out.println("Key is not present in the map");
        }
//        System.out.println(hmap.get(3));
        //Iteration in HashMap


        for (Map.Entry<Integer,String> e  : hmap.entrySet()){
            System.out.print(e.getKey()+"\t"+e.getValue()+"\t");
        }
        System.out.println("\nSet");
        Set<Integer> keys = hmap.keySet();
        for(int val : keys){
            System.out.print(val+" ");
        }

        System.out.println("\nTree Map");
        TreeMap<Integer,String> s = new TreeMap<>();
        s.put(1,"Satya kushwaha");
        s.put(2,"Satya Kumar kushwaha");
        s.put(3,"Subhash  kushwaha");
        s.put(4,"Shashi kushwaha");
        for (Map.Entry<Integer,String> e  : s.entrySet()){
            System.out.print(e.getKey()+"\t"+e.getValue()+"\t");
        }
        System.out.println();

        System.out.println("Hash Table");
        Map<Integer,String> ht = new Hashtable<>();
        ht.put(1,"Satya kushwaha");
        ht.put(2,"Satya Kumar kushwaha");
        ht.put(3,"Subhash  kushwaha");
        ht.put(4,"Shashi kushwaha");
        for (Map.Entry<Integer,String> e  : ht.entrySet()){
            System.out.print(e.getKey()+"\t"+e.getValue()+"\t");
        }

        System.out.println("\nLinkedHash Map");
        Map<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(1,"Satya kushwaha");
        lhm.put(2,"Satya Kumar kushwaha");
        lhm.put(3,"Subhash  kushwaha");
        lhm.put(4,"Shashi kushwaha");
        for (Map.Entry<Integer,String> e  : lhm.entrySet()){
            System.out.print(e.getKey()+"\t"+e.getValue()+"\t");
        }

    }
}
