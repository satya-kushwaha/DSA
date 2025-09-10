package Queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Both are importance quantion

// Implement Stack using Queue
public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    void push(int data) {
        // Move all elements of q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Add new element to q1
        q1.add(data);

        // Move everything back from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.remove();
    }

    int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.peek();
    }

    boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());  // 30
        System.out.println(st.peek()); // 20
        System.out.println(st.pop());  // 20
        System.out.println(st.pop());  // 10
        System.out.println(st.empty()); // true
    }
}
//Implementing queue using Stack
class MyQueue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    MyQueue(){

    }
    void push(int data){
        while (!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
    }
    int pop(){

        if(s1.isEmpty()){
            System.out.println("Queue is Empty \n");
            return -1;
        }
        return s1.pop();

    }
    int front(){//peek
        return s1.peek();
    }
    boolean Empty(){
        return  s1.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue m = new MyQueue();
        m.push(1);
        m.push(2);
        m.push(3);
        m.push(4);
        while (!m.Empty()){
            System.out.println(m.front());
            m.pop();
        }
    }
}

