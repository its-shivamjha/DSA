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
    }
}
