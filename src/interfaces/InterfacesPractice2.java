package interfaces;

interface Test {
    final static int X = 10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3() {
        System.out.println("Meth3 of Test");
    }
    private void meth9() {
        System.out.println("Meth9 of Test");
    }
    default void meth5() {
        System.out.println("Meth5 of Test");
        meth9();
    }
}

interface Test2 extends Test {
    void meth4();
}

class MyTest implements Test2 {
    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }

    public void meth4() {
        System.out.println("Meth4");
    }
}

public class InterfacesPractice2 {
    public static void main(String[] args) {
        System.out.println(Test.X);
        System.out.println(Test2.X);
        System.out.println(MyTest.X);
        Test.meth3();

        MyTest m = new MyTest();
        m.meth1();
        m.meth2();
        m.meth4();
        Test t = new MyTest();
        t.meth1();
        t.meth2();
    }
}
