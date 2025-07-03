package operatorsAndExpressions;

public class IncDec {
    public static void main(String[] args) {
        int x = 5, y;
        y = x++; // Post-increment: y gets the value of x, then x is incremented
        System.out.println("Post-increment: x = " + x + ", y = " + y); // x = 6, y = 5
        y = ++x; // Pre-increment: x is incremented first, then y gets the new value of x
        System.out.println("Pre-increment: x = " + x + ", y = " + y); // x = 7, y = 7
    }
}
