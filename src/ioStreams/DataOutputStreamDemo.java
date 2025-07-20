package ioStreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/ioStreams/Student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.name = "John";
        s.dept = "CSE";

        dos.writeInt(s.rollNo);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();
    }
}
