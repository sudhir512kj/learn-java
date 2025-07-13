package arrays;

public class IncreaseSizeOfArray {
    public static void main(String[] args) {
        int[] A = { 2, 4, 6, 8, 10 };
        int[] B = new int[2 * A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        A = B;
        B = null;

        for (int x : A) {
            System.out.println(x);
        }
    }
}
