package awtLearn;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyFrame22 extends Frame {
    int x=0,y=0;

    MyFrame22() {
        super("Painting Demo");

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        // g.drawOval(x, y, 50, 50);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Hello", x, y);
    }
}

public class PaintingColorsAndFonts {
    public static void main(String[] args) {
        MyFrame22 frame = new MyFrame22();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
