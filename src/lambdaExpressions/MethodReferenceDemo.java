package lambdaExpressions;

interface MyLambda4 {
    void display(String str);
}

public class MethodReferenceDemo {
    public MethodReferenceDemo() {}

    public MethodReferenceDemo(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void helloName(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        MyLambda4 ml = System.out::println;
        ml.display("Hello");

        MyLambda4 ml2 = MethodReferenceDemo::reverse;
        ml2.display("Hello");

        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        MyLambda4 ml3 = methodReferenceDemo::helloName;
        ml3.display("Sudhir");

        MyLambda4 ml4 = MethodReferenceDemo::new;
        ml4.display("hello");
    }
}
