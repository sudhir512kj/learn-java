package oops;

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }

}

public class RectangleClassDemo {
    public static void main(String[] args) {
        Rectangle r1 =  new Rectangle(10, 5);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
