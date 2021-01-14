package com.JavaCode.project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        PaymentCollection payments = new PaymentCollection();

        User user = new User("Nerijus");
        System.out.println("***************");
        System.out.println("Welcome " + user.getName());

        while (!userInput.equals("-")) {
            Menu.mainMenu();
            userInput = sc.nextLine();
            mainSwitch(userInput, user, payments);
        }
    }

    public static void mainSwitch(String userInput, User loggedInUser, PaymentCollection payments) {
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                while (!userInput.equals("-")) {
                    Menu.incomeMenu();
                    userInput = sc.nextLine();
                    incomeSwitch(userInput, loggedInUser, payments);
                }
                break;
            case "2":
                while (!userInput.equals("-")) {
                    Menu.costMenu();
                    userInput = sc.nextLine();
                    costSwitch(userInput, loggedInUser, payments);
                }
                break;
            case "3":
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;
            case "4":
//                System.out.println(payments.printAllTransactions());
                payments.print();
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;

            case "-":
                System.out.println("See you next time " + loggedInUser.getName());
                break;
        }
    }

    public static void incomeSwitch(String userInput, User loggedInUser, PaymentCollection payments) {

        switch (userInput) {
            case "1":
                askUserIncome(loggedInUser, payments, "Salary");
                break;
            case "2":
                askUserIncome(loggedInUser, payments, "Real estate for rent");
                break;
            case "3":
                askUserIncome(loggedInUser, payments, "Scholarship");
                break;
            case "4":
                askUserIncome(loggedInUser, payments, "Benefit");
                break;
            case "5":
                askUserIncome(loggedInUser, payments, "Individual activities");
                break;
            case "6":
                askUserIncome(loggedInUser, payments, "Gifts");
                break;
            case "7":
                askUserIncome(loggedInUser, payments, "Other");
                break;
            case "-":
                break;
        }
    }

    public static void costSwitch(String userInput, User loggedInUser, PaymentCollection payments) {
        switch (userInput) {
            case "1":
                askUserCosts(loggedInUser, payments,"Shop");
                break;
            case "2":
                askUserCosts(loggedInUser, payments,"Leasing fees");
                break;
            case "3":
                askUserCosts(loggedInUser, payments,"Housing taxes");
                break;
            case "4":
                askUserCosts(loggedInUser, payments,"Studies");
                break;
            case "5":
                askUserCosts(loggedInUser, payments,"Entertainment");
                break;
            case "6":
                askUserCosts(loggedInUser, payments,"Car");
                break;
            case "7":
                askUserCosts(loggedInUser, payments,"Clothing");
                break;
            case "8":
                askUserCosts(loggedInUser, payments,"Health");
                break;
            case "9":
                askUserCosts(loggedInUser, payments,"Other");
                break;
            case "-":
                break;
        }
    }

    private static void askUserIncome(User loggedInUser, PaymentCollection payments, String catagory) {
        Scanner sc = new Scanner(System.in);

        Menu.amountMenu();
        int amount = sc.nextInt();

        Menu.transferToBalance();
        int inputOne = sc.nextInt();

        Menu.taxes();
        int inputTwo = sc.nextInt();

        if (trueOrFalse(inputOne)){
            loggedInUser.setBalance(loggedInUser.getBalance() + amount);
        }
        payments.addIncome(catagory, amount, trueOrFalse(inputOne), trueOrFalse(inputTwo));
    }

    private static void askUserCosts(User loggedInUser, PaymentCollection payments, String catagory) {
        Scanner sc = new Scanner(System.in);

        Menu.amountMenu();
        int amount = sc.nextInt();

        Menu.hidden();
        int inputOne = sc.nextInt();

        loggedInUser.setBalance(loggedInUser.getBalance() - amount);
        payments.addCosts(catagory, amount, trueOrFalse(inputOne));
    }

    private static boolean trueOrFalse(int i) {
        return i == 1;
    }
}