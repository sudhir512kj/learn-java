package awtLearn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame5 extends Frame implements ActionListener {
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame5() {
        super("TextArea Demo");

        l = new Label("No Text Entered ");
        ta = new TextArea(10, 30);
        tf = new TextField(20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}

public class TextAreaDemo {
    public static void main(String[] args) {
        MyFrame5 frame5 = new MyFrame5();
        frame5.setSize(400, 400);
        frame5.setVisible(true);
    }
}
