package staticAndFinal;

// This class can't be extended, but we can create objects of this class
final class MyFinal {
    final int MIN = 1;
    static final int NORMAL;
    static {
        NORMAL = 10;
    }
    final int MAX;
    MyFinal() {
        MAX = 100;
    }

    // This method can't be overridden
    final void method1() {
        System.out.println("Hi");
    }
}

class My {
    final int MIN = 1;
    static final int NORMAL;
    static {
        NORMAL = 10;
    }
    final int MAX;
    My() {
        MAX = 100;
    }

    // This method can't be overridden
    final void method1() {
        System.out.println("Hi");
    }
}

public class FinalPractice1 {
    public static void main(String[] args) {
        My  m = new My();
    }
}
