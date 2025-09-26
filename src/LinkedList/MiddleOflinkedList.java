package LinkedList;

public class MiddleOflinkedList {

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
//Using Brute Force Algorithm
    public int middleLF(){
        Node teamp = head;
        int count=1;
        while (teamp != null){
            count++;
            teamp = teamp.next;
        }
        count = (count+1)/2;
        int i=1;
        teamp = head;
        while (i != count){
            teamp = teamp.next;
            i++;
        }
        System.out.println(teamp.data);
        return 0;
    }
    //vvi
//slow fast Pointer
    public int middleliF(){
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow.data;
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
        MiddleOflinkedList moll= new MiddleOflinkedList();


        moll.insertAtBeginning(6);
        moll.insertAtBeginning(5);
        moll.insertAtBeginning(4);
        moll.insertAtBeginning(3);
        moll.insertAtBeginning(2);
        moll.insertAtBeginning(1);
        moll.display();
//        moll.middleLF();
        System.out.println(moll.middleliF());
    }
}
