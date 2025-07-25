package awtLearn;

import java.awt.*;

class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;

    public MyFrame() {
        super("My AWT App 2");
        setLayout(new FlowLayout());

        l = new Label("Name ");
        tf = new TextField(20);
        b = new Button("OK");

        add(l);
        add(tf);
        add(b);
    }
}

public class FirstApp2 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setSize(300, 300);
        myFrame.setVisible(true);
    }
}
