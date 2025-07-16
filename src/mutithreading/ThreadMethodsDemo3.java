package mutithreading;

class MyThread5 extends Thread {
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ + " My Thread");
        }
    }
}

public class ThreadMethodsDemo3 {
    public static void main(String[] args) throws Exception {
        MyThread5 mt5 =  new MyThread5();
        mt5.start();

        int count = 1;
        while (true) {
            System.out.println(count++ + " Main Thread");
            Thread.yield();
        }
    }
}
