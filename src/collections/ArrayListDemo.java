package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(al2);

        System.out.println(al1);
        System.out.println(al1.contains(50));
        System.out.println(al1.get(5));
        System.out.println(al1.indexOf(50));

        al1.add(5, 70);
        System.out.println(al1.lastIndexOf(70));

        al1.set(6, 100);
        for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }

        for (Iterator<Integer> it = al1.iterator(); it.hasNext(); ) {
            Integer x = it.next();
            System.out.println(x);
        }

        al1.forEach(System.out::println);
        al1.forEach(ArrayListDemo::show);
    }

    static void show(int n) {
        if (n > 60)
            System.out.println(n);
    }
}
