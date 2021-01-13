package com.JavaCode.lessons.week8.day3.gui.task9;

import javax.swing.*;

public class CalculatorListen {

    public static void action(JTextField textField, JTextField textFieldTwo, JLabel label) {
        int sum = Integer.parseInt(textField.getText()) + Integer.parseInt(textFieldTwo.getText());
        label.setText(String.valueOf(sum));
    }
}
