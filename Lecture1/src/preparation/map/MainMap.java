package preparation.map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Hello", "World");
        System.out.println(map.keySet());
        System.out.println(map.get("Hello"));

        System.out.println(map);
    }
}
