package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class MyFrame9 extends JFrame implements ChangeListener {
    JSlider slider;
    JPanel panel1, panel2;
    JProgressBar progressBar;

    int w = 50;

    MyFrame9() {
        super("Slider and Progress Bar Demo");

        slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        progressBar = new JProgressBar();
        progressBar.setString("50%");
        progressBar.setStringPainted(true);
        progressBar.setIndeterminate(true);

        panel1 = new JPanel(){
            public void paintComponent(Graphics g) {
                g.drawOval(200, 200, w, w);
            }
        };

        panel2 = new JPanel();
        panel2.add(progressBar);

        add(slider, BorderLayout.NORTH);
        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        slider.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w = slider.getValue();
        panel1.repaint();
        progressBar.setString(w + "%");
        progressBar.setIndeterminate(false);
        progressBar.setStringPainted(true);
        progressBar.setValue(w);
    }
}

public class SliderAndProgressBarDemo {
    public static void main(String[] args) {
        MyFrame9 frame = new MyFrame9();
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
