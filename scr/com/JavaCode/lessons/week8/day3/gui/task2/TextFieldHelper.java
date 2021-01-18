package com.JavaCode.lessons.week8.day3.gui.task2;

import javax.swing.*;

public class TextFieldHelper {

    public static void action(JTextField textField) {
        System.out.println("Hello world!!!");
        System.out.println(textField.getText());
        textField.setText("" + textField.getText().length());
    }
}
