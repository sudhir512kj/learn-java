package lambdaExpressions;

@FunctionalInterface
interface MyLambda {
    void display();
}

public class LambdaDemo1 {
    public static void main(String[] args) {
        MyLambda m = () -> {
            System.out.println("Hello World");
        };
        m.display();
    }
}
