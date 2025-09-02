package Stack;

import java.util.Stack;

//Previous Smaller Element
public class PreSmallerE {
    public static void main(String[] args) {
        int[] arr = {3,1,0,8,6};
        int[] ans = new int[arr.length];
        Stack<Integer> sta = new Stack<>();
        for(int i=0;i<arr.length ;i++){
               while(!sta.empty() && sta.peek() >= arr[i]){
                   sta.pop();
               }
               if(sta.empty()){
                   ans[i] = -1;
               }else {
                   ans[i] =  sta.peek();
               }
               sta.push(arr[i]);
        }
        for(int val : ans){
            System.out.print(val+"\t");
        }
        System.out.println();
    }
}
