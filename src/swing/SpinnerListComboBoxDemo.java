package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame10 extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {
    JComboBox comboBox;
    JList list;
    JSpinner spinner1, spinner2;
    JTextField textField;

    MyFrame10() {
        super("Spinner Demo");

        String []countries = {"India", "US", "UK", "Canada", "Australia"};
        String []months = {"January", "February", "March", "April", "May", "June", "July", "August",
                            "September", "October", "November", "December"};
        String []days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        comboBox = new JComboBox<>(countries);
        list = new JList<>(months);
        list.setVisibleRowCount(5);
        textField = new JTextField(15);

        spinner1 = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        spinner2 = new JSpinner(new SpinnerListModel(days));

        setLayout(new FlowLayout());
        add(comboBox);
        add(spinner1);
        add(spinner2);
        add(new JScrollPane(list));
        add(textField);

        comboBox.addActionListener(this);
        list.addListSelectionListener(this);
        spinner1.addChangeListener(this);
        spinner2.addChangeListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText((String) comboBox.getSelectedItem());
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        textField.setText((String) list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == spinner1)
            textField.setText(spinner1.getValue() + "");
        else
            textField.setText((String) spinner2.getValue());
    }
}

public class SpinnerListComboBoxDemo {
    public static void main(String[] args) {
        MyFrame10 frame = new MyFrame10();
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
