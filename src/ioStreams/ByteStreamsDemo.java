package ioStreams;

import java.io.ByteArrayInputStream;

public class ByteStreamsDemo {
    public static void main(String[] args) throws Exception {
        byte []b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);

        // Read byte by byte
        int x;
        while ((x = byteArrayInputStream.read()) != -1) {
            System.out.println((char)x);
        }

        System.out.println(byteArrayInputStream.markSupported());

        // Read at once
        String str = new String(byteArrayInputStream.readAllBytes());
        System.out.println(str);

        byteArrayInputStream.close();
    }
}
