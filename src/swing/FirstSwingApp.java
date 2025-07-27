package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;

    MyFrame() {
        super("First Swing App");

        setLayout(new FlowLayout());
        l = new JLabel("Clicked " + count + " times");
        b = new JButton("Click");

        add(l);
        add(b);
        b.addActionListener(this);

        getRootPane().setDefaultButton(b);
        // b.setIcon(new ImageIcon(""));
        l.setToolTipText("Counter");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count + " times");
    }
}

public class FirstSwingApp {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
