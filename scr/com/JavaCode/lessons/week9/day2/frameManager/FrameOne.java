package com.JavaCode.lessons.week9.day2.frameManager;

import javax.swing.*;

public class FrameOne {

    private JFrame frame;
    private JFrame[] otherFrames;
    private JButton frameOneButton;
    private JButton frameTwoButton;
    private JButton frameThreeButton;
    private FrameManger frameManger;

    public FrameOne() {
        makeObjects();
        setFrames();
        setButtons();
        addObjects();
        makeOtherFrames();
    }

    public void run(){
        frameManger.openFrame(0);
    }

    private void makeOtherFrames(){
        otherFrames = new JFrame[3];
        for (int i = 0; i < 3; i++) {
            otherFrames[i] = new OtherFrames().getFrame();
        }
        frameManger = new FrameManger(frame,otherFrames);
    }

    private void makeObjects(){
        this.frame = new JFrame();
        this.frameOneButton = new JButton();
        this.frameTwoButton = new JButton();
        this.frameThreeButton = new JButton();
    }

    private void addObjects(){
        this.frame.add(this.frameOneButton);
        this.frame.add(this.frameTwoButton);
        this.frame.add(this.frameThreeButton);
    }

    private void setFrames(){
        frame.setLayout(null);
        frame.setBounds(200,200,500,500);
    }

    private void setButtons(){
        this.frameOneButton.setBounds(100,200,50,50);
        this.frameTwoButton.setBounds(200,200,50,50);
        this.frameThreeButton.setBounds(300,200,50,50);
    }

    public void actionListener(){
        this.frameOneButton.addActionListener(e -> frameManger.openFrame(1));
        this.frameTwoButton.addActionListener(e -> frameManger.openFrame(2));
        this.frameThreeButton.addActionListener(e -> frameManger.openFrame(3));
    }

    public JFrame getFrame() {
        return frame;
    }
}
