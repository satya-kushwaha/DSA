package LinkedList;

public class BasicDoublyLinkedList {

                static class Node{
                    int data;
                    Node next;
                    Node previous;
                    Node(int data){
                        this.data = data;
                        this.next= this.previous=null;
                    }
                }
             Node head= null,tail= null;
                public Node InsertF(int data){
                    Node newNode = new Node(data);
                    if (head == null && tail == null){
                        head = tail = newNode;
                    }else {
                        Node team = head;
                        head.previous= newNode;
                        newNode.next=head;
                        head = newNode;

                    }
                    return  head;
                }
                public Node InsertL(int data){
                    Node newNode = new Node(data);
                    if (head == null && tail == null){
                        head = tail = newNode;
                    }else {
                        Node team = tail;
                        tail.next = newNode;
                        newNode.previous=tail;
                        tail = newNode;

                    }
                    return  head;
                }
                public Node deletionF(){
                    if (head == null ){
                        System.out.println("Doubly Linked List already empty ");
                    }else {
                        head = head.next;

                        if (head != null) {
                            head.previous = null;
                        } else {
                            // If head becomes null, set tail to null as well
                            tail = null;
                        }
                    }
                    return head;
                }
                public Node deletionL(){
                    if ( head == null  ){
                        System.out.println("Doubly Linked List already empty ");
                    }else {
                        tail = tail.previous;
                        if (tail != null) {
                            tail.next=null;
                        } else {
                            // If head becomes null, set tail to null as well
                            tail = null;
                        }
                    }
                    return tail;
                }

                public void travel(){
                    if(head == null){
                        System.out.println("Linked list already empty");
                    }
                    Node teamp = head;
                    while (teamp != null){
                        System.out.print( "\t"+teamp.data);
                        teamp = teamp.next;
                    }
                    System.out.println();
                }
    public static void main(String[] args) {
                    BasicDoublyLinkedList bdl = new BasicDoublyLinkedList();
                    bdl.InsertF(5);
                    bdl.InsertF(4);
                    bdl.InsertF(3);
                    bdl.InsertF(2);
                    bdl.InsertF(1);
                    bdl.InsertL(6);
                    bdl.InsertL(7);
                    bdl.InsertL(8);
                   bdl.travel();

//                   bdl.deletionF();
                   bdl.deletionL();

                   bdl.travel();
    }
}
