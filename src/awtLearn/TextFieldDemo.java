package awtLearn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame4 extends Frame {
    Label l1, l2;
    TextField tf;

    MyFrame4() {
        super("Text Field Demo");

        l1 = new Label("No text is entered yet.");
        l2 = new Label("Enter is not yet hit.");
        tf = new TextField(20);

        Handler h = new Handler();

        tf.addTextListener(h);
        tf.addActionListener(h);
        tf.setEchoChar('*');

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
    }

    class Handler implements TextListener, ActionListener {
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
        }
    }
}

public class TextFieldDemo {
    public static void main(String[] args) {
        MyFrame4 myFrame4 = new MyFrame4();
        myFrame4.setSize(400, 400);
        myFrame4.setVisible(true);
    }
}
