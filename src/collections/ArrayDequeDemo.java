package collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq1 = new ArrayDeque<>();

        dq1.offerLast(10);
        dq1.offerLast(20);
        dq1.offerLast(30);
        dq1.offerLast(40);

        dq1.offerFirst(1);
        dq1.offerFirst(2);
        dq1.offerFirst(3);
        dq1.offerFirst(4);

        dq1.forEach(System.out::println);
        System.out.println();

        dq1.pollLast();

        dq1.forEach(System.out::println);
    }
}
