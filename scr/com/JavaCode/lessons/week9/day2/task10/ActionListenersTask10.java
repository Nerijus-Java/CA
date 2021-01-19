package com.JavaCode.lessons.week9.day2.task10;

import javax.swing.*;

public class ActionListenersTask10 {

    public static void actionGoButton(JTextField textFieldOne, JTextField textFieldTwo, JTextField textFieldResults){
        textFieldResults.setText(textFieldOne.getText().concat(textFieldTwo.getText()));
    }
}
