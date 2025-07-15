package exceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsHandling {
    static void fun1() throws FileNotFoundException {
        try {
            FileInputStream  ptr = new FileInputStream("MyFile.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static void fun2() throws FileNotFoundException {
        fun1();
    }

    static void fun3() throws FileNotFoundException {
        fun2();
    }

    public static void main(String[] args) throws FileNotFoundException {
        fun3();
    }
}
