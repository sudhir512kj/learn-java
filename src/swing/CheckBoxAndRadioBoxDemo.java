package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class MyFrame3 extends JFrame implements ActionListener {
    JCheckBox checkBox1, checkBox2;
    JRadioButton radioButton1, radioButton2;

    JTextField textField;

    MyFrame3() {
        super("Checkbox and Radio Demo");

        textField = new JTextField("Demo Text", 20);
        textField.setBounds(10, 10, 100, 40);

        checkBox1 = new JCheckBox("Bold");
        checkBox1.setMnemonic(KeyEvent.VK_B);

        checkBox2 = new JCheckBox("Italic");
        checkBox2.setMnemonic(KeyEvent.VK_I);

        radioButton1 = new JRadioButton("lower");
        radioButton2 = new JRadioButton("UPPER");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        checkBox1.addActionListener(this);
        checkBox2.addActionListener(this);
        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);

        radioButton1.setActionCommand("lower");
        radioButton2.setActionCommand("UPPER");

        setLayout(new FlowLayout());

        add(textField);
        add(checkBox1);
        add(checkBox2);
        add(radioButton1);
        add(radioButton2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "lower":
                textField.setText(textField.getText().toLowerCase());
                break;
            case "UPPER":
                textField.setText(textField.getText().toUpperCase());
                break;
        }
        int b = 0, i = 0;

        if (checkBox1.isSelected())
            b = Font.BOLD;
        if (checkBox2.isSelected())
            i = Font.ITALIC;
        Font font = new Font("Times New Roman", b | i, 15);
        textField.setFont(font);
    }
}

public class CheckBoxAndRadioBoxDemo {
    public static void main(String[] args) {
        MyFrame3 frame = new MyFrame3();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
