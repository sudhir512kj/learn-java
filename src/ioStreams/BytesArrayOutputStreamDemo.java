package ioStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class BytesArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
        byteArrayOutputStream.write('a');
        byteArrayOutputStream.write('b');
        byteArrayOutputStream.write('c');
        byteArrayOutputStream.write('d');
        byteArrayOutputStream.write('e');

        byte []b = byteArrayOutputStream.toByteArray();

        for (byte x: b)
            System.out.println((char) x);

        byteArrayOutputStream.write('a');
        byteArrayOutputStream.write('b');
        byteArrayOutputStream.write('c');
        byteArrayOutputStream.write('d');
        byteArrayOutputStream.write('e');

        byteArrayOutputStream.writeTo(new FileOutputStream("src/ioStreams/ByteArrayOutput.txt"));

        byteArrayOutputStream.close();
    }
}
