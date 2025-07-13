package oops;

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

public class CircleClass {
    public static void main(String[] args) {
        Circle c1 =  new Circle(5);
        c1.area();
        c1.perimeter();
        c1.circumference();
    }
}
