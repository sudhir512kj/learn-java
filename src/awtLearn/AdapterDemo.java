package awtLearn;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindowAdapter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class MyFrame16 extends Frame {
    MyFrame16() {
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        MyFrame16 frame = new MyFrame16();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
