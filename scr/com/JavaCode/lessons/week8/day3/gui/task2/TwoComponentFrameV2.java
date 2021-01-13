package com.JavaCode.lessons.week8.day3.gui.task2;

import javax.swing.*;

public class TwoComponentFrameV2 {

    private JFrame mainFrame;
    private JTextField textField;
    private JButton button;

    public TwoComponentFrameV2() {
        createComponents();
        setComponentsAttributes();
        linkComponents();
        setFrameAttributes();
        registerListeners();
    }

    private void createComponents() {
        this.mainFrame = new JFrame();
        this.textField = new JTextField();
        this.button = new JButton();
    }

    private void setComponentsAttributes() {
        this.textField.setBounds(100, 40, 100, 30);
        this.button.setBounds(100, 80, 100, 30);
        this.button.setText("Click Me");
    }

    private void linkComponents() {
        mainFrame.add(this.textField);
        mainFrame.add(this.button);
    }

    private void setFrameAttributes() {
        mainFrame.setLayout(null);
        mainFrame.setBounds(200, 200, 300, 200);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void show() {
        mainFrame.setVisible(true);
    }


    private void registerListeners(){
        this.button.addActionListener(e -> TextFieldHelper.action(textField));
    }
}
