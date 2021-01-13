package com.JavaCode.lessons.week8.day3.gui.task8;

import javax.swing.*;
import java.util.Random;

public class HotOrColdFrame {

    private final Random random = new Random();
    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private JLabel label;
    private int number;

    public void run() {
        number = random.nextInt(99) + 1;
        implementComponents();
        setComponentsAttributes();
        linkComponents();
        frameAttributes();
        registerListeners();
        frame.setVisible(true);
    }

    private void setComponentsAttributes() {
        this.label.setBounds(0, 25, 350, 30);
        this.label.setText("Guess number between 1-100");
        this.textField.setBounds(0, 50, 350, 30);
        this.button.setBounds(0, 100, 350, 30);
        this.button.setText("Guess");
    }

    private void implementComponents() {
        frame = new JFrame();
        textField = new JTextField();
        button = new JButton();
        label = new JLabel();
    }

    private void linkComponents() {
        frame.add(this.textField);
        frame.add(this.button);
        frame.add(this.label);
    }

    private void frameAttributes() {
        frame.setLayout(null);
        frame.setBounds(200, 200, 350, 250);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void registerListeners() {
        this.button.addActionListener(e -> ListenT8.action(textField,number,button));
    }
}
