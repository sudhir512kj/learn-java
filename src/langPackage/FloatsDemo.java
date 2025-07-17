package langPackage;

public class FloatsDemo {
    public static void main(String[] args) {
        float a = 12.5f;
        Float b = 12.5f;

        System.out.println(b.equals(a));

        Float c = 12.5f/0;
        System.out.println(c.isInfinite());
        System.out.println(Float.POSITIVE_INFINITY == c);

        Float d = (float) Math.sqrt(-1);
        System.out.println(d.isNaN());
    }
}
