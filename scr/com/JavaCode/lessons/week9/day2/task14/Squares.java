package com.JavaCode.lessons.week9.day2.task14;

import javax.swing.*;
import java.awt.*;

public class Squares extends JFrame {

    public void PanelT14(){
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
            }
        };
        panel.setBorder(BorderFactory.createTitledBorder("Panel"));
        add(panel);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,400,200);
        panel.setVisible(true);
    }

}
