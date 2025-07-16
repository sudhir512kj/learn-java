package mutithreading;

class MyData {
    public void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    // will work same as above one
    synchronized public void display2(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}

class MySyncThread1 extends Thread {
    MyData d;

    public MySyncThread1(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello World");
    }
}

class MySyncThread2 extends Thread {
    MyData d;

    public MySyncThread2(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Welcome All");
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        MyData myData  = new MyData();
        MySyncThread1 t1 = new MySyncThread1(myData);
        MySyncThread2 t2 = new MySyncThread2(myData);
        t1.start();
        t2.start();
    }
}
