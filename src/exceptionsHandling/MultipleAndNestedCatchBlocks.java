package exceptionsHandling;

public class MultipleAndNestedCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] a = {10, 0, 8, 3, 5};
            int r;
            r = a[0] / a[1];
            System.out.println("Result: " + r);
            System.out.println(a[10]);

            // Nested try-catch block
            try {
                if (a[1] == 0) {
                    throw new ArithmeticException("Division by zero");
                }
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
