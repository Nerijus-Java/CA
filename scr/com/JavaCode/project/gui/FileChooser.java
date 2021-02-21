//package com.JavaCode.project.gui;
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.File;
//
//public class FileChooser extends Component {
//
//    public File fileChoose() {
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
//        int result = fileChooser.showOpenDialog(this);
//        if (result == JFileChooser.APPROVE_OPTION) {
//            return fileChooser.getSelectedFile();
//        }
//        return new File("scr/com/JavaCode/project/Payments.txt");
//    }
//}
