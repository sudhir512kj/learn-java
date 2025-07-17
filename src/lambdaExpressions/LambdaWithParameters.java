package lambdaExpressions;

@FunctionalInterface
interface MyLambda2 {
    void display(String str);
}

public class LambdaWithParameters {
    public static void main(String[] args) {
        MyLambda2 ml2 = (str) -> {
            System.out.println(str);
        };
        ml2.display("Hello World");
    }
}
