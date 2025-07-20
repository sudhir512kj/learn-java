package ioStreams;

import java.io.*;

public class PrintStreamInputDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/ioStreams/Student.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student s1 = new Student();
        s1.rollNo = Integer.parseInt(br.readLine());
        s1.name = br.readLine();
        s1.dept = br.readLine();

        System.out.println("Roll No: " + s1.rollNo + " Name: " + s1.name + " Dept: " + s1.dept);

        br.close();
        fis.close();
    }
}
