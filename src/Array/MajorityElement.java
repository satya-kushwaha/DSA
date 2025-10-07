package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//The majority element is the element that appears more than [n/2] times.

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,1,1,1};
        int n = arr.length;

        int fre=1,an=0;
        //Brute force O(n^2)
/*        for(int i=0;i<n;i++){
            int freq=1;
            for (int j=i+1;j<n;j++){
                if (arr[i] == arr[j]){
                    freq++;
                }
            }
            if(freq > n/2){
                System.out.println("Majority Element "+arr[i]);
                return;
            }
        }*/

       //sort O(n log n)
        Arrays.sort(arr);
        int ans=0;
        int frequancy=1;
     /*   for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                frequancy++;
            }else {
                frequancy =1;
                ans=arr[i];
            }
            if(frequancy> n/2){

            }
        }*/
        //Moore's voting Algorithm O(n)
/*        int frequancy =1, ans = 0;
        for(int i=0;i< arr.length;i++){
            if(frequancy == 1){
                ans=arr[i];
            }
            if(ans == arr[i]) {
                frequancy++;
            }
            else {frequancy--;}
        }
        System.out.println("Frequancy "+ans);*/
    }
}
