package Hashing;

import java.util.HashMap;
//vvi
public class FindItineraryFromTickets {
    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();

        // Reverse mapping: destination -> source
        for(String key : tick.keySet()){
            revMap.put(tick.get(key),key);
        }
        // Find the source not present as a destination (starting city)
        for(String key: tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tick = new HashMap<>();
        tick.put("Chennai","Bengaluru");
        tick.put("Mumbai","Delhi");
        tick.put("Goa","Chennai");
        tick.put("Delhi","Goa");

        // Note: Changed "Geo" to "Goa" in mapping for correctness
        String start = getStart(tick);
        while (  tick.containsKey(start) ){
            System.out.print(start+"->");
            start = tick.get(start);
        }
        // Print final destination city
            System.out.println(start);

    }
}
