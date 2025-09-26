package LinkedList;

public class DetectRemoveCycle {
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
    //detect only cycle
    public boolean deteCycle(){
        Node slow = head;
        Node fast = head;
        while (slow != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public Node deteCycleAndRemove(){
        Node slow = head;
        Node fast = head;
        boolean isCycle=false;
        while (slow != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if (isCycle){
            return null;
        }
        slow=head;
        //remove 1
        Node pre= null;
        while (slow != fast){
            slow = slow.next;
            pre=fast;// remove 2
            fast = fast.next;
        }
        pre.next=null;//remove cycle 3
        return slow;
    }
    //Create cycle list
    // Create a cycle by connecting the last node to a specific node in the list
    public void createCycle(int position) {
        if (head == null) return;
        Node temp = head;
        Node cycleNode = null;
        int count = 1;
        while (temp.next != null) {
            if (count == position) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }
        // Create the cycle
        temp.next = cycleNode;
    }
    public static void main(String[] args) {

        DetectRemoveCycle detect = new DetectRemoveCycle();
        detect.insertAtBeginning(5);
        detect.insertAtBeginning(4);
        detect.insertAtBeginning(3);
        detect.insertAtBeginning(2);
        detect.insertAtBeginning(1);
        detect.display();
        System.out.println(detect.deteCycle());
        detect.createCycle(3);
        System.out.println(detect.deteCycleAndRemove());

    }
}
