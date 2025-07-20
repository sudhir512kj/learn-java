package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyAFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src/ioStreams/Source1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src/ioStreams/Source2.txt");

        int b;
        while ((b = fileInputStream.read()) != -1) {
            if (b >= 65 && b <= 120)
                fileOutputStream.write(b + 32);
            else
                fileOutputStream.write(b);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
