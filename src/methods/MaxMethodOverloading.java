package methods;

public class MaxMethodOverloading {
    static int  max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        int  a = 10, b = 15;
        float c = 12.3f, d = 12.5f;
        System.out.println(max(a, b));
        System.out.println(max(c, d));
    }
}
