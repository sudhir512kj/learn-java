package mutithreading;

class WhiteBoard {
    String text;
    int numberOfStudents = 0;
    int count = 0;

    public void attendance() {
        numberOfStudents++;
    }

    synchronized public void write(String t) {
        System.out.println("Teacher is writing " + t);
        while (count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        text = t;
        count = numberOfStudents;
        notifyAll();
    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String t = text;
        count--;
        if (count == 0) {
            notify();
        }
        return t;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;

    Teacher(WhiteBoard w) {
        wb = w;
    }

    public void run() {
        String[] notes = {"Java is a language", "It is OOPs", "It is platform independent", "It supports Thread", "end"};
        for (int i = 0; i < notes.length; i++) {
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread {
    String name;
    WhiteBoard wb;

    Student(String n, WhiteBoard w) {
        name = n;
        wb = w;
    }

    public void run() {
        wb.attendance();

        String text;
        do {
            text = wb.read();
            System.out.println(name + " Reading " + text);
        } while (!text.equals("end"));
    }
}

public class TeacherStudentsProblemSolution {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. John", wb);
        Student s2 = new Student("2. Ajay", wb);
        Student s3 = new Student("3. Kloob", wb);
        Student s4 = new Student("4. Smith", wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
