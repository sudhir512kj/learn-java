package operatorsAndExpressions;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 14, b = 5;
        float c = (float)a / b;
        int r = a % b;

        System.out.println("a / b = " + c); // Division
        System.out.println("a % b = " + r); // Modulus

        float f1 = 14.3f, f2 = 3.2f;
        float fr = f1 % f2;
        System.out.println("f1 % f2 = " + fr);

        byte b1 = 10;
        short s1 = 15;
        int res1 = b1 + s1; // Implicit conversion from byte and short to int

        System.out.println("b1 + s1 = " + res1); // The Result is int

    }
}
