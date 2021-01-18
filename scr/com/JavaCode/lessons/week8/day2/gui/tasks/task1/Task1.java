package com.JavaCode.lessons.week8.day2.gui.tasks.task1;

import javax.swing.*;

public class Task1 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Enter numbers to get sum");
        String input = "";

        while(!input.equals("Yes")){
            String a = JOptionPane.showInputDialog("Number a :");
            String b = JOptionPane.showInputDialog("Number b :");

            int sum = Integer.parseInt(a) + Integer.parseInt(b);
            JOptionPane.showMessageDialog(null,"Result :" + sum);

            input = JOptionPane.showInputDialog("(Yes to end)");
        }

    }
}
