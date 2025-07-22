package collections;

import java.util.Arrays;
import java.util.Comparator;

class MyIntegerCompare implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2)
            return 1;
        else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class ArraysAndComparatorDemo {
    public static void main(String[] args) {
        int []a = {2, 4, 6, 8, 1, 3, 5, 7};
        int []b = {2, 4, 6, 8, 1, 3, 5, 7};

        System.out.println(Arrays.compare(a, b));

        int []c = Arrays.copyOf(a, 4);
        System.out.println(Arrays.toString(c));

        Arrays.fill(c, 10);
        System.out.println(Arrays.toString(c));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a, 2));
    }
}
