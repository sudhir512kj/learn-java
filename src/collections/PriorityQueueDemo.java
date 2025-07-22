package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

// Optional custom Comparator
class MyComp implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        else if (o1 > o2)
            return -1;
        else
            return 0;
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek());

        pq.forEach(System.out::println);

        pq.poll();
        System.out.println("After Deletion: ");
        pq.forEach(System.out::println);
    }
}
