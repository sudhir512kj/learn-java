package awtLearn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame17 extends Frame implements ActionListener {
    TextField tf;
    Button b;
    int count = 0;

    MyFrame17() {
        super("Event Demo");

        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));
    }
}

class MyFrame18 extends Frame {
    TextField tf;
    Button b;
    int count = 0;

    MyFrame18() {
        super("Event Demo");

        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(new MyListener());
    }

    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            tf.setText(String.valueOf(count));
        }
    }
}

class MyFrame19 extends Frame {
    TextField tf;
    Button b;
    int count = 0;

    MyFrame19() {
        super("Event Demo");

        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                tf.setText(String.valueOf(count));
            }
        });
    }
}

class MyFrame20 extends Frame {
    TextField tf;
    Button b;
    int count = 0;

    MyFrame20() {
        super("Event Demo");

        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener((ActionEvent e) -> {
                count++;
                tf.setText(String.valueOf(count));
        });
    }
}

public class FiftyShadesOfEventHandling {
    public static void main(String[] args) {
        MyFrame20 frame1 = new MyFrame20();
        frame1.setSize(600, 600);
        frame1.setVisible(true);
    }
}
