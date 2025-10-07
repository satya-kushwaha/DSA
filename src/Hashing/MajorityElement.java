package Hashing;


import java.util.HashMap;
import java.util.Map;

//Give an integer array of size n, find all elements that appear more than [n/3] times
//num[] = {1,3,2,5,1,3,1,5,1}       //1
//num[] = {1,2} // 1, 2
public class MajorityElement {
    public static void main(String[] args) {
        int[] num={1,3,2,5,1,3,1,5,1};
//        int[] num={1,2};
        int n = num.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(num[i]) ){//true
                map.put(num[i],map.get(num[i])+1);
            }else {//false
                map.put(num[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
//        for(Map.Entry<Integer,Integer> e : map.entrySet()){
//            System.out.println(e.getKey()+"\t"+e.getValue()+"\t");
//        }
    }
}
