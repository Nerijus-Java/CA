package com.JavaCode.lessons.week8.day3.gui.task6;

import javax.swing.*;

public class MyFrame {

    private JFrame mainFrame;
    private JTextField textField;
    private JTextField textFieldTwo;
    private JButton button;

    public MyFrame() {
        implementComponents();
        linkComponents();
        setFrameAttributes();
        setComponentsAttributes();
        registerListeners();
    }

    private void setComponentsAttributes() {
        this.textFieldTwo.setBounds(20,50,20,30);
        this.textField.setBounds(40, 50, 100, 30);
        this.button.setBounds(160, 50, 100, 30);
        this.button.setText("Generate");
    }

    public void run(){
        mainFrame.setVisible(true);
    }

    private void linkComponents() {
        mainFrame.add(this.textField);
        mainFrame.add(this.button);
        mainFrame.add(this.textFieldTwo);
    }

    private void implementComponents() {
        mainFrame = new JFrame();
        textField = new JTextField();
        textFieldTwo = new JTextField();
        button = new JButton();
    }

    private void setFrameAttributes() {
        mainFrame.setLayout(null);
        mainFrame.setBounds(200, 200, 300, 200);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void registerListeners(){
        this.button.addActionListener(e -> ListenMethods.action(textField,textFieldTwo));
    }

}
