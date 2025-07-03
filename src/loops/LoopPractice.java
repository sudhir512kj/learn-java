package loops;

public class LoopPractice {
    public static void main(String[] args) {
        // For loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop example
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop example
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);

        // Nested loops example
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 2; n++) {
                System.out.println("Nested loop iteration: m=" + m + ", n=" + n);
            }
        }
    }
}
