package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

class MyFrame11 extends JFrame implements ActionListener {
    JToolBar toolBar;
    JButton button1, button2, button3, button4, button5, button6, button7;
    JTextArea textArea;

    MyFrame11() {
        super("Toolbar Demo");

        toolBar = new JToolBar();

        button1 = new JButton(new ImageIcon("resource/images/save.png"));
        button2 = new JButton(new ImageIcon("resource/images/open.png"));
        button3 = new JButton(new ImageIcon("resource/images/new.png"));
        button4 = new JButton(new ImageIcon("resource/images/cut.png"));
        button5 = new JButton(new ImageIcon("resource/images/copy.png"));
        button6 = new JButton(new ImageIcon("resource/images/split.png"));
        button7 = new JButton(new ImageIcon("resource/images/close.png"));
        toolBar.add(button1); toolBar.add(button2); toolBar.add(button3);
        toolBar.add(new JToolBar.Separator());
        toolBar.add(button4); toolBar.add(button5); toolBar.add(button6); toolBar.add(button7);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(toolBar, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("save");
        JMenuItem m2 = new JMenuItem("open");
        m2.setMnemonic(KeyEvent.VK_O);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        menuBar.add(file);
        setJMenuBar(menuBar);

        button2.setActionCommand("open");

        button2.addActionListener(this);
        m2.addActionListener(this);
        button1.addActionListener(this);
        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("open")) {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(this);
            File f = fileChooser.getSelectedFile();

            try {
                FileInputStream fi = new FileInputStream(f);
                byte[] b = new byte[fi.available()];
                fi.read(b);
                String str = new String(b);
                textArea.setText(str);
                fi.close();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        } else {
            Color color = JColorChooser.showDialog(this, "Font Color", Color.RED);
            textArea.setForeground(color);
        }
    }
}

public class MenuAndToolBarDemo {
    public static void main(String[] args) {
        MyFrame11 frame = new MyFrame11();
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setTitle("Menu and ToolBar Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
