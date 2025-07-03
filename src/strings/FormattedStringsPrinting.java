package strings;

public class FormattedStringsPrinting {
    public static void main(String[] args) {
        int a = 10;
        float b = 12.55f;
        char c = 'A';
        String str = "Java Programming";

        System.out.printf("Hello %d, %.2f, %c World \n", a, b, c); // Formatted output with placeholders
        System.out.printf("Hello %o \n", a); // Octal representation of integer
        System.out.printf("Hello %e \n", b); // Scientific notation of float
        System.out.printf("Hello %s \n", str); // String output
        System.out.printf("%1$d + %2$d = %3$d \n", a, a, a + a); // Using positional arguments
    }
}
