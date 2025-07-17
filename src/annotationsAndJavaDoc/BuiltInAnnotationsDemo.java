package annotationsAndJavaDoc;

@FunctionalInterface
interface MyFunctionalInterface {
    public void show();
}

class My<T> {
    @SafeVarargs
    private void show(T ...args) {
        for(T x: args)
            System.out.println(x);
    }
}

class A {
    public void display() {
        System.out.println("A class");
    }
}

class B extends A {
    @Override
    public void display() {
        System.out.println("B class");
    }

    @Deprecated
    public void show() {
        System.out.println("Deprecated B Class");
    }
}

public class BuiltInAnnotationsDemo {
    public static void main(String[] args) {
        int i;
        @SuppressWarnings("deprecation")

        B b = new B();
        b.show();
    }
}
