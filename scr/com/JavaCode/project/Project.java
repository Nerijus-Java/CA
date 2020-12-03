package com.JavaCode.project;

import java.util.Scanner;

public class Project{

    public static void main(String[] args) {
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        Menus menu = new Menus();

        User user = new User("Nerijus");
        System.out.println("***************");
        System.out.println("Welcome " + user.getName());

        while (!userInput.equals("-")) {
            menu.mainMenu();
            userInput = sc.nextLine();
            mainSwitch(userInput, user);
        }
    }

    public static void mainSwitch(String userInput, User loggedInUser){
        Menus menu = new Menus();
        Scanner sc = new Scanner(System.in);

        switch (userInput){
            case "1":
                while (!userInput.equals("-")) {
                    menu.incomeMenu();
                    userInput = sc.nextLine();
                    incomeSwitch(userInput, loggedInUser);
                }
                break;
            case "2":
                break;
            case "3":
                System.out.println("Your balance is " + loggedInUser.getBalance());
                break;
            case "-":
                System.out.println("See you next time " + loggedInUser.getName());
                break;
            }
    }

    public static void incomeSwitch(String userInput, User loggedInUser){
        switch (userInput){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "-":
                break;
        }
    }



}