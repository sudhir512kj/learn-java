package awtLearn;

import java.awt.*;

class MyFrame23 extends Frame implements Runnable {
    int x,y,tx,ty;
    MyFrame23() {
        super("Animation Demo");
        x = 100;
        y = 100;
        tx = ty = 1;

        Thread thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void run() {
        while(true) {
            x += tx;
            y += ty;
            if(x<0 || x>450) tx = tx * -1;
            if(y<20 || y>450) ty = ty * -1;
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class AnimationDemo {
    public static void main(String[] args) {
        MyFrame23 frame = new MyFrame23();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
