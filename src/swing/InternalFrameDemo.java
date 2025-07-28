package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyInternalFrame extends JInternalFrame {
    static int count = 0;
    JTextArea textArea;
    JScrollPane scrollPane;

    MyInternalFrame() {
        super("Document" + (++count), true, true, true, true);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem menuItem1 = new JMenuItem("Save");

        file.add(menuItem1);
        menuBar.add(file);
        setJMenuBar(menuBar);

        setSize(300, 300);
        setLocation(50, 50);
        setVisible(true);
    }
}

class MyFrame7 extends JFrame implements ActionListener {
    JDesktopPane desktopPane;

    MyFrame7() {
        super("Internal Frame Demo");

        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        JMenuBar dMenuBar = new JMenuBar();
        JMenu dFile = new JMenu("Document");
        JMenuItem dMenuItem1 = new JMenuItem("New");

        dMenuBar.add(dMenuItem1);
        dMenuBar.add(dFile);
        setJMenuBar(dMenuBar);

        dMenuItem1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame internalFrame = new MyInternalFrame();
        desktopPane.add(internalFrame);
    }
}

public class InternalFrameDemo {
    public static void main(String[] args) {
        MyFrame7 frame = new MyFrame7();
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
