package com.JavaCode.project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        Menus menu = new Menus();
        TransactionsArray transactionsArray = new TransactionsArray();

        User user = new User("Nerijus");
        System.out.println("***************");
        System.out.println("Welcome " + user.getName());

        while (!userInput.equals("-")) {
            menu.mainMenu();
            userInput = sc.nextLine();
            mainSwitch(userInput, user, transactionsArray);
        }
    }

    public static void mainSwitch(String userInput, User loggedInUser, TransactionsArray transactionsArray) {
        Menus menu = new Menus();
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                while (!userInput.equals("-")) {
                    menu.incomeMenu();
                    userInput = sc.nextLine();
                    incomeSwitch(userInput, loggedInUser, transactionsArray);
                }
                break;
            case "2":
                while (!userInput.equals("-")) {
                    menu.costMenu();
                    userInput = sc.nextLine();
                    costSwitch(userInput, loggedInUser, transactionsArray);
                }
                break;
            case "3":
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;
            case "4":
                System.out.println(transactionsArray.printAllTransactions());
                System.out.println("Your balance is : €" + loggedInUser.getBalance());
                break;

            case "-":
                System.out.println("See you next time " + loggedInUser.getName());
                break;
        }
    }

    public static void incomeSwitch(String userInput, User loggedInUser, TransactionsArray transactionsArray) {
        Menus menu = new Menus();
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                menu.amountMenu();
                int amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                transactionsArray.add("Salary", amount);
                break;
            case "2":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                transactionsArray.add("Real estate for rent", amount);
                break;
            case "3":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                transactionsArray.add("Scholarship", amount);
                break;
            case "4":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                transactionsArray.add("Benefit", amount);
                break;
            case "5":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                transactionsArray.add("Individual activities", amount);
                break;
            case "6":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                transactionsArray.add("Gifts", amount);
                break;
            case "7":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() + amount);
                transactionsArray.add("Other", amount);
                break;
            case "-":
                break;
        }
    }

    public static void costSwitch(String userInput, User loggedInUser, TransactionsArray transactionsArray) {
        Menus menu = new Menus();
        Scanner sc = new Scanner(System.in);
        switch (userInput) {
            case "1":
                menu.amountMenu();
                int amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("Shop", -amount);
                break;
            case "2":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("Leasing fees", -amount);
                break;
            case "3":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("Housing taxes", -amount);
                break;
            case "4":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("Studies", -amount);
                break;
            case "5":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("Entertainment", -amount);
                break;
            case "6":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("car", -amount);
                break;
            case "7":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("Clothing", -amount);
                break;
            case "8":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("Health", -amount);
                break;
            case "9":
                menu.amountMenu();
                amount = sc.nextInt();
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                transactionsArray.add("Other", -amount);
                break;
            case "-":
                break;
        }
    }

}