package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Copy2FilesToDestination {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream1 = new FileInputStream("src/ioStreams/Source1.txt");
        FileInputStream fileInputStream2 = new FileInputStream("src/ioStreams/Source2.txt");

        FileOutputStream fileOutputStream = new FileOutputStream("src/ioStreams/Destination.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);

        int b;
        while ((b = sequenceInputStream.read()) != -1) {
                fileOutputStream.write(b);
        }

        sequenceInputStream.close();
        fileInputStream2.close();
        fileInputStream1.close();
        fileOutputStream.close();
    }
}
