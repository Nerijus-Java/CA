package com.JavaCode.lessons.week8.day3.gui.task6;

import javax.swing.*;
import java.util.Random;

public class ListenMethods {

    public static void action(JTextField textField, JTextField textFieldTwo) {
        Random random = new Random();
        textField.setText("" + random.nextInt(Integer.parseInt(textFieldTwo.getText())));
    }
}
