package dataTypes;

public class DataTypes2 {
    public static void main(String[] args) {
        byte b1 = 10; // 8 bits
        byte b2 = 0b1010; // 8 bits, binary representation
        byte b3 = 10;
        byte b4 = 0XA;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        long l = 999999999999L; // 64 bits, 'L' suffix indicates long type
        System.out.println("l = " + l);

        float f = 12.56f; // 32 bits, 'f' suffix indicates float type
        double d = 12.56;
        System.out.println("f = " + f);
        System.out.println("d = " + d);
    }
}
