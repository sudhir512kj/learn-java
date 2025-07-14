package inheritance;

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of circle is " + (Math.PI * radius * radius));
    }

    public void perimeter() {
        System.out.println("Perimeter of circle is " + (2 * Math.PI * radius));
    }

    public void circumference() {
        System.out.println("Circumference of circle is " + (2 * Math.PI * radius));
    }
}

class Cylinder extends Circle {
    int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public void volume() {
        System.out.println("Volume of cylinder is " + (Math.PI * radius * radius * height));
    }

    @Override
    public void area() {
        System.out.println("Area of cylinder is " + ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius)));
    }
}

public class InheritancePractice {
    public static void main(String[] args) {
        Cylinder cylinder1 =  new Cylinder(5, 10);
        cylinder1.area();
        cylinder1.volume();
    }
}
