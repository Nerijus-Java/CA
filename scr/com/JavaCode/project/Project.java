package com.JavaCode.project;

import com.JavaCode.project.Payments.PaymentsFileReader;
import com.JavaCode.project.gui.SetUp;

public class Project {

    public static void main(String[] args) {
        //Login and Users
        SetUp guiManager = new SetUp();


        //Payments and Category's


        guiManager.setUpLoginFrame();
        guiManager.runLoginFrame();

        PaymentsFileReader paymentsFileReader = new PaymentsFileReader(paymentCollection, catagoryHelper, loggedInUser);
        paymentsFileReader.readFile();


    }




}