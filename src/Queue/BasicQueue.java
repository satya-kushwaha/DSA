package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {

              class  Node{
                  int data;
                  Node next;
                  Node(int data){
                      this.data = data;
                      next = null;
                  }
              }
              Node head=null;Node tail=null;
              void push(int value){  //Insert data tail of the linklist
                  Node newNode = new Node(value);
                  if(head == null && tail == null){
                      head = tail = newNode;
                  }else {
                      tail.next = newNode;
                      tail = newNode;
                  }

              }
              void pop(){ // Delete data front of linklist
                  if(isEmpty()){
                      return ;
                  }else {
                      Node oldhead = head;
                      head = head.next;
                      if(head == null){
                          tail = null;
                      }
                  }
              }
              int front(){
                  if(isEmpty()){
                      return 0;
                  }else {
                      return head.data;
                  }
              }
              boolean isEmpty(){
                  if(head == null && tail == null) {
                      return true;
                  }
                    return  false;
              }

    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.addFirst(4);

        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());

        queue.pollFirst();
        System.out.println(queue.getFirst());


/*                  BasicQueue q =new BasicQueue();
                  q.push(1);
                  q.push(2);
                  q.push(3);

                  while (!q.isEmpty()){
                      System.out.println(q.front());
                      q.pop();
                  }
        System.out.println();*/
    }
}
