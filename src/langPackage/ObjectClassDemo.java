package langPackage;

class MyObject {
    public String toString() {
        return "MyObject";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.getClass().getName());

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
}
