package exceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourcesExceptionHandlingDemo {
    static FileInputStream fi;
    static Scanner sc;

    static void Divide() throws Exception {
        fi = new FileInputStream("MyFile.txt");

        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a / b);

        fi.close();
        sc.close();
    }

    static void Divide2() throws Exception {
        try (FileInputStream fi =  new FileInputStream("MyFile.txt"); Scanner sc = new Scanner(fi)) {
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                System.out.println(a / b);
            } finally {
                fi.close();
                sc.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Divide();
        Divide2();
    }
}
