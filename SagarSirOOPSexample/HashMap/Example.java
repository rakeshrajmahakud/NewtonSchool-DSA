package Introduction.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("aaa", 2);
        map.put("bbb", 1);
        map.put("Aa", 100);
        map.put("ccc", 3);
        map.put("BB", 12);
        map.put("key1", 22);
        map.put("key2", 32);
        map.put("key3", 42);
        map.put("key4", 52);
        map.put("key5", 62);
        map.put("key6", 72);
        map.put("key7", 82);
        map.put("key8", 92);

        System.out.println(map);
    }
}
