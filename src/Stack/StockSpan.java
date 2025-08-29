package Stack;

import java.util.*;

public class StockSpan {

    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] ans = new int[n];   // to store spans
        Stack<Integer> sta = new Stack<>();  // stack to store indices

        for (int i = 0; i < n; i++) {
            // Pop elements smaller or equal to current price
            while (!sta.isEmpty() && price[sta.peek()] <= price[i]) {
                sta.pop();
            }

            // If stack is empty, span = i+1 (all elements till now are smaller)
            if (sta.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - sta.peek();
            }

            sta.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] ans = calculateSpan(price);

        System.out.println("Stock Prices: " + Arrays.toString(price));
        System.out.println("Span Values : " + Arrays.toString(ans));
    }
}
