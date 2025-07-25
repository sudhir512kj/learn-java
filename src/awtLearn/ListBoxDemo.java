package awtLearn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame6 extends Frame implements ItemListener, ActionListener {
    List l;
    Choice c;
    TextArea ta;

    MyFrame6() {
        super("ListBox Demo");

        l = new List(4, true);
        c = new Choice();
        ta = new TextArea(20, 30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String []list = l.getSelectedItems();
        String text = "";

        for (String x: list)
            text += x + "\n";
        ta.setText(text);

        l.addItem(text);
    }
}

public class ListBoxDemo {
    public static void main(String[] args) {
        MyFrame6 myFrame6 = new MyFrame6();
        myFrame6.setSize(500, 500);
        myFrame6.setVisible(true);
    }
}
