package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueOperation {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(10);
        p.add(20);
        p.add(3);
        p.add(4);
        p.add(5);
        while (!p.isEmpty()){
            System.out.print(p.poll()+"->");
        }
        //when iterating with a for-each, the order depends on the internal structure of the heap array — NOT sorted order.
     /*   for (int val: p){
            System.out.print(val+"\t");
        }*/
        System.out.println("\nArray Deque double Ended queue");
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(1);
        a.addFirst(2);;
        a.addLast(2);

        for(int val: a){
            System.out.print(val+"\t");
        }
    }
}
