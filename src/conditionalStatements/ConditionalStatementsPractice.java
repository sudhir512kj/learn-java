package conditionalStatements;

public class ConditionalStatementsPractice {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        System.out.println(a < b);
        System.out.println(a < b && a < c);
        System.out.println(a < b || a < c);

        int n = 5;
        if (n > 0) {
            System.out.println("n is positive");
        } else if (n < 0) {
            System.out.println("n is negative");
        } else {
            System.out.println("n is zero");
        }

        if (a > b && a > c) {
            System.out.println("a is the largest");
        } else if (b > a && b > c) {
            System.out.println("b is the largest");
        } else if (c > a && c > b) {
            System.out.println("c is the largest");
        } else {
            System.out.println("There is no unique largest number");
        }
    }
}
