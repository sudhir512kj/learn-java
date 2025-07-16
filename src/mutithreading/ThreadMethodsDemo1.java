package mutithreading;

class MyRun implements Runnable {
    public void run() {
        System.out.println("child thread");
    }
}

class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        int count = 1;

        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethodsDemo1 {
    public static void main(String[] args) throws Exception {
        // Thread t =  new Thread(new MyRun(), "My Run Thread 1");
        MyThread3 mt = new MyThread3("My Thread 2");
        System.out.println("ID: " + mt.threadId());
        System.out.println("Name: " + mt.getName());
        System.out.println("Priority: " + mt.getPriority());
        System.out.println("State: " + mt.getState());
        System.out.println("Alive: " + mt.isAlive());

        mt.start();
        System.out.println("State: " + mt.getState());
        System.out.println("Alive: " + mt.isAlive());
        mt.interrupt();
    }
}
