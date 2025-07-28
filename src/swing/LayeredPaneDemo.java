package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyFrame6 extends JFrame implements ActionListener {
    JLayeredPane layeredPane;
    JRadioButton radioButton1, radioButton2, radioButton3;
    JLabel label1, label2, label3, label4;

    MyFrame6() {
        super("Layered Pane Demo");

        radioButton1 = new JRadioButton("Red");
        radioButton2 = new JRadioButton("Green");
        radioButton3 = new JRadioButton("Blue");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton3.addActionListener(this);

        JPanel panel1 = new JPanel();
        panel1.add(radioButton1);
        panel1.add(radioButton2);
        panel1.add(radioButton3);

        label1 = new JLabel("Red");
        label1.setBounds(10, 10, 200, 200);
        label1.setBackground(Color.RED);
        label1.setOpaque(true);

        label2 = new JLabel("Green");
        label2.setBounds(50, 50, 250, 250);
        label2.setBackground(Color.GREEN);
        label2.setOpaque(true);

        label3 = new JLabel("Blue");
        label3.setBounds(70, 70, 300, 300);
        label3.setBackground(Color.BLUE);
        label3.setOpaque(true);

        label4 = new JLabel("b");
        label4.setBounds(100, 100, 150, 150);
        label4.setBackground(Color.BLACK);
        label4.setOpaque(true);

        layeredPane = new JLayeredPane();
        layeredPane.add(label1, 0);
        layeredPane.add(label2, 1);
        layeredPane.add(label3, 2);
        layeredPane.add(label4, 3);

        add(panel1, BorderLayout.NORTH);
        add(layeredPane, BorderLayout.CENTER);

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label4.setLocation(e.getX(), e.getY());
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (radioButton1.isSelected())
            layeredPane.setLayer(label4, 1);
        else if (radioButton2.isSelected())
            layeredPane.setLayer(label4, 2);
        else
            layeredPane.setLayer(label4, 3);
    }
}

public class LayeredPaneDemo {
    public static void main(String[] args) {
        MyFrame6 frame = new MyFrame6();
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
