package com.JavaCode.project.database;

import java.sql.*;

public class DataBaseConnection {

    public Connection connection;
    public Statement statement;

    public DataBaseConnection() throws SQLException {
        openConnection();
    }

    private void openConnection() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:h2:C:\\Users\\pcner\\Desktop\\h2\\project\\MainProject\\projectDataBase",
                "", "");
        statement = connection.createStatement();

    }

    public Statement getStatement() {
        return statement;
    }
}
