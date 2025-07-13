package methods;

public class VariableArgumentsDemo {
    static int sum(int ...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
