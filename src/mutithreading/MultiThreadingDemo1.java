package mutithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i < 30) {
            System.out.print(i + " Hello");
            i++;
        }
    }
}

public class MultiThreadingDemo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        int i = 1;
        while (i < 15) {
            System.out.print(i + " World");
            i++;
        }
    }
}
