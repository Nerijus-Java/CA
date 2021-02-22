package com.JavaCode.project.gui.login;

import com.JavaCode.project.gui.SetUp;
import com.JavaCode.project.model.User;
import com.JavaCode.project.user.UserCollection;

import javax.swing.*;
import java.sql.SQLException;

public class Login {
    //login Panel
    private JPanel mainPanel;
    private JButton login;
    private JButton register;
    private JTextField username;
    private JPasswordField password;

    //Helpers and other classes
    private final UserCollection userCollection;
    private final SetUp setUp;

    public Login(UserCollection userCollection, SetUp setUp) {
        this.userCollection = userCollection;
        this.setUp = setUp;
        setUpButtonActionListeners();
    }

    public void setUpButtonActionListeners(){
        login.addActionListener(e -> {
            for (User u : userCollection.getUsers()){
                if (username.getText().equals(u.getName()) && password.getText().equals(u.getPassword())){
                    try {
                        setUp.setUpMainFrame(u);
                    } catch (SQLException throwable) {
                        throwable.printStackTrace();
                    }
                    setUp.runMainFrame();
                    break;
                }
            }
        });

        register.addActionListener(e ->{
            if (username.getText() != null && !username.getText().equals("Username") && password.getText() != null){
                try {
                    userCollection.addNewUser(username.getText(), password.getText());
                } catch (SQLException throwable) {
                    throwable.printStackTrace();
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
