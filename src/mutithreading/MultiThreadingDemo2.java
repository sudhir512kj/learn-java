package mutithreading;

class MyThread2 implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i < 30) {
            System.out.print(i + " Hello");
            i++;
        }
    }
}

public class MultiThreadingDemo2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread t2 = new Thread(mt);
        t2.start();
        int i = 1;
        while (i < 15) {
            System.out.print(i + " World");
            i++;
        }
    }
}
