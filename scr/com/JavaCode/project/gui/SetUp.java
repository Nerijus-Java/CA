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

import javax.swing.*;

public class SetUp {

    private JFrame loginFrame;
    private JFrame mainFrame;

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
        UserCollection userCollection = new UserCollection();
        UserReader userReader = new UserReader(userCollection);
        userReader.readFile();
        Login loginGUI = new Login(userCollection, this);
        this.loginFrame = new JFrame("Income and Costs");
        this.loginFrame.setContentPane(loginGUI.getMainPanel());
        this.loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.loginFrame.pack();
    }

    public void setUpMainFrame(User loggedInUser) {
        CatagoryCollection catagoryCollection = new CatagoryCollection();
        CatagoryHelper catagoryHelper = new CatagoryHelper(catagoryCollection);

        PaymentCollection paymentCollection = new PaymentCollection();
        PaymentsFileWriter paymentsFileWriter = new PaymentsFileWriter();
        PaymentsFileReader paymentsFileReader = new PaymentsFileReader(paymentCollection, catagoryHelper, loggedInUser);
        paymentsFileReader.readFile();

        this.mainFrame = new JFrame("Income and Costs");
        this.mainFrame.setContentPane(new Program(paymentCollection, paymentsFileWriter,
                loggedInUser, catagoryCollection, paymentsFileReader).getMainPanel());
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.pack();
    }
}
