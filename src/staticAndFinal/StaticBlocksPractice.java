package staticAndFinal;

class Test2 {
    static {
        System.out.println("Test Static block-1");
    }

    static {
        System.out.println("Test Static block-2");
    }
}

public class StaticBlocksPractice {
    static {
        System.out.println("Main Static block-1");
    }

    public static void main(String[] args) {
        Test2 test2 =  new Test2();
        System.out.println("Main method");
    }

    static {
        System.out.println("Main Static block-2");
    }
}
