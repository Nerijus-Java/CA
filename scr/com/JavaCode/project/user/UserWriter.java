//package com.JavaCode.project.user;
//
//import com.JavaCode.project.model.User;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class UserWriter {
//
//    public static final String PAYMENTS_PATH = "scr/com/JavaCode/project/user/Users";
//
//    public void writeOneUserToFile(User user){
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PAYMENTS_PATH, true))) {
//            bw.write(user.getName() + "," + user.getPassword() + "," + user.getBalance());
//            bw.newLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
