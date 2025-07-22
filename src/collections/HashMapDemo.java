package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        hm.put(4, "E");
        hm.put(5, "F");

        // Map.Entry<Integer, String> e = tm.firstEntry();

        // System.out.println(e.getKey() + ": " + e.getValue());
        // System.out.println(tm.ceilingEntry(5).getValue());
        System.out.println(hm);
    }
}
