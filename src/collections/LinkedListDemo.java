package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();

        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        ll1.add(10);
        ll1.add(1, 5);
        ll1.addAll(ll2);

        System.out.println(ll1);
        System.out.println(ll1.contains(50));
        System.out.println(ll1.get(5));
        System.out.println(ll1.indexOf(50));

        ll1.add(5, 70);
        System.out.println(ll1.lastIndexOf(70));

        ll1.set(6, 100);

        ll1.addFirst(3);
        ll1.addLast(200);

        for (int i = 0; i < ll1.size(); i++) {
            System.out.println(ll1.get(i));
        }

        for (Iterator<Integer> it = ll1.iterator(); it.hasNext(); ) {
            Integer x = it.next();
            System.out.println(x);
        }

        ll1.forEach(System.out::println);
        ll1.forEach(ArrayListDemo::show);
    }

    static void show(int n) {
        if (n > 60)
            System.out.println(n);
    }
}
