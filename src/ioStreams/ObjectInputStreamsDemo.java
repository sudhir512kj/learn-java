package ioStreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamsDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/ioStreams/Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student2 student2 = (Student2) ois.readObject();

        System.out.println(student2);

        ois.close();
        fis.close();
    }
}
