package awtLearn;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame3 extends Frame implements ItemListener {
    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;

    public MyFrame3() {
        super("Checkbox Demo");

        l = new Label("Nothing is selected");
        c1 = new Checkbox("Java", false, cbg);
        c2 = new Checkbox("Python", false, cbg);
        c3 = new Checkbox("C#", false, cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";

        if (c1.getState())
            str = str + " " + c1.getLabel();
        if (c2.getState())
            str = str + " " + c2.getLabel();
        if (c3.getState())
            str = str + " " + c3.getLabel();

        if (str.isEmpty())
            str = "Nothing is selected";
        l.setText(str);
    }
}

public class CheckboxRadioButtonItemListenerDemo {
    public static void main(String[] args) {
        MyFrame3 myFrame3 = new MyFrame3();
        myFrame3.setSize(400, 400);
        myFrame3.setVisible(true);
    }
}
