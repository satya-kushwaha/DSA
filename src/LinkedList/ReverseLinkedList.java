package LinkedList;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
             Node head = null;
             Node tail = null;
    public void insertAtBeginning(int data) {
      Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
 public Node reverseL(){
        if(head == null){
            System.out.println("Link is already empty");
        }else {
            Node currNode = head;
            Node previous=null;
            Node next=null;
            while (currNode != null){
                next = currNode.next;
                currNode.next=previous;
                previous=currNode;
                currNode=next;
                head = previous;
            }
        }
     return head;
 }

    // Display list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList r = new ReverseLinkedList();
        r.insertAtBeginning(5);
        r.insertAtBeginning(4);
        r.insertAtBeginning(3);
        r.insertAtBeginning(2);
        r.insertAtBeginning(1);
        r.display();
        r.reverseL();
        r.display();
    }
}
