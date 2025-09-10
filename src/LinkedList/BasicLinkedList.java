package LinkedList;

public class BasicLinkedList {

    // Node class
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

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Insert at specific position (0-based index)
    public void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
    }

    // Delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    // Delete at specific position
    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 0) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) tail = temp;
    }

    // Search element
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
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
        BasicLinkedList list = new BasicLinkedList();

        // Insert elements
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display(); // 10 -> 20 -> 30 -> null

        // Insert at beginning
        list.insertAtBeginning(5);
        list.display(); // 5 -> 10 -> 20 -> 30 -> null

        // Insert at position
        list.insertAtPosition(15, 2);
        list.display(); // 5 -> 10 -> 15 -> 20 -> 30 -> null

        // Delete first
        list.deleteFirst();
        list.display(); // 10 -> 15 -> 20 -> 30 -> null

        // Delete last
        list.deleteLast();
        list.display(); // 10 -> 15 -> 20 -> null

        // Delete at position
        list.deleteAtPosition(1);
        list.display(); // 10 -> 20 -> null

        // Search
        System.out.println(list.search(20)); // true
        System.out.println(list.search(40)); // false
    }
}
