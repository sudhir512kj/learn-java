package operatorsAndExpressions;

public class BitwiseMaskingSwapping {
    public static void main(String[] args) {
        int a = 10, b = 15;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        byte x = 9, y = 12;
        byte z;
        z = (byte) (x << 4);
        z = (byte) (z | y);

        System.out.println((z & 0b11110000) >> 4); // Masking to get the upper 4 bits
        System.out.println(z & 0b00001111); // Masking to get the lower 4 bits
    }
}
