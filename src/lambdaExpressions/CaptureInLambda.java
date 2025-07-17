package lambdaExpressions;

interface MyLambda3 {
    void display();
}

class Demo {
    int temp = 10;
    public void method1() {
        int count = 0;
        MyLambda3 ml3 = () -> {
            System.out.println("Hi");
            System.out.println("Bye " + count);
            // any variable from method1 is can't be modified here, it should be either final
            // or effectively final
            System.out.println("Tata " + (++temp)); // instance variables can be modified
        };
        ml3.display();
    }
}

class UseLambda {
    public void callLambda(MyLambda3 ml) {
        ml.display();
    }
}

class Demo2 {
    public void method1() {
        UseLambda ul = new UseLambda();
        ul.callLambda(() -> {
            System.out.println("Hello");
        });
    }
}

public class CaptureInLambda {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method1();

        Demo2 demo2 = new Demo2();
        demo2.method1();
    }
}
