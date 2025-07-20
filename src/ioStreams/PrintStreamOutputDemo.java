package ioStreams;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student {
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamOutputDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/ioStreams/Student.txt");
        PrintStream ps = new PrintStream(fos);

        Student s1 = new Student();
        s1.rollNo = 10;
        s1.name = "John";
        s1.dept = "CSE";

        ps.println(s1.rollNo);
        ps.println(s1.name);
        ps.println(s1.dept);

        ps.close();
        fos.close();
    }
}
