package ioStreams;

import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/ioStreams/Test.txt");
            String str = "Learn Java Programming";

            // Write all bytes in once
            fileOutputStream.write(str.getBytes());

            // Write byte by byte data
            byte[] b = str.getBytes();
            for (byte x : b) {
                fileOutputStream.write(x);
            }

            // Write bytes in offset
            fileOutputStream.write(b, 6, str.length() - 6);

            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e);
        } catch (IOException e) {
            System.out.println("Data not input to file: " + e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("src/ioStreams/Test.txt");

            // Read data in once
            byte []b = new byte[fileInputStream.available()];
            fileInputStream.read(b);
            String str = new String(b);

            System.out.println(str);

            // Read data byte by byte
            int x;

            do {
                x = fileInputStream.read();
                if (x != -1)
                    System.out.print((char) x);
            } while (x != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e);
        } catch (IOException e) {
            System.out.println("Data not available to output: " + e);
        }

        try {
            FileReader fileReader = new FileReader("src/ioStreams/Test.txt");

            int x;
            while ((x = fileReader.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e);
        } catch (IOException e) {
            System.out.println("Data not available to output: " + e);
        }
    }
}
