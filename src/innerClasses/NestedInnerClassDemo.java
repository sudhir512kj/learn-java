package innerClasses;

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
        System.out.println("outer_x = " + outer_x);
        System.out.println("inner.y = " + inner.y);
    }

    class Inner {
        int  y = 10;

        void display() {
            System.out.println("display: outer_x = " + outer_x);
            System.out.println("display: y = " + y);
        }
    }
}

public class NestedInnerClassDemo {
    public static void main(String[] args) {
        Outer  outer = new Outer();
        outer.test();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
