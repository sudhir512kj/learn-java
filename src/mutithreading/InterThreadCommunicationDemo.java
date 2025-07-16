package mutithreading;

class MyData2 {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while (!flag)
            try {
                wait();
            } catch (Exception ignored) {
            }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag)
            try {
                wait();
            } catch (Exception ignored) {
            }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MyData2 data;

    Producer(MyData2 d) {
        data = d;
    }

    public void run() {
        int count = 1;
        while (true) {
            data.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    MyData2 data;

    Consumer(MyData2 d) {
        data = d;
    }

    public void run() {
        int value;
        while (true) {
            value = data.get();
            System.out.println("Consumer " + value);
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {
        MyData2 data = new MyData2();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
