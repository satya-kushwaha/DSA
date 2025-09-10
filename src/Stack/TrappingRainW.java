package Stack;

//Trapping Rain Water Problem

import java.util.Vector;

public class TrappingRainW {
    public static void main(String[] args) {
        int[] height= {4,2,0,3,2,5};
        int ans = 0;
/*        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        lmax[0]= height[0];
        rmax[height.length-1]= height[height.length-1];
        for(int i=1;i<height.length;i++){
                lmax[i]= Math.max(lmax[i-1],height[i]);
        }
        for(int i=height.length-2;i >=0;i--){
                rmax[i]= Math.max(rmax[i+1],height[i]);

        }
        for(int i=0;i<height.length;i++){
            ans +=Math.min(lmax[i],rmax[i])-height[i];
        }
        System.out.println("Trapping Rain Water Problem : " +ans);*/
        int l=0,r=height.length - 1;
        int lmax =0,rmax=0;
        while (l<r){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);
            if(lmax < rmax){
                ans += (lmax-height[l]);
                l++;
            }else {
                ans +=(rmax-height[r]);
                r++;
            }
        }
        System.out.println(ans);
    }
}
