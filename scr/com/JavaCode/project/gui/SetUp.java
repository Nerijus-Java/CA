package com.JavaCode.project.gui;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.catagory.CatagoryCollection;
import com.JavaCode.project.database.DataBaseConnection;
import com.JavaCode.project.database.DatabaseMethods;
import com.JavaCode.project.gui.login.Login;
import com.JavaCode.project.model.User;
import com.JavaCode.project.user.UserCollection;

import javax.swing.*;
import java.sql.SQLException;

public class SetUp {

    private JFrame loginFrame;
    private JFrame mainFrame;
    private final DataBaseConnection dataBaseConnection;

    private CatagoryCollection catagoryCollection;
    private PaymentCollection paymentCollection;
    private DatabaseMethods databaseMethods;

    public SetUp() throws SQLException {
        dataBaseConnection = new DataBaseConnection();
    }

    public void run(){
        setUpLoginFrame();
        runLoginFrame();
    }

    public void runLoginFrame() {
        this.loginFrame.setVisible(true);
    }

    public void runMainFrame() {
        this.loginFrame.setVisible(false);
        this.mainFrame.setVisible(true);
    }

    public void setUpLoginFrame() {
        catagoryCollection = new CatagoryCollection();
        paymentCollection = new PaymentCollection();
        UserCollection userCollection = new UserCollection();
        databaseMethods = new DatabaseMethods(dataBaseConnection,catagoryCollection,paymentCollection,userCollection);

        userCollection.setDatabaseMethods(databaseMethods);
        paymentCollection.setDatabaseMethods(databaseMethods);

        try {
            databaseMethods.readUsersFromDb();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

//        UserReader userReader = new UserReader(userCollection);
//        userReader.readFile();

        Login loginGUI = new Login(userCollection, this);
        this.loginFrame = new JFrame("Income and Costs");
        this.loginFrame.setContentPane(loginGUI.getMainPanel());
        this.loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.loginFrame.pack();
    }

    public void setUpMainFrame(User loggedInUser) throws SQLException {

        databaseMethods.readCategoryFrameDb(loggedInUser);
        databaseMethods.readPaymentsFromCatagory(loggedInUser);
//        PaymentsFileWriter paymentsFileWriter = new PaymentsFileWriter();
//        PaymentsFileReader paymentsFileReader = new PaymentsFileReader(paymentCollection, catagoryHelper, loggedInUser);
//        paymentsFileReader.readFile();

        this.mainFrame = new JFrame("Income and Costs");
        this.mainFrame.setContentPane(new Program(paymentCollection,
                loggedInUser, catagoryCollection).getMainPanel());
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.pack();
    }
}
