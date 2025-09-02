package Stack;

import java.util.Stack;

public class NGE2 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,3};
        int n = num.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse twice (simulate circular array)
        for(int i = 2*n - 1; i >= 0; i--){
            while(!stack.isEmpty() && num[stack.peek()] <= num[i % n]){
                stack.pop();
            }
            ans[i % n] = stack.isEmpty() ? -1 : num[stack.peek()];
            stack.push(i % n);
        }

        // Print result
        for(int val : ans){
            System.out.print(val + "\t");
        }
    }
}
