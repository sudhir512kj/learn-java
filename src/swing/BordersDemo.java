package swing;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

class MyFrame4 extends JFrame {
    JLabel label;
    JTextField textField;
    JButton button;

    JPanel panel;
    MyFrame4() {
        label = new JLabel("Name");
        textField = new JTextField(20);
        button = new JButton("OK");
        panel = new JPanel();

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        Border border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),
                "Login", TitledBorder.CENTER, TitledBorder.LEFT);
        panel.setBorder(border);

        setLayout(new FlowLayout());
        add(panel);
    }
}

public class BordersDemo {
    public static void main(String[] args) {
        MyFrame4 frame = new MyFrame4();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
