package staticAndFinal;

class Test {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println(x + " " + y);
    }

    static void display() {
        System.out.println(x);
    }
}

public class StaticPractice1 {
    public static void main(String[] args) {
        System.out.println(Test.x);
        Test.display();
    }
}
