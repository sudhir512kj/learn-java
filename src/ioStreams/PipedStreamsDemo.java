package ioStreams;

import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream os) {
        this.os = os;
    }

    public void run() {
        int count = 1;

        while (true) {
            try {
                os.write(count);
                os.flush();

                System.out.println("Producer: " + count);
                System.out.flush();

                Thread.sleep(10);

                count++;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream is) {
        this.is = is;
    }

    public void run() {
        int x;

        while (true) {
            try {
                x = is.read();

                System.out.println("Consumer: " + x);
                System.out.flush();
                Thread.sleep(10);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class PipedStreamsDemo {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream();

            pos.connect(pis);

            Producer p = new Producer(pos);
            Consumer c = new Consumer(pis);

            p.start();
            c.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
