import java.util.Scanner;

public class ReadFromKeyboard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter two numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + c);

        // Consume the leftover newline character
        s.nextLine();

        String name;
        System.out.print("Enter your name: ");
        name = s.nextLine();
        System.out.println("Hello, " + name + "!");

        s.useRadix(2);
        int d = s.nextInt();
        System.out.println("The number is " + d);
    }
}
