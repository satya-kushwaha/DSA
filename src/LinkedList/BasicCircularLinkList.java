package LinkedList;

public class BasicCircularLinkList {

         static class Node{
             int data;
             Node next;
             Node previous;
             Node(int data){
                 this.data =data;
                 this.next = this.previous = null;
             }
         }
         Node head =null ,tail = null;
         public Node insertF(int data){
             Node  newNode = new Node(data);
             if(head == null ){
                 head = tail = newNode;

             }else {
                 newNode.next=head;
                 head.previous=newNode;
                 head=newNode;
                 tail.next=head;
             }
             return head;
         }
         public Node insertL(int data){
             Node  newNode = new Node(data);
             if(head == null ){
                 head = tail = newNode;

             }else {
                 tail.next=newNode;
                 newNode.previous=tail;
                 tail=newNode;
                 tail.next = head;
             }
             return head;
         }
         public Node deleteF(){
             if(head == null ){
                 System.out.println("Circular Linked List Already empty");
             }else {
                Node team = head;
                head=head.next;
                tail.next=head;
             }
             return head;
         }
         public Node deleteL(){
             if(head == null ){
                 System.out.println("Circular Linked List Already empty");
             }else {
                tail=tail.previous;
                tail.next = head;
             }
             return head;
         }
         public  void traves(){
             if(head == null){
                 System.out.println("LinkList is already empty ");
             }else {
                 Node temp = head;
                 while (temp != tail){
                     System.out.print("\t"+temp.data);
                     temp=temp.next;
                 }
                 System.out.println();
             }
         }
    public static void main(String[] args) {

            BasicCircularLinkList bcl = new BasicCircularLinkList();
        System.out.println("Insert in first ");
            bcl.insertF(5);
            bcl.insertF(4);
            bcl.insertF(3);
            bcl.insertF(2);
            bcl.insertF(1);
            bcl.traves();
        System.out.println("Insert in Last ");
            bcl.insertL(6);
            bcl.insertL(7);
            bcl.insertL(8);
            bcl.traves();
        System.out.println("Delete in first ");
        bcl.deleteF();
        bcl.deleteF();
        bcl.traves();
        System.out.println("Delete in last ");
        bcl.deleteL();
        bcl.deleteL();
        bcl.deleteL();
        bcl.traves();

    }
}
