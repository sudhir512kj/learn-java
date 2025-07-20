package ioStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferStreamsDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/ioStreams/Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.println("File: " + fis.markSupported());
        System.out.println("Buffer: " + bis.markSupported());

        int x;
        while ((x = bis.read()) != -1) {
            System.out.print((char) x);
        }

        BufferedInputStream bis2 = new BufferedInputStream(fis);

        System.out.println((char) bis2.read());
        System.out.println((char) bis2.read());
        System.out.println((char) bis2.read());
        bis2.mark(10);
        System.out.println((char) bis2.read());
        System.out.println((char) bis2.read());
        bis2.reset();

        System.out.println((char) bis2.read());
        System.out.println((char) bis2.read());
    }
}
