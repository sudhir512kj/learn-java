package swing;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyFrame2 extends JFrame {
    MyFrame2() {
        super("TextField Demo");

        JTextField tf1 = new JTextField(15);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField ftf1 = new JFormattedTextField(df);
        ftf1.setColumns(15);
        ftf1.setValue(new Date());

        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter numberFormatter = new NumberFormatter(nf);
        numberFormatter.setAllowsInvalid(false);
        numberFormatter.setMaximum(10000);

        JFormattedTextField ftf2 = new JFormattedTextField(numberFormatter);
        ftf2.setColumns(15);

        JTextArea textArea = new JTextArea(30,30);

        setLayout(new FlowLayout());
        add(tf1);
        add(ftf1);
        add(ftf2);
    }
}

public class JTextFieldDemo {
    public static void main(String[] args) {
        MyFrame2 frame = new MyFrame2();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
