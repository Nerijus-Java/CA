package com.JavaCode.lessons.week9.day2.task10;

import javax.swing.*;
import java.awt.*;

public class Task10 {

    private JFrame mainFrame;
    private JButton goButton;
    private JTextField resultsText;
    private JTextField firstText;
    private JTextField secondText;
    private JPanel topPanel;
    private JPanel bottomPanel;

    public void run(){
        implementComponents();
        frameAttributes();
        linkComponents();
        topPanelAttributes();
        bottomPanelAttributes();
        setComponentsAttributes();
        addActionLis();
    }

    private void implementComponents(){
        this.mainFrame = new JFrame();
        this.goButton = new JButton();
        this.resultsText = new JTextField();
        this.firstText = new JTextField();
        this.secondText = new JTextField();
        this.topPanel = new JPanel();
        this.bottomPanel = new JPanel();
    }

    private void setComponentsAttributes(){
        this.goButton.setText("Go!");
        this.goButton.setBounds(200,15,60,20);
        this.firstText.setBounds(130,15,50,20);
        this.secondText.setBounds(50, 15,50,20);
        this.resultsText.setBounds(125,15,50,20);
        this.resultsText.setText("Results");
    }

    private void frameAttributes(){
        this.mainFrame.setLayout(null);
        this.mainFrame.setBounds(300,300,300,300);
        this.mainFrame.setVisible(true);
        this.mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void linkComponents(){
        this.mainFrame.add(topPanel);
        this.mainFrame.add(bottomPanel);

        this.topPanel.add(firstText);
        this.topPanel.add(secondText);
        this.topPanel.add(goButton);
        this.bottomPanel.add(resultsText);

    }

    private void bottomPanelAttributes(){
        this.bottomPanel.setLayout(null);
        this.bottomPanel.setBounds(0,230,300,50);
        this.bottomPanel.setBackground(Color.GREEN);
        bottomPanel.setVisible(true);
    }

    private void addActionLis(){
        this.goButton.addActionListener(e -> ActionListenersTask10.actionGoButton(firstText,secondText,resultsText));
    }

    private void topPanelAttributes(){
        this.topPanel.setLayout(null);
        this.topPanel.setBounds(0,0,300,50);
        this.topPanel.setBackground(Color.red);
        topPanel.setVisible(true);
    }
}
