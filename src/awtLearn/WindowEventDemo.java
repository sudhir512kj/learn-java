package awtLearn;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame14 extends Frame implements WindowListener {
    Label l;

    MyFrame14() {
        super("Window Event Demo");
        l = new Label("                 ");

        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window DeConfided");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}

public class WindowEventDemo {
    public static void main(String[] args) {
        MyFrame14 frame = new MyFrame14();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
