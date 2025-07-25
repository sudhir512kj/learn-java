package awtLearn;

import java.awt.*;

class MyFrame10 extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame10() {
        super("GridLayout Demo");

        setLayout(new GridLayout(3, 2));

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(new Button("Seven"));
    }
}

public class GridLayoutDemo {
    public static void main(String[] args) {
        MyFrame10 frame = new MyFrame10();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
