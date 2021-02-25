package com.JavaCode.project.gui.login;

import com.JavaCode.project.database.DataBaseConnection;
import com.JavaCode.project.database.DatabaseMethods;
import com.JavaCode.project.database.QueryHelper;
import com.JavaCode.project.gui.SetUp;
import com.JavaCode.project.model.User;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    //login Panel
    private JPanel mainPanel;
    private JButton login;
    private JButton register;
    private JTextField username;
    private JPasswordField password;

    //Helpers and other classes
    private final SetUp setUp;
    private final DataBaseConnection dataBaseConnection;
    private final QueryHelper queryHelper;
    private final DatabaseMethods databaseMethods;

    public Login(SetUp setUp, DataBaseConnection dataBaseConnection, DatabaseMethods databaseMethods) {
        this.setUp = setUp;
        this.queryHelper = new QueryHelper();
        this.dataBaseConnection = dataBaseConnection;
        this.databaseMethods = databaseMethods;
        setUpButtonActionListeners();
    }

    public void setUpButtonActionListeners() {
        login.addActionListener(e -> {
            ResultSet resultSet = null;
            try {
                resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.userByNameAndPassword(username.getText(), password.getText()));
            } catch (SQLException e1) {
                System.out.println("No User");
            }


            String userName = " ";
            String password = " ";
            int id = 0;
            try {
                resultSet.next();
                userName = resultSet.getString(1);
                password = resultSet.getString(2);
                id = resultSet.getInt(3);
            } catch (SQLException e1) {
                System.out.println("No User");
            }
            User user = new User(userName, password);

            if (id != 0) {
                try {
                    setUp.setUpMainFrame(user);
                } catch (SQLException throwable) {
                    throwable.printStackTrace();
                }
                setUp.runMainFrame();
            }
        });

        register.addActionListener(e -> {
            ResultSet resultSet = null;
            try {
                resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.checkUsersName(username.getText()));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            int amount = 0;

            try {
                resultSet.next();
                amount = resultSet.getInt(1);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            boolean isUnique;
            isUnique = amount < 1;

            if (username.getText() != null && !username.getText().equals("Username") && password.getText() != null && isUnique) {
                try {
                    User newUser = new User(username.getText(),password.getText());
                    databaseMethods.addUserToDB(newUser);
                } catch (SQLException throwable) {
                    throwable.printStackTrace();
                }
            }else {
                System.out.println("Name already in use");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
