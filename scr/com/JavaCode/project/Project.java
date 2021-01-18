package com.JavaCode.project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        Menus menu = new Menus();
        CatagoryHelper catagoryHelper = new CatagoryHelper();

        User user = new User("Nerijus");
        System.out.println("***************");
        System.out.println("Welcome " + user.getName());

        while (!userInput.equals("-")) {
            menu.mainMenu();
            userInput = sc.nextLine();
            mainSwitch(userInput, user, catagoryHelper);
        }
    }

    public static void mainSwitch(String userInput, User loggedInUser, CatagoryHelper catagoryHelper) {
        Menus menu = new Menus();
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                while (!userInput.equals("-")) {
                    menu.incomeMenu();
                    userInput = sc.nextLine();
                    incomeSwitch(userInput, loggedInUser, catagoryHelper);
                }
                break;
            case "2":
                while (!userInput.equals("-")) {
                    menu.costMenu();
                    userInput = sc.nextLine();
                    costSwitch(userInput, loggedInUser, catagoryHelper);
                }
                break;
            case "3":
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;
            case "4":
                System.out.println(catagoryHelper.printAllTransactions());
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;

            case "-":
                System.out.println("See you next time " + loggedInUser.getName());
                break;
        }
    }

    public static void incomeSwitch(String userInput, User loggedInUser, CatagoryHelper catagoryHelper) {
        Menus menu = new Menus();
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                menu.amountMenu();
                int amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                catagoryHelper.add("Salary", amount);
                break;
            case "2":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                catagoryHelper.add("Real estate for rent", amount);
                break;
            case "3":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                catagoryHelper.add("Scholarship", amount);
                break;
            case "4":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                catagoryHelper.add("Benefit", amount);
                break;
            case "5":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                catagoryHelper.add("Individual activities", amount);
                break;
            case "6":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                catagoryHelper.add("Gifts", amount);
                break;
            case "7":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                catagoryHelper.add("Other", amount);
                break;
            case "-":
                break;
        }
    }

    public static void costSwitch(String userInput, User loggedInUser, CatagoryHelper catagoryHelper) {
        Menus menu = new Menus();
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                menu.amountMenu();
                int amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("Shop", -amount);
                break;
            case "2":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("Leasing fees", -amount);
                break;
            case "3":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("Housing taxes", -amount);
                break;
            case "4":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("Studies", -amount);
                break;
            case "5":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("Entertainment", -amount);
                break;
            case "6":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("car", -amount);
                break;
            case "7":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("Clothing", -amount);
                break;
            case "8":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("Health", -amount);
                break;
            case "9":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                catagoryHelper.add("Other", -amount);
                break;
            case "-":
                break;
        }
    }

}