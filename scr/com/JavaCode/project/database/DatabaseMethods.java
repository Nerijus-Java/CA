package com.JavaCode.project.database;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.catagory.CatagoryCollection;
import com.JavaCode.project.model.User;
import com.JavaCode.project.user.UserCollection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMethods {

    private final DataBaseConnection dataBaseConnection;
    private ResultSet resultSet;
    private final QueryHelper queryHelper = new QueryHelper();
    private final CatagoryCollection catagoryCollection;
    private final PaymentCollection paymentCollection;
    private final UserCollection userCollection;

    public DatabaseMethods(DataBaseConnection dataBaseConnection,
                           CatagoryCollection catagoryCollection,
                           PaymentCollection paymentCollection,
                           UserCollection userCollection) {
        this.dataBaseConnection = dataBaseConnection;
        this.catagoryCollection = catagoryCollection;
        this.paymentCollection = paymentCollection;
        this.userCollection = userCollection;
    }

    public void addUserToDB(User user) throws SQLException {
        dataBaseConnection.getStatement().execute(queryHelper.addPersonQuery(user.getName(), user.getPassword()));
        System.out.println("User Added");
    }

    public void addIncome(int amount, boolean transfer, boolean taxes, int catagoryID, User loggedInUser) throws SQLException {
        int userID = getUserIDByNameAndPassword(loggedInUser);
        if (userID != -1){
            dataBaseConnection.getStatement().execute(queryHelper.addIncome(amount,transfer,taxes,userID,catagoryID));
        }
    }

    public void addCost(int amount , boolean hidden, int catagoryID, User loggedInUser) throws SQLException {
        int userID = getUserIDByNameAndPassword(loggedInUser);
        if (userID != -1 ){
            dataBaseConnection.getStatement().execute(queryHelper.addCost(amount,hidden,catagoryID,userID));
        }
    }

    public void readUsersFromDb() throws SQLException {
        resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.allUsersQuery);
        while (resultSet.next()){
            userCollection.addOldUser(resultSet.getString(1),resultSet.getString(2));
        }
    }
    
    private int getUserIDByNameAndPassword(User user) throws SQLException {
        resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.allUsersQuery);
        while(resultSet.next()){
            if (user.getName().equals(resultSet.getString(1)) && user.getPassword().equals(resultSet.getString(2))){
                return Integer.parseInt(resultSet.getString(3));
            }
        }
        return -1;
    }
}
