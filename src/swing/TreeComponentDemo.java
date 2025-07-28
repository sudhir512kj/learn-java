package swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;
import java.util.Objects;

class MyFrame5 extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel label;

    MyFrame5() {
        super("Tree Demo");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("src");
        File f = new File("src");
        for (File file : Objects.requireNonNull(f.listFiles())) {
            if (file.isDirectory()) {
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(file.getName());
                for (File f1 : Objects.requireNonNull(file.listFiles())) {
                    node.add(new DefaultMutableTreeNode(f1.getName()));
                }
                root.add(node);
            } else {
                root.add(new DefaultMutableTreeNode(file.getName()));
            }
        }

        tree = new JTree(root);
        label = new JLabel("No Files Selected");

        tree.addTreeSelectionListener(this);
        JScrollPane scrollPane = new JScrollPane(tree);

        add(scrollPane, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
}

public class TreeComponentDemo {
    public static void main(String[] args) {
        MyFrame5 frame = new MyFrame5();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
