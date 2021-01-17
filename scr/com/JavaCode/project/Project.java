package com.JavaCode.project;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.PaymentsFileReader;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.jframes.Program;
import com.JavaCode.project.user.User;

import javax.swing.*;

public class Project {

    public static void main(String[] args) {

        PaymentCollection payments = new PaymentCollection();
        CatagoryHelper catagoryHelper = new CatagoryHelper();
        User loggedInUser = new User("Nerijus");
        PaymentsFileReader paymentsFileReader = new PaymentsFileReader(payments,catagoryHelper,loggedInUser);


        paymentsFileReader.readFile();

        setUpMainFrame(payments,catagoryHelper,paymentsFileReader,loggedInUser);

    }


    public static void setUpMainFrame(PaymentCollection payments, CatagoryHelper catagoryHelper,
                                      PaymentsFileReader paymentsFileReader, User loggedInUser){

        JFrame mainFrame = new JFrame("Income and Costs");
        mainFrame.setContentPane(new Program(payments,catagoryHelper,paymentsFileReader,loggedInUser).getMainPanel());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}