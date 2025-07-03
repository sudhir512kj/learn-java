package operatorsAndExpressions;

public class BitwiseDemo {
    public static void main(String[] args) {
        int x = 10, y = 6, z;
        z = x & y;
        System.out.println("x & y = " + z); // Bitwise AND

        z = x | y;
        System.out.println("x | y = " + z); // Bitwise OR

        z = x ^ y;
        System.out.println("x ^ y = " + z); // Bitwise XOR

        z = ~x;
        System.out.println("~x = " + z); // Bitwise NOT

        z = x << 1;
        System.out.println("x << 1 = " + z); // Left shift

        z = x >> 1;
        System.out.println("x >> 1 = " + z); // Right shift

        x = -0b1010; // Binary representation of -10
        y = x >>> 1; // Unsigned right shift
        System.out.println("x >>> 1 = " + y); // Unsigned right shift
        System.out.println(String.format("%s", Integer.toBinaryString(x)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0'));
    }
}
