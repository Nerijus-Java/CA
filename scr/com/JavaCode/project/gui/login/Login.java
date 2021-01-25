package com.JavaCode.project.gui.login;

import com.JavaCode.project.gui.SetUp;
import com.JavaCode.project.user.User;
import com.JavaCode.project.user.UserCollection;
import com.JavaCode.project.user.UserWriter;

import javax.swing.*;

public class Login {
    //login Panel
    private JPanel mainPanel;
    private JButton login;
    private JButton register;
    private JTextField username;
    private JPasswordField password;

    //Helpers and other classes
    private final UserCollection userCollection;
    private final UserWriter userWriter;
    private User loggedInUser;
    private SetUp guiManager;

    public Login(UserCollection userCollection, UserWriter userWriter, SetUp guiManager) {
        this.userCollection = userCollection;
        this.userWriter = userWriter;
        this.guiManager = guiManager;
    }

    public void setUpButtonActionListeners(){
        login.addActionListener(e -> {
            for (User u : userCollection.getUsers()){
                if (username.getText().equals(u.getName()) && password.getText().equals(u.getPassword())){
                    this.loggedInUser = u;
                }
            }
        });

        register.addActionListener(e ->{
            if (username.getText() != null && !username.getText().equals("Username") && password.getText() != null){
                userCollection.addNewUser(username.getText(), password.getText());
            }
        });
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
