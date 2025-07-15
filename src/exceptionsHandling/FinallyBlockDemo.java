package exceptionsHandling;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Catch block");
            System.out.println(e);
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Outside try-catch-finally");
    }
}
