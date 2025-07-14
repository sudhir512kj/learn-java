package abstractClasses;

abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

public class ShapeAbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle(2);
        Shape s1 = new Rectangle(5, 4);
        System.out.println(s.area());
        System.out.println(s.perimeter());
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}
