package strings;

public class StringPrinting {
    public static void main(String[] args) {
        int a = 10;
        float b = 12.55f;
        char c = 'A';
        String str = "Java Programming";
        int x = 10, y = 20;

        System.out.println(a); // Prints integer
        System.out.println(b); // Prints float
        System.out.println(c); // Prints character
        System.out.println(str); // Prints string
        System.out.println("Integer: " + a); // Concatenation with string
        System.out.println(x + y + " Sum of x and y is: " + (x + y)); // Concatenation with arithmetic operation
        System.out.println("Sum of x and y is: " + x + y); // Concatenation without parentheses will not evaluate the sum first
        System.out.println("Sum of x and y is: " + (x + y)); // Correctly evaluates the sum first
    }
}
