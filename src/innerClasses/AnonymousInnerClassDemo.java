package innerClasses;

abstract class My {
    abstract public void show();
}

// We can also use interface in place of abstract class

class Outer3 {
    public void meth3() {
        My m = new My() {
            public void show() {
                System.out.println("Hello");
            }
        };
        m.show();
    }
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Outer3 outer3 =  new Outer3();
        outer3.meth3();
    }
}
