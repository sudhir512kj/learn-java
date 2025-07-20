package ioStreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/ioStreams/Test.txt");
        BufferedReader bis2 = new BufferedReader(fr);

        System.out.println((char) bis2.read());
        System.out.println((char) bis2.read());
        System.out.println((char) bis2.read());
        bis2.mark(10);
        System.out.println((char) bis2.read());
        System.out.println((char) bis2.read());
        bis2.reset();

        System.out.println((char) bis2.read());
        System.out.println((char) bis2.read());

        System.out.println("String: " + bis2.readLine());
    }
}
