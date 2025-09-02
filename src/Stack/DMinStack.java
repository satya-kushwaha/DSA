package Stack;

import java.util.Stack;

class Pair {
    int first;   // value
    int second;  // min value till now

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class DMinStack {
    Stack<Pair> sta = new Stack<>();

    DMinStack() { }

    void push(int val) {
        if (sta.isEmpty()) {
            sta.push(new Pair(val, val));
        } else {
            int minVal = Math.min(val, sta.peek().second);
            sta.push(new Pair(val, minVal));
        }
    }

    void pop() {
        if (!sta.isEmpty()) {
            sta.pop();
        }
    }

    int top() {
        if (!sta.isEmpty()) {
            return sta.peek().first;
        }
        throw new RuntimeException("Stack is empty!");
    }

    int getMini() {
        if (!sta.isEmpty()) {
            return sta.peek().second;
        }
        throw new RuntimeException("Stack is empty!");
    }

    public static void main(String[] args) {
        DMinStack st = new DMinStack();
        st.push(5);
        st.push(3);
        st.push(7);
        st.push(2);

        System.out.println("Top: " + st.top());     // 2
        System.out.println("Min: " + st.getMini()); // 2
        st.pop();
        System.out.println("Top: " + st.top());     // 7
        System.out.println("Min: " + st.getMini()); // 3
    }
}
// same problam to sovle different ways
class MinStack {
    Stack<Long> stack = new Stack<>();
    Long minVal;

    MinStack() { }

    void push(long val) {
        if (stack.isEmpty()) {
            stack.push(val);
            minVal = val;
        } else {
            if (val < minVal) {
                // Encode the new minimum
                stack.push(2 * val - minVal);
                minVal = val;
            } else {
                stack.push(val);
            }
        }
    }

    void pop() {
        if (stack.isEmpty()) throw new RuntimeException("Stack is empty!");
        long top = stack.pop();
        if (top < minVal) {
            // Decode previous minimum
            minVal = 2 * minVal - top;
        }
    }

    long top() {
        if (stack.isEmpty()) throw new RuntimeException("Stack is empty!");
        long top = stack.peek();
        if (top < minVal) {
            return minVal; // Encoded value → actual minVal
        }
        return top;
    }

    long getMin() {
        if (stack.isEmpty()) throw new RuntimeException("Stack is empty!");
        return minVal;
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(5);
        st.push(3);
        st.push(7);
        st.push(2);

        System.out.println("Top: " + st.top());     // 2
        System.out.println("Min: " + st.getMin()); // 2
        st.pop();
        System.out.println("Top: " + st.top());     // 7
        System.out.println("Min: " + st.getMin()); // 3
    }
}
