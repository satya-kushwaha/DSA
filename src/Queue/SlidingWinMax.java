package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class SlidingWinMax {
    public static void main(String[] args) {
        int[] nums = {3, 6, -67, 3, -5, 5, 3};
        int k = 3; // window size
        Vector<Integer> res = slidingWindowMax(nums, k);

        System.out.println(res);
    }

    public static Vector<Integer> slidingWindowMax(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>(); // stores indices
        Vector<Integer> res = new Vector<>();

        // Process first k elements
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        // Process rest of the array
        for (int i = k; i < nums.length; i++) {
            res.add(nums[dq.peekFirst()]); // front is max of previous window

            // Remove indices out of current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Remove smaller elements (not useful anymore)
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        // Add max for the last window
        res.add(nums[dq.peekFirst()]);

        return res;
    }
}
