package operatorsAndExpressions;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double r1, r2;

        System.out.print("Enter the value of a, b, and c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double sqrt = Math.sqrt(b * b - 4 * a * c);
        r1 = (-b + sqrt) / (2.0 * a);
        r2 = (-b - sqrt) / (2.0 * a);

        System.out.println("Root 1: " + r1);
        System.out.println("Root 2: " + r2);
    }
}
