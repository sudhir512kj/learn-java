package ioStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// This class should implement Serializable interface and there should be a default constructor defined
// and static and transient values will not be serializable
class Student2 implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    private transient int t;

    public Student2() {}

    public Student2(int r, String n, float a, String d) {
        this.rollNo = r;
        this.name = n;
        this.avg = a;
        this.dept = d;
        Data=500;
        this.t=500;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                ", dept='" + dept + '\'' +
                ", t=" + t +
                '}';
    }
}

public class ObjectOutputStreamsDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/ioStreams/Student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student2 student2 = new Student2(10, "Sudhir", 89.5f, "CSE");

        oos.writeObject(student2);

        oos.close();
        fos.close();
    }
}
