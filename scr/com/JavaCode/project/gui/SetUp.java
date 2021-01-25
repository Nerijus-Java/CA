package com.JavaCode.project.gui;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.PaymentsFileReader;
import com.JavaCode.project.Payments.PaymentsFileWriter;
import com.JavaCode.project.catagory.CatagoryCollection;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.gui.login.Login;
import com.JavaCode.project.user.User;
import com.JavaCode.project.user.UserCollection;
import com.JavaCode.project.user.UserReader;
import com.JavaCode.project.user.UserWriter;

import javax.swing.*;

public class SetUp {

    private JFrame loginFrame;
    private JFrame mainFrame;
    private Login loginGUI;
    private UserReader userReader;
    private PaymentsFileReader paymentsFileReader;

    public void runLoginFrame() {
        this.loginFrame.setVisible(true);
    }

    public void runMainFrame() {
        this.loginFrame.setVisible(false);
        this.mainFrame.setVisible(true);
    }

    public void setUpLoginFrame() {
        UserCollection userCollection = new UserCollection();
        this.userReader = new UserReader(userCollection);
        UserWriter userWriter = new UserWriter();

        this.loginGUI = new Login(userCollection, userWriter, this);
        this.loginFrame = new JFrame("Income and Costs");
        this.loginFrame.setContentPane(this.loginGUI.getMainPanel());
        this.loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.loginFrame.pack();
    }

    public void setUpMainFrame(User loggedInUser) {
        CatagoryCollection catagoryCollection = new CatagoryCollection();
        CatagoryHelper catagoryHelper = new CatagoryHelper(catagoryCollection);
        PaymentCollection paymentCollection = new PaymentCollection();
        PaymentsFileWriter paymentsFileWriter = new PaymentsFileWriter();

        this.paymentsFileReader = new PaymentsFileReader(paymentCollection,catagoryHelper,loggedInUser);
        this.mainFrame = new JFrame("Income and Costs");
        this.mainFrame.setContentPane(new Program(paymentCollection, paymentsFileWriter,
                loggedInUser, catagoryCollection).getMainPanel());
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.pack();
    }

    public Login getLoginGUI() {
        return loginGUI;
    }

    public JFrame getLoginFrame() {
        return loginFrame;
    }

    public UserReader getUserReader() {
        return userReader;
    }
}
