package innerClasses;

class Outer2 {
    void display() {
        class Inner {
            void innerDisplay() {
                System.out.println("Hello");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.display();
    }
}
