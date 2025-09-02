package Stack;

import java.util.Stack;

// Largest Rectangle in Histogram
public class LRH {
    public static void  main(String[] args) {
        int[] height= {2,1,5,6,2,3};
        int[] right = new int[height.length];
        int[] left = new int[height.length];
        Stack<Integer> sta = new Stack<>();

        // Calculate right smaller element
        for(int i = height.length -1 ; i >=0; i--){
            while (!sta.isEmpty() && height[sta.peek()] >= height[i]){
                sta.pop();
            }
            right[i]  = sta.isEmpty() ? height.length : sta.peek(); // ✅ boundary is height.length
            sta.push(i);
        }

        sta.clear();

        // Calculate left smaller element
        for(int j =0;j < height.length  ;j++){
            while (!sta.isEmpty() && height[sta.peek()] >= height[j]){
                sta.pop();
            }
            left[j]  = sta.isEmpty() ? -1 : sta.peek(); // ✅ boundary is -1
            sta.push(j);
        }

        int ans = 0;
        int[] arr = new int[height.length];
        for(int i =0; i < height.length; i++ ){   // ✅ process all bars
            int width = right[i] - left[i] -1;
            int cuArea = height[i] * width;
            arr[i] = cuArea;
            ans = Math.max(ans, cuArea);

        }
        System.out.println("Answer : "+ans);
        for(int i =0 ;i < height.length ;i++){
            System.out.print(arr[i ]+"\t");
        }
        System.out.println();
    }
}
