package Stack;

import java.util.Stack;

/* Given a 2D array (n x n), such that arr[i][j] = 1 means ith person knows jth person , the task
      is to find th celebrity.
  A celebrity is person who is known to all but does not know anyone.
  Return the index of the celebrity , if there is no celebrity return -1.
  arr[0,1,0],[0,0,0],[0,1,0]*/

public class Celebrity {

    // Function to find celebrity
    static int findCelebrity(int[][] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        // Push all people into stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Eliminate non-celebrities
        while (stack.size() > 1) {
            int i = stack.pop();
            int j = stack.pop();

            if (arr[i][j] == 1) {
                // i knows j → i cannot be celebrity
                stack.push(j);
            } else {
                // i does not know j → j cannot be celebrity
                stack.push(i);
            }
        }

        // Potential celebrity
        int celeb = stack.pop();

        // Verify
        for (int i = 0; i < n; i++) {
            if (i != celeb) {
                // celeb should not know i && everyone should know celeb
                if (arr[celeb][i] == 1 || arr[i][celeb] == 0) {
                    return -1;
                }
            }
        }

        return celeb;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };

        int celebrity = findCelebrity(arr);

        if (celebrity == -1) {
            System.out.println("No Celebrity");
        } else {
            System.out.println("Celebrity is person " + celebrity);
        }
    }
}

