package networkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramCommunication {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Hello World";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2000);

        ds.send(dp);

        byte []b = new byte[1024];
        dp = new DatagramPacket(b, b.length);
        ds.receive(dp);

        msg = new String(dp.getData()).trim();
        System.out.println("From Server: " + msg);

        ds.close();
    }
}

class DatagramCommunicationServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2000);

        byte []b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);

        String msg = new String(dp.getData()).trim();
        System.out.println("From Server: " + msg);
        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg = sb.toString();

        dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2001);

        ds.send(dp);

        ds.close();
    }
}
