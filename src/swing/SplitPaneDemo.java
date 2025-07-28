package swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class MyFrame8 extends JFrame implements ListSelectionListener {
    JSplitPane splitPane;
    JList list;
    JLabel label;

    MyFrame8() {
        super("Split Pane Demo");

        String []colors = {"RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE", "BLACK"};

        list = new JList<>(colors);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane scrollPane1 = new JScrollPane(list);

        label = new JLabel(" ");
        label.setOpaque(true);
        label.setBackground(Color.RED);

        JScrollPane scrollPane2 = new JScrollPane(label);
//        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane1, scrollPane2);
//        splitPane.setDividerLocation(200);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Colors", scrollPane1);
        tabbedPane.addTab("Label", scrollPane2);

//        add(splitPane);
        add(tabbedPane);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String selectedColor = (String) list.getSelectedValue();

        switch (selectedColor) {
            case "RED" -> label.setBackground(Color.RED);
            case "GREEN" -> label.setBackground(Color.GREEN);
            case "BLUE" -> label.setBackground(Color.BLUE);
            case "YELLOW" -> label.setBackground(Color.YELLOW);
            case "MAGENTA" -> label.setBackground(Color.MAGENTA);
            case "ORANGE" -> label.setBackground(Color.ORANGE);
            case "BLACK" -> label.setBackground(Color.BLACK);
        }
    }
}

public class SplitPaneDemo {
    public static void main(String[] args) {
        MyFrame8 frame = new MyFrame8();
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
