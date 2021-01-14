package com.JavaCode.project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        CatagoryCollection catagoryCollection = new CatagoryCollection();

        User user = new User("Nerijus");
        System.out.println("***************");
        System.out.println("Welcome " + user.getName());

        while (!userInput.equals("-")) {
            Menus.mainMenu();
            userInput = sc.nextLine();
            mainSwitch(userInput, user, catagoryCollection);
        }
    }

    public static void mainSwitch(String userInput, User loggedInUser, CatagoryCollection catagoryCollection) {
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                while (!userInput.equals("-")) {
                    Menus.incomeMenu();
                    userInput = sc.nextLine();
                    incomeSwitch(userInput, loggedInUser, catagoryCollection);
                }
                break;
            case "2":
                while (!userInput.equals("-")) {
                    Menus.costMenu();
                    userInput = sc.nextLine();
                    costSwitch(userInput, loggedInUser, catagoryCollection);
                }
                break;
            case "3":
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;
            case "4":
                System.out.println(catagoryCollection.printAllTransactions());
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;

            case "-":
                System.out.println("See you next time " + loggedInUser.getName());
                break;
        }
    }

    public static void incomeSwitch(String userInput, User loggedInUser, CatagoryCollection catagoryCollection) {

        switch (userInput) {
            case "1":
                askUserIncome(loggedInUser, catagoryCollection, "Salary");
                break;
            case "2":
                askUserIncome(loggedInUser, catagoryCollection, "Real estate for rent");
                break;
            case "3":
                askUserIncome(loggedInUser, catagoryCollection, "Scholarship");
                break;
            case "4":
                askUserIncome(loggedInUser, catagoryCollection, "Benefit");
                break;
            case "5":
                askUserIncome(loggedInUser, catagoryCollection, "Individual activities");
                break;
            case "6":
                askUserIncome(loggedInUser, catagoryCollection, "Gifts");
                break;
            case "7":
                askUserIncome(loggedInUser, catagoryCollection, "Other");
                break;
            case "-":
                break;
        }
    }



    public static void costSwitch(String userInput, User loggedInUser, CatagoryCollection catagoryCollection) {
        switch (userInput) {
            case "1":
                askUserCosts(loggedInUser,catagoryCollection,"Shop");
                break;
            case "2":
                askUserCosts(loggedInUser,catagoryCollection,"Leasing fees");
                break;
            case "3":
                askUserCosts(loggedInUser,catagoryCollection,"Housing taxes");
                break;
            case "4":
                askUserCosts(loggedInUser,catagoryCollection,"Studies");
                break;
            case "5":
                askUserCosts(loggedInUser,catagoryCollection,"Entertainment");
                break;
            case "6":
                askUserCosts(loggedInUser,catagoryCollection,"Car");
                break;
            case "7":
                askUserCosts(loggedInUser,catagoryCollection,"Clothing");
                break;
            case "8":
                askUserCosts(loggedInUser,catagoryCollection,"Health");
                break;
            case "9":
                askUserCosts(loggedInUser,catagoryCollection,"Other");
                break;
            case "-":
                break;
        }
    }

    private static void askUserIncome(User loggedInUser, CatagoryCollection catagoryCollection, String catagory) {
        Scanner sc = new Scanner(System.in);

        Menus.amountMenu();
        int amount = sc.nextInt();

        Menus.transferToBalance();
        int inputOne = sc.nextInt();

        Menus.taxes();
        int inputTwo = sc.nextInt();

        if (trueOrFalse(inputOne)){
            loggedInUser.setBalance(loggedInUser.getBalance() + amount);
        }
        catagoryCollection.addIncome(catagory, amount, trueOrFalse(inputOne), trueOrFalse(inputTwo));
    }

    private static void askUserCosts(User loggedInUser, CatagoryCollection catagoryCollection, String catagory) {
        Scanner sc = new Scanner(System.in);

        Menus.amountMenu();
        int amount = sc.nextInt();

        Menus.hidden();
        int inputOne = sc.nextInt();

        loggedInUser.setBalance(loggedInUser.getBalance() - amount);
        catagoryCollection.addCosts(catagory, amount, trueOrFalse(inputOne));
    }

    private static boolean trueOrFalse(int i) {
        return i == 1;
    }
}