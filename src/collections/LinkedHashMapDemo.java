package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true);

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");

        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(1);
        lhm.put(6, "F");

        lhm.forEach((k, v) -> System.out.println(k + ": " + v));

        LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<>(5, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;
            }
        };

        lhm2.put(1, "A");
        lhm2.put(2, "B");
        lhm2.put(3, "C");
        lhm2.put(4, "D");
        lhm2.put(5, "E");
        lhm2.put(6, "F");

        System.out.println("lhm2: ");
        lhm2.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
