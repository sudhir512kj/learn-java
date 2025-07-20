package ioStreams;

import java.io.File;
import java.io.FileOutputStream;

public class FileClassDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("src/ioStreams/Test.txt");
        System.out.println(f.exists());
        System.out.println(f.isDirectory());

        File f2 = new File("src/ioStreams");
        System.out.println(f.isDirectory());
        String[] list = f2.list();
        for (String s : list) {
            System.out.println(s);
        }

        File []listOfFiles = f2.listFiles();
        for (File file : listOfFiles) {
            System.out.println(file.getName() + " can write: " + file.canWrite() + " can read: " + file.canRead() + " is hidden: " + file.isHidden() + " length: " + file.length());
        }

        File f3 = new File("src/ioStreams/Temp.txt");
        f3.setWritable(true);
        // FileOutputStream fos = new FileOutputStream("src/ioStreams/Temp.txt");
    }
}
