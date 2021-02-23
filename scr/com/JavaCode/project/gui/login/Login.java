package com.JavaCode.project.gui.login;

import com.JavaCode.project.collection.UserCollection;
import com.JavaCode.project.database.DataBaseConnection;
import com.JavaCode.project.database.QueryHelper;
import com.JavaCode.project.gui.SetUp;
import com.JavaCode.project.model.User;

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
    private final DataBaseConnection dataBaseConnection;
    private final QueryHelper queryHelper;
    public Login(UserCollection userCollection, SetUp setUp, DataBaseConnection dataBaseConnection) {
        this.userCollection = userCollection;
        this.setUp = setUp;
        this.queryHelper = new QueryHelper();
        this.dataBaseConnection = dataBaseConnection;
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
