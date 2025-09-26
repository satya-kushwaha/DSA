package Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int n = height.length;
        int mixWater=0,area=0,heights=0,weight=0;
   //     Brute force
/*        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                 weight = j-i;
                 heights=Math.min(height[i],height[j]);
                 area= weight * heights;
                 mixWater = Math.max(mixWater,area);
            }
        }
        System.out.println(mixWater);*/
// optimize // tow pointer Approach
        int start=0,end=n-1;
        while (start<end){
            weight=end-start;
            heights=Math.min(height[start],height[end]);
            area = weight * heights;
            mixWater = Math.max(mixWater,area);
            if(height[start] < height[end]){
                start++;
            }else {
                end--;
            }
        }
        System.out.println(mixWater);
    }
}
