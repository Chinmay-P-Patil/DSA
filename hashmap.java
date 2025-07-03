import java.util.*;

public class hashmap {

    //internally hashmap is a array of linked list




    public static void main(){
        //key and value 
        //key is unique

        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map.containsKey("US"));
        System.err.println(map.get("US"));

        System.err.println(map);

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.err.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.err.println(key + " " + map.get(key));
        }


    }
}
