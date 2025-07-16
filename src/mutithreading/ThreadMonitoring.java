package mutithreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class ThreadMonitoring {
    public static void main(String[] args) throws InterruptedException {
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        
        Thread worker = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                Math.sqrt(i);
            }
        }, "WorkerThread");
        
        System.out.println("Active threads before: " + threadBean.getThreadCount());
        
        worker.start();
        
        while (worker.isAlive()) {
            System.out.println("Worker state: " + worker.getState());
            System.out.println("Active threads: " + threadBean.getThreadCount());
            Thread.sleep(100);
        }
        
        System.out.println("Final state: " + worker.getState());
        System.out.println("Active threads after: " + threadBean.getThreadCount());
    }
}