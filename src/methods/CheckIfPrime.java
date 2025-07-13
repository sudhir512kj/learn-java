package methods;

public class CheckIfPrime {
    static boolean ifPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    public static void main(String[] args) {
        System.out.println(ifPrime(7));
    }
}
