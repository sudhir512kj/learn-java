package arrays;

public class Array1DPractice {
    public static void main(String[] args) {
        int []A = new int[10]; // Declare and initialize an array of size 10

        int []B = {1, 2, 3, 4, 5}; // Declare and initialize an array with values

        int []C;
        C = new int[10];

        B[2] = 15;

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        for (int x : B) {
            System.out.println(x);
        }

        System.out.println(B); // This will print the reference of the array, not its contents

    }
}
