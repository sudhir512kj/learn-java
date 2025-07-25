package awtLearn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends Frame implements ActionListener {
    int count = 0;
    Label l;
    Button b;

    public MyFrame2() {
        super("Button Demo");

        l = new Label("     " + count);
        b = new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("     " + count);
    }
}

public class ButtonAndActionListenerDemo {
    public static void main(String[] args) {
        MyFrame2 myFrame2 = new MyFrame2();
        myFrame2.setSize(400, 400);
        myFrame2.setVisible(true);
    }
}
