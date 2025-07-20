package ioStreams;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/ioStreams/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student s = new Student();
        s.rollNo = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();

        System.out.println("Roll No: " + s.rollNo + ", Name: " + s.name + ", Dept: " + s.dept);

        dis.close();
        fis.close();
    }
}
