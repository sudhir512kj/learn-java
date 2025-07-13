package oops;

class Cylinder {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }

    public double volume() {
        return lidArea() * height;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class CylinderClassDemo {
    public static void main(String[] args) {
        Cylinder cl1 =  new Cylinder(5, 10);
        System.out.printf("Lid Area: %f\n", cl1.lidArea());
        System.out.printf("Total Surface Area:  %f\n", cl1.totalSurfaceArea());
        System.out.printf("Volume:  %f\n", cl1.volume());
        System.out.printf("Circumference: %f\n", cl1.circumference());
    }
}
