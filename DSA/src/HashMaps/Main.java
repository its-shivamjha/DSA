package HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //? HasmMap in java
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Shivam", 01);
        map.put("Shubham", 01);

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("Shivam"));

        //? Custom HashMap
        MapUsingHash map1 = new MapUsingHash();
        map1.put("Shivam", "Jha");
        map1.put("Shubham", "srivastava");
        System.out.println(map1.get(""));

    }
}
