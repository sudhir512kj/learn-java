package ioStreams;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("src/ioStreams/Data.txt", "rw");

        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        raf.write('d');
        System.out.println((char) raf.read());
        raf.skipBytes(3);
        System.out.println((char) raf.read());
        raf.seek(3);
        System.out.println((char) raf.read());
        System.out.println(raf.getFilePointer());
        raf.seek(raf.getFilePointer() + 2);
        System.out.println((char) raf.read());
    }
}
