package com.JavaCode.project;

import com.JavaCode.project.Payments.PaymentCollection;
import com.JavaCode.project.Payments.PaymentsFileReader;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.jframes.Program;
import com.JavaCode.project.user.User;

import javax.swing.*;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        String userInput = "";
        Scanner sc = new Scanner(System.in);



        PaymentCollection payments = new PaymentCollection();
        CatagoryHelper catagoryHelper = new CatagoryHelper();
        PaymentsFileReader paymentsFileReader = new PaymentsFileReader(payments,catagoryHelper);


        paymentsFileReader.readFile();

        setUpMainFrame(payments,catagoryHelper,paymentsFileReader);

        User user = new User("Nerijus");
        System.out.println("***************");
        System.out.println("Welcome " + user.getName());

        while (!userInput.equals("-")) {
            Menu.mainMenu();
            userInput = sc.nextLine();
            mainSwitch(userInput, user, payments, catagoryHelper);
        }

    }


    //interactive switches
    public static void mainSwitch(String userInput, User loggedInUser, PaymentCollection payments, CatagoryHelper catagoryHelper) {
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                while (!userInput.equals("-")) {
                    Menu.incomeMenu();
                    userInput = sc.nextLine();
                    incomeSwitch(userInput, loggedInUser, payments, catagoryHelper);
                }
                break;
            case "2":
                while (!userInput.equals("-")) {
                    Menu.costMenu();
                    userInput = sc.nextLine();
                    costSwitch(userInput, loggedInUser, payments, catagoryHelper);
                }
                break;
            case "3":
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;
            case "4":
                while (!userInput.equals("-")){
                    Menu.getCheckMenu();
                    userInput = sc.nextLine();
                    checkSwitch(userInput, loggedInUser, payments, catagoryHelper);
                }
                break;
            case "-":
                System.out.println("See you next time " + loggedInUser.getName());
                break;
        }
    }

    public static void checkSwitch(String userInput, User loggedInUser, PaymentCollection payments, CatagoryHelper catagoryHelper) {
        switch (userInput) {
            case "1":
                payments.print();
                break;
            case "2":
                System.out.println("User :" + loggedInUser.getName());
                System.out.println(catagoryHelper.getHighestIncomeCatagory().getName());
                System.out.println("Amount :" + catagoryHelper.getHighestIncomeCatagory().getAmount());
                break;
            case "3":
                System.out.println("User :" + loggedInUser.getName());
                System.out.println(catagoryHelper.getLowestIncomeCatagory().getName());
                System.out.println("Amount :" + catagoryHelper.getLowestIncomeCatagory().getAmount());
                break;
            case "4":
                System.out.println("User :" + loggedInUser.getName());
                System.out.println(catagoryHelper.getMostCostCatagory().getName());
                System.out.println("Amount :" + catagoryHelper.getMostCostCatagory().getAmount());
                break;
            case "5":
                System.out.println("User :" + loggedInUser.getName());
                System.out.println(catagoryHelper.getLowestCostCatagory().getName());
                System.out.println("Amount :" + catagoryHelper.getLowestCostCatagory().getAmount());
                break;
            case "-":
                break;
        }
    }

    public static void incomeSwitch(String userInput, User loggedInUser, PaymentCollection payments, CatagoryHelper catagoryHelper) {
        switch (userInput) {
            case "1":
                askUserIncome(loggedInUser, payments, catagoryHelper,0);
                break;
            case "2":
                askUserIncome(loggedInUser, payments, catagoryHelper,1);
                break;
            case "3":
                askUserIncome(loggedInUser, payments, catagoryHelper,2);
                break;
            case "4":
                askUserIncome(loggedInUser, payments, catagoryHelper,3);
                break;
            case "5":
                askUserIncome(loggedInUser, payments, catagoryHelper,4);
                break;
            case "6":
                askUserIncome(loggedInUser, payments, catagoryHelper,5);
                break;
            case "7":
                askUserIncome(loggedInUser, payments, catagoryHelper,6);
                break;
            case "-":
                break;
        }
    }

    public static void costSwitch(String userInput, User loggedInUser, PaymentCollection payments, CatagoryHelper catagoryHelper) {
        switch (userInput) {
            case "1":
                askUserCosts(loggedInUser, payments,catagoryHelper,7);
                break;
            case "2":
                askUserCosts(loggedInUser, payments,catagoryHelper,8);
                break;
            case "3":
                askUserCosts(loggedInUser, payments,catagoryHelper,9);
                break;
            case "4":
                askUserCosts(loggedInUser, payments,catagoryHelper,10);
                break;
            case "5":
                askUserCosts(loggedInUser, payments,catagoryHelper,11);
                break;
            case "6":
                askUserCosts(loggedInUser, payments,catagoryHelper,12);
                break;
            case "7":
                askUserCosts(loggedInUser, payments,catagoryHelper,13);
                break;
            case "8":
                askUserCosts(loggedInUser, payments,catagoryHelper,14);
                break;
            case "9":
                askUserCosts(loggedInUser, payments,catagoryHelper,15);
                break;
            case "-":
                break;
        }
    }


    //ask
    private static void askUserIncome(User loggedInUser, PaymentCollection payments, CatagoryHelper catagoryHelper, int catNumber) {
        Scanner sc = new Scanner(System.in);

        Menu.amountMenu();
        int amount = sc.nextInt();

        Menu.transferToBalance();
        int inputOne = sc.nextInt();

        Menu.taxes();
        int inputTwo = sc.nextInt();

        if (trueOrFalse(inputOne)){
            catagoryHelper.getCatagory(catNumber).setAmount(loggedInUser.getBalance() + amount);
            loggedInUser.setBalance(loggedInUser.getBalance() + amount);
        }
        payments.addIncome(catagoryHelper.getCatagory(catNumber), amount, trueOrFalse(inputOne), trueOrFalse(inputTwo));
    }

    private static void askUserCosts(User loggedInUser, PaymentCollection payments, CatagoryHelper catagoryHelper, int catNumber ) {
        Scanner sc = new Scanner(System.in);

        Menu.amountMenu();
        int amount = sc.nextInt();

        Menu.hidden();
        int inputOne = sc.nextInt();

        catagoryHelper.getCatagory(catNumber).setAmount(loggedInUser.getBalance() - amount);
        loggedInUser.setBalance(loggedInUser.getBalance() - amount);

        payments.addCosts(catagoryHelper.getCatagory(catNumber), -amount, trueOrFalse(inputOne));
    }


    //Regular Methods
    private static boolean trueOrFalse(int i) {
        return i == 1;
    }

    public static void setUpMainFrame(PaymentCollection payments, CatagoryHelper catagoryHelper,PaymentsFileReader paymentsFileReader){

        JFrame mainFrame = new JFrame("Income and Costs");
        mainFrame.setContentPane(new Program(payments,catagoryHelper,paymentsFileReader).getMainPanel());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}