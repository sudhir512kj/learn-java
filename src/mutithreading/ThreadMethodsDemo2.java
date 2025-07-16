package mutithreading;

class MyThread4 extends Thread {
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
        }
    }
}

public class ThreadMethodsDemo2 {
    public static void main(String[] args) throws Exception {
        MyThread4 mt4 =  new MyThread4();
        mt4.setDaemon(true);
        mt4.start();

        Thread  mainThread = Thread.currentThread();
        mainThread.join();
    }
}
