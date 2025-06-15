package operatorsAndExpressions;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        int totalArea, volume;

        System.out.print("Enter the length, breadth, and height of the cuboid: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        // Calculate total surface area and volume
        totalArea = 2 * (length * breadth + breadth * height + height * length);
        volume = length * breadth * height;

        // Display the results
        System.out.println("Total Surface Area: " + totalArea);
        System.out.println("Volume: " + volume);
    }
}
