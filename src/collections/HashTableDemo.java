package collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        // By default, key and value are stored in Object Type
        String s = (String) ht.get(3);
        System.out.println(s);

        // Iterator is not available for HashTable
        Enumeration<String> e = ht.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        System.out.println(ht);

        ht.compute(2, (k, v) -> v + "Z");

        System.out.println(ht.get(2));

        ht.computeIfAbsent(7, (k) -> "Z" + k);

        System.out.println(ht);
    }
}
