package innerClasses;

class OuterClass {
    static int outer_x = 10;

    int outer_y = 20;

    private static void outerMethod() {
        System.out.println("inside outerMethod");
    }

    static class StaticInnerClass {
        void display() {
            System.out.println("outer_x: " + outer_x);
            outerMethod();
        }
    }
}

public class StaticInnerClassDemo {
    public static void main(String[] args) {
        OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
        inner.display();
    }
}
