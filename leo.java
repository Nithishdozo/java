import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        
        map.put("TN","Tamil Nadu");
        map.put("KA","Karnataka");
        map.put("KL","Kerala");
        
        
        System.out.println("Search");
        System.out.println(map.get("TN"));
        System.out.println(map.get("KL"));
        System.out.println(map.get("KA"));
        
        
        System.out.println("Search With Default");
        System.out.println(map.getOrDefault("GOA","Not Found"));
        
        System.out.println("Remove");
        map.remove("KA");
        
        System.out.println(map.get("KA"));
     
        System.out.println(map.keySet());
        System.out.println(map.values());
     
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        
        
        System.out.println(map.containsKey("GOA"));
        System.out.println(map.containsValue("Tamil Nadu"));
        
        System.out.println(map.size());
       
        System.out.println(map.isEmpty());
        
    }
