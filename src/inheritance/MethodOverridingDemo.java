package inheritance;

class Parent {
    void m1() {
        System.out.println("Parent class m1 method");
    }
}

class Child extends Parent {

    void m1() {
        System.out.println("Child class m1 method");
    }

    void m2() {
        System.out.println("Child class m2 method");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent  p = new Parent();
        p.m1();
        Child c = new Child();
        c.m1();
        Parent p1 = new Child();
        p1.m1();
        // p1.m2(); Can't call m2 method here using Parent reference
    }
}
