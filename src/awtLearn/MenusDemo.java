package awtLearn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

class MyFrame21 extends Frame {
    Menu file, sub;
    MenuItem open, save, close, closeAll;
    CheckboxMenuItem autoSave;
    TextField tf;

    MyFrame21() {
        super("Menus Demo");

        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeAll = new MenuItem("Close All");

        autoSave = new CheckboxMenuItem("Auto Save");

        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(autoSave);

        sub.add(close);
        sub.add(closeAll);

        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae) -> tf.setText("Open"));
        save.addActionListener((ActionEvent ae) -> tf.setText("Save"));
        close.addActionListener((ActionEvent ae) -> tf.setText("Close"));
        closeAll.addActionListener((ActionEvent ae) -> tf.setText("Close All"));
        autoSave.addItemListener((ItemEvent ie) -> {
            if (autoSave.getState())
                tf.setText("Auto Save On");
            else
                tf.setText("Auto Save Off");
        });
    }
}

public class MenusDemo {
    public static void main(String[] args) {
        MyFrame21 frame = new MyFrame21();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
