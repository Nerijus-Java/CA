package com.JavaCode.project.database;

import com.JavaCode.project.collection.CatagoryCollection;
import com.JavaCode.project.collection.PaymentCollection;
import com.JavaCode.project.collection.UserCollection;
import com.JavaCode.project.model.User;

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
        int userID = getUserIDByNameAndPassword(user);
        dataBaseConnection.getStatement().execute(queryHelper.addPersonCostCategory(userID));
        dataBaseConnection.getStatement().execute(queryHelper.addPersonIncomeCatagorys(userID));
        dataBaseConnection.getStatement().execute(queryHelper.makeBalance(userID));
    }

    public int getBalance(User loggedInUser) throws SQLException {
        int userID = getUserIDByNameAndPassword(loggedInUser);
        if (userID != -1) {
            resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.userBalanceByID(userID));
            resultSet.next();

            return resultSet.getInt(1);
        }
        return 0;
    }

    public void addIncome(int amount, boolean transfer, boolean taxes, int catagoryID, User loggedInUser) throws SQLException {
        int userID = getUserIDByNameAndPassword(loggedInUser);
        if (userID != -1) {
            dataBaseConnection.getStatement().execute(queryHelper.addOrMinusToBalance(amount, userID));
            dataBaseConnection.getStatement().execute(queryHelper.incomeCatagoryAddOrMinus(amount, catagoryID));
            dataBaseConnection.getStatement().execute(queryHelper.addIncome(amount, transfer, taxes, userID, catagoryID));
            System.out.println("Income Added");
        }
    }

    public void addCost(int amount, boolean hidden, int catagoryID, User loggedInUser) throws SQLException {
        int userID = getUserIDByNameAndPassword(loggedInUser);
        if (userID != -1) {
            dataBaseConnection.getStatement().execute(queryHelper.addOrMinusToBalance(-amount, userID));
            dataBaseConnection.getStatement().execute(queryHelper.costCatagoryAddOrMinus(-amount, catagoryID));
            dataBaseConnection.getStatement().execute(queryHelper.addCost(-amount, hidden, userID, catagoryID));
            System.out.println("Cost Added");
        }
    }

    public void readUsersFromDb() throws SQLException {
        resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.allUsersQuery);
        while (resultSet.next()) {
            userCollection.addOldUser(resultSet.getString(1), resultSet.getString(2));
            System.out.println("Users read from db");
        }
    }

    public void readPaymentsFromCatagory(User loggedInUser) throws SQLException {
        int userID = getUserIDByNameAndPassword(loggedInUser);
        if (userID != -1) {
            resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.allCostsFromDB(userID));
            while (resultSet.next()) {
                paymentCollection.addOldCost(catagoryCollection.getCatagoryByID(resultSet.getInt(2), false), resultSet.getInt(1),
                        resultSet.getDate(3), resultSet.getBoolean(4));
            }

            resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.allIncomeFromDB(userID));
            while (resultSet.next()) {
                paymentCollection.addOldIncome(catagoryCollection.getCatagoryByID(resultSet.getInt(2), true), resultSet.getInt(1),
                        resultSet.getDate(3), resultSet.getBoolean(4), resultSet.getBoolean(5));
            }
        }
    }

    public void readCategoryFrameDb(User loggedInUser) throws SQLException {
        int userID = getUserIDByNameAndPassword(loggedInUser);
        if (userID != -1) {
            resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.allCostCategoriesFromDB(userID));
            while (resultSet.next()) {
                catagoryCollection.getCatagoryByName(resultSet.getString(3)).setAmount(resultSet.getInt(1));
            }
            resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.allIncomeCategoriesFromDB(userID));
            while (resultSet.next()) {
                catagoryCollection.getCatagoryByName(resultSet.getString(3)).setAmount(resultSet.getInt(1));
            }
        }
    }

    private int getUserIDByNameAndPassword(User user) throws SQLException {
        resultSet = dataBaseConnection.getStatement().executeQuery(queryHelper.allUsersQuery);
        while (resultSet.next()) {
            if (user.getName().equals(resultSet.getString(1)) && user.getPassword().equals(resultSet.getString(2))) {
                return Integer.parseInt(resultSet.getString(3));
            }
        }
        return -1;
    }


}
