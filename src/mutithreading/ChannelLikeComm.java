package mutithreading;

import java.util.concurrent.*;

public class ChannelLikeComm {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> channel = new ArrayBlockingQueue<>(10);
        
        // Producer (like Go goroutine sending to channel)
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    channel.put("Message " + i);
                    System.out.println("Sent: Message " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        // Consumer (like Go goroutine receiving from channel)
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    String msg = channel.take();
                    System.out.println("Received: " + msg);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
        producer.start();
        consumer.start();
        
        producer.join();
        consumer.join();
    }
}