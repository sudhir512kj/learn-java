package langPackage;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        Integer  i = Integer.valueOf("123");
        Integer a = 10;

        Byte b =  15;
        Byte c = Byte.valueOf("15");
        byte bb = 15;
        Byte d = Byte.valueOf(bb);

        Short s = Short.valueOf("123");

        Float f = Float.valueOf("123.5");
        Float g = 12.3f;

        Double h = Double.valueOf("123.5");

        Character ch = Character.valueOf('A');

        float x = f.floatValue();
        float y = f;

        int m = 10;
        Integer n = Integer.valueOf(m);
    }
}
