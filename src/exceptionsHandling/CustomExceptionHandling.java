package exceptionsHandling;

class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class CustomExceptionHandling {
    static void fun1() {
        try {
            throw new LowBalanceException();
        }
        catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    static void fun2() {
        fun1();
    }

    public static void main(String[] args) {
        fun2();
    }
}
