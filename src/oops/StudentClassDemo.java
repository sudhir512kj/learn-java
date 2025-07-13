package oops;

class Student {
    int roll;
    String name;
    String course;
    int m1, m2, m3;

    public Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    public Student(int roll, String name, String course, int m1, int m2, int m3) {
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String getMarks() {
        return "Marks: " + m1 + ", " + m2 + ", " + m3;
    }

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 70) return 'A';
        else if (average() >= 60) return 'B';
        else if (average() >= 50) return 'C';
        else if (average() >= 40) return 'D';
        else return 'E';
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}

public class StudentClassDemo {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "CS");
        Student student2 = new Student(2, "Jane", "CS", 80, 90, 100);
        System.out.println("Student 1: " + student1);
        System.out.println(student1.total());
        System.out.println(student1.average());
        System.out.println(student1.grade());
        System.out.println("Student 2: " + student2);
        System.out.println(student2.total());
        System.out.println(student2.average());
        System.out.println(student2.grade());
    }
}
