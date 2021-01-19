package com.JavaCode.lessons.week9.day2.frameManager;

import javax.swing.*;

public class FrameManger {

    private JFrame mainFrame;
    private JFrame[] jFramesArray;
    private JFrame lastFrame;

    public FrameManger(JFrame mainFrame, JFrame[] jFramesArray) {
        this.mainFrame = mainFrame;
        this.jFramesArray = jFramesArray;
    }

    public void openFrame(int i){
        if (i == 0){
            if (lastFrame != null){
                lastFrame.setVisible(false);
            }
            mainFrame.setVisible(true);
            lastFrame = mainFrame;
        }else {
            int count = 1;
            for(JFrame f : jFramesArray){
                if (count == i){
                    lastFrame.setVisible(false);
                    f.setVisible(true);
                    lastFrame = f;
                }
                count++;
            }
        }
    }

    public JFrame[] getjFramesArray() {
        return jFramesArray;
    }
}
