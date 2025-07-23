package networkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedReverseEchoServer extends Thread {
    Socket stk;

    public MultiThreadedReverseEchoServer(Socket s) {
        stk = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine();

                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();

                ps.println(msg);
            } while (!msg.equals("dne"));

            stk.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        int count=1;
        Socket stk;
        MultiThreadedReverseEchoServer re;
        do {
            stk = ss.accept();
            System.out.println("Client Connected" + count++);
            re = new MultiThreadedReverseEchoServer(stk);
            re.start();
        } while (true);
    }
}
