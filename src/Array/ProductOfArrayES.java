package Array;

import java.util.Vector;

//Product of array Except Self
public class ProductOfArrayES {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};//ans = {24,12,8,6}
        int[] ans = new int[nums.length];
        int a=1;
        //Brute Force
     /*   for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i != j){
                    product *= nums[j];
//                    ans[i]*=nums[j];
                }
            }
            ans[i]=product;
        }*/

    /*    int[] prefix = new int[nums.length];
        prefix[0]=1;
        int[] suffix = new int[nums.length];
        suffix[nums.length-1]=1;*/
//        int prefix = 1;
        int suffix = 1;
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
//             prefix[i] *= prefix[i-1] * nums[i-1];
            ans[i]=ans[i-1] * nums[i-1];
        }
        for(int j =nums.length-1;j>=0;j--){
//            suffix[j] *= suffix[j+1] * nums[j+1];
            ans[j] *=suffix;
            suffix *= nums[j];
        }
//        for(int i=0;i<nums.length;i++){
//            ans[i]=prefix[i] * suffix[i];
//        }

        System.out.println("Out put");
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+"->");
        }
    }
}
