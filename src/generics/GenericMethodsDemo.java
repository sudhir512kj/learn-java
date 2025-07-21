package generics;

class A {}
class B extends A {}
class C extends B {}

public class GenericMethodsDemo {
    static <E> void show(E[] list) {
        for (E x: list)
            System.out.println(x);
    }

    static void fun(MyArray<?> obj) {
        obj.display();
    }

    static void fun2(MyArray<? extends Number> obj) {
        obj.display();
    }

    static void fun3(MyArray<? super B> obj) {
        obj.display();
    }

    public static void main(String[] args) {
        show(new String[]{"Hi", "Go", "Bye"});
        show(new Integer[]{10, 20, 30});

        MyArray<String> ma1 = new MyArray<>();
        ma1.append("Hi");
        ma1.append("Bye");

        MyArray<Integer> ma2 = new MyArray<>();
        ma2.append(10);
        ma2.append(20);

        fun(ma1);
        fun(ma2);

        fun2(ma2);

        MyArray<A> ma3 = new MyArray<>();
        ma3.append(new A());
        ma3.append(new A());

        fun3(ma3);
    }
}
