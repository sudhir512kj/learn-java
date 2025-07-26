package awtLearn;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame15 extends Frame implements ItemListener {
    Button b1, b2, b3;
    TextField tf1, tf2, tf3;
    Panel p1, p2, cp, mainPanel;
    Checkbox c1, c2;
    CardLayout cl;

    public MyFrame15() {
        super("Card Layout Demo");

        CheckboxGroup cg = new CheckboxGroup();

        c1 = new Checkbox("One", true, cg);
        c2 = new Checkbox("Two", false, cg);

        c1.addItemListener(this);
        c2.addItemListener(this);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(10);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(tf1);
        p2.add(tf2);
        p2.add(tf3);

        mainPanel = new Panel();
        cl = new CardLayout();
        mainPanel.setLayout(cl);

        mainPanel.add("One", p1);
        mainPanel.add("Two", p2);

        add(cp, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (c1.getState())
            cl.first(mainPanel);
        else
            cl.last(mainPanel);
    }
}

public class CardLayoutDemo {
    public static void main(String[] args) {
        MyFrame15 frame = new MyFrame15();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
