package com.JavaCode.lessons.week8.day3.gui.task9;

import javax.swing.*;

public class SumCalculatorFrame {

    public static final int MAIN_WIDTH = 500;
    public static final int MAIN_HEIGHT = 500;

    private JFrame mainFrame;
    private JPanel panelOne;
    private JPanel panelTwo;
    private JTextField textFieldOne;
    private JTextField textFieldTwo;
    private JLabel jLabel;
    private JLabel jLabelTwo;
    private JButton jButton;

    public void run() {
        implementComponents();
        setComponentsAttributes();
        setPanelsAttributes();
        frameAttributes();
        linkComponents();
        registerListeners();
        mainFrame.setVisible(true);
    }

    private void implementComponents() {
        mainFrame = new JFrame();
        panelOne = new JPanel();
        panelTwo = new JPanel();
        textFieldOne = new JTextField();
        textFieldTwo = new JTextField();
        jButton = new JButton();
        jLabel = new JLabel();
        jLabelTwo = new JLabel();
    }

    private void setComponentsAttributes() {
        this.jButton.setBounds(200, 25, 100, 50);
        this.jButton.setText("Calculate");
        this.textFieldOne.setBounds(75,200,100,30);
        this.textFieldTwo.setBounds(250,200,100,30);
        this.jLabel.setText("+");
        this.jLabelTwo.setText("____________");
        this.jLabel.setBounds(210,200,100,30);
        this.jLabelTwo.setBounds(390,200,100,30);
    }

    private void linkComponents() {
        mainFrame.add(panelOne);
        mainFrame.add(panelTwo);
        panelOne.add(textFieldOne);
        panelOne.add(textFieldTwo);
        panelOne.add(jLabel);
        panelOne.add(jLabelTwo);
        panelTwo.add(jButton);
    }

    private void setPanelsAttributes() {
        panelOne.setBorder(BorderFactory.createTitledBorder("Enter"));
        panelTwo.setBorder(BorderFactory.createTitledBorder("Buttons"));
    }

    private void frameAttributes() {
        mainFrame.setLayout(null);
        panelOne.setLayout(null);
        panelTwo.setLayout(null);
        mainFrame.setBounds(0, 200, MAIN_WIDTH, MAIN_HEIGHT);
        panelOne.setBounds(0, 0, MAIN_WIDTH - 10, MAIN_HEIGHT - 150);
        panelTwo.setBounds(0, 350, MAIN_WIDTH - 10, MAIN_HEIGHT - 400);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
    }

    private void registerListeners() {
        this.jButton.addActionListener(e -> CalculatorListen.action(textFieldOne,textFieldTwo,jLabelTwo));
    }

}
