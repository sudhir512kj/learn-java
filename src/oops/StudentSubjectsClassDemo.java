package oops;

import java.util.Arrays;

class Student2 {
    private int rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

    public Student2(int rollNo, String name, String dept, Subject[] subjects) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public int getTotal() {
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getMarksObtain();
        }
        return total;
    }

    public String toString() {
        return "Student2{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}

class Subject {
    // generate this class with properties - subID, name, maxMarks, marksObtain
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID, String name, int marksObtain) {
        this.subID = subID;
        this.name = name;
        this.marksObtain = marksObtain;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    boolean isQualified() {
        return marksObtain >= maxMarks / 10 * 4;
    }
}

public class StudentSubjectsClassDemo {
    public static void main(String[] args) {
        Student2 student1 = new Student2(1, "John", "CS", new Subject[]{
                new Subject("CS101", "DS", 92),
                new Subject("CS102", "Algorithms", 80),
                new Subject("CS103", "OS", 65),
                new Subject("CS104", "DBMS", 70)
        });

    }
}
