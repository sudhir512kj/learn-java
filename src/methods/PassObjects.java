package methods;

public class PassObjects {
    static void change(int []A, int index, int value) {
        A[index] = value;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10};
        System.out.println(A[0]);

        change(A, 0, 5);
        System.out.println(A[0]);
    }
}
