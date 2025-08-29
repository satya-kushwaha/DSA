package Stack;

import java.util.Stack;

public class NGE {
    public static void main(String[] args) {

        int[] price = {6,8,0,1,3};
        int n = price.length;
        int[] ans = new int[n];
        Stack<Integer> sta = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            while (!sta.isEmpty() && sta.peek() <= price[i]) {
                sta.pop();
            }

            if (sta.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = sta.peek();
            }

            sta.push(price[i]);  // push value, not index
        }

        // Print answer
        System.out.print("Next Greater Elements: ");
        for (int val : ans) {
            System.out.print(val + "\t");
        }
        System.out.println();
    }
}
