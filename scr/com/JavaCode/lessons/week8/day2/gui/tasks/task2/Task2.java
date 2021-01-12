package com.JavaCode.lessons.week8.day2.gui.tasks.task2;

import javax.swing.*;

public class Task2 {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton buttonOne = new JButton("Click");
        JTextField textFieldOne = new JTextField();

        textFieldOne.setBounds(175,100,150,50);
        buttonOne.setBounds(175,175,150,50);

        jFrame.add(textFieldOne);
        jFrame.add(buttonOne);

        jFrame.setSize(500,500);
        jFrame.setLayout(null);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
