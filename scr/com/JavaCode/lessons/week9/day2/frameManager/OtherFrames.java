package com.JavaCode.lessons.week9.day2.frameManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OtherFrames {

    private JFrame frame;
    private JButton backButton;

    public OtherFrames() {
        makeObjects();
        addObjects();
        setFrames();
        setButtons();
    }

    private void makeObjects(){
        this.frame = new JFrame();
        this.backButton = new JButton();
    }

    private void setFrames(){
        frame.setLayout(null);
        frame.setBounds(200,200,500,500);
    }

    private void setButtons(){
        this.backButton.setBounds(250,200,50,50);
    }

    private void addObjects(){
        this.frame.add(this.backButton);
    }

    private void createActionListeners(){
        this.backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JFrame getFrame() {
        return frame;
    }
}
