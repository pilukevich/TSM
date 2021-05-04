package p7;

import java.util.HashMap;
import java.util.Map;

/**
 * https://habr.com/ru/post/421179/
 * https://devcolibri.com/hashmap-и-hashset-что-это-на-самом-деле/
 */
public class Practice {
    public static void main(String[] args) {
        Map<Key, Integer> map = new HashMap<>();
        map.put(new Key("vishal"), 20);
        map.put(new Key("sachin"), 30);
        map.put(new Key("vaibhav"), 40);
//        ((HashMap.Node[])((HashMap) map).table).;
        System.out.println(map);
        System.out.println();
        System.out.println("Value for key sachin: " + map.get(new Key("sachin")));
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav")));
    }
}
