package com.JavaCode.lessons.week8.day3.gui.task8;

import javax.swing.*;
import java.awt.*;

public class ListenT8 {

    public static void action(JTextField textField, int number, JButton button) {
        if (number == Integer.parseInt(textField.getText())){
            button.setBackground(Color.yellow);
        } else if (number > Integer.parseInt(textField.getText())){
            button.setBackground(Color.red);
        } else {
            button.setBackground(Color.blue);
        }
    }
}
