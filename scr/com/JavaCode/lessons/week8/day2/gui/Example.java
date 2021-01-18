package com.JavaCode.lessons.week8.day2.gui;

import javax.swing.*;

public class Example {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        JButton b2 = new JButton("Ummmm");
        b.setBounds(200, 355, 250, 2250);
        b2.setBounds(100, 200, 200, 200);
        f.add(b);
        f.add(b2);
        f.setLocation(700,300);
        f.setSize(600, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
