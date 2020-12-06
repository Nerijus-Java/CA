package com.JavaCode.nd.nd2_tankas;

import java.util.Scanner;

public class Task_Tankas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tank tankOne = new Tank(0,0,0,"North");

        String userInput = " ";
        while(!userInput.equals("-")){
            menuTank();
            userInput = sc.nextLine();

            switch (userInput){
                case "1":
                    game(tankOne,userInput);
                    break;
                case "-":
                    break;
            }
        }
    }

    public static void game(Tank tank, String userInput){
        Scanner sc = new Scanner(System.in);

        while (!userInput.equals("-")){
            mainMenu();
            userInput = sc.nextLine();

            switch (userInput){
                case "1":
                    move(tank, userInput);
                    break;
                case "2":
                    System.out.println(tank.fire());
                    System.out.println("Shots fired: " + tank.getShotsFired());
                    break;
                case "3":
                    stats(tank);
                    break;
                case "4":
                    tank.restart();
                    System.out.println("New Positions " + tank.getPositionA() + ", " + tank.getPositionB());
                    break;
                case"-":
                    break;
            }
        }
    }

    public static void move(Tank tank, String userInput){
        Scanner sc = new Scanner(System.in);

        while (!userInput.equals("-")) {

            userInput = sc.nextLine();
            moveMenu();
            switch (userInput) {
                case "1":
                    tank.moveForward();
                    System.out.println("Facing " + tank.getFace());
                    break;
                case "2":
                    tank.moveBackwards();
                    System.out.println("Facing " + tank.getFace());
                    break;
                case "3":
                    tank.moveLeft();
                    System.out.println("Facing " + tank.getFace());
                    break;
                case "4":
                    tank.moveRight();
                    System.out.println("Facing " + tank.getFace());
                    break;
                case "5":
                    System.out.println("Pa " + tank.getPositionA() + ", Pb " + tank.getPositionB());
                    System.out.println("Face :" + tank.getFace());
                    break;
                case "-":
                    break;
            }
        }
    }

    public static void stats(Tank tank){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Pa :" + tank.getPositionA() + ", Pb :" + tank.getPositionB());
        System.out.println("Face :" + tank.getFace());
        System.out.println("Shots fired :" + tank.getShotsFired());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
    }

    public static void moveMenu(){
        System.out.println("----------------------");
        System.out.println("[1] Forwards");
        System.out.println("[2] Backwards");
        System.out.println("[3] Left");
        System.out.println("[4] Right");
        System.out.println("[5] Get Position");
        System.out.println("[-] Return");
        System.out.println("----------------------");
    }

    public static void menuTank(){
        System.out.println();
        System.out.println("######################");
        System.out.println("########-TANK-########");
        System.out.println("######################");
        System.out.println("______________________");
        System.out.println("|****-[1] Start-*****|");
        System.out.println("|****-[-] Exit-******|");
        System.out.println("######################");
    }

    public static void mainMenu(){
        System.out.println("----------------------");
        System.out.println("[1] Move");
        System.out.println("[2] Fire");
        System.out.println("[3] Stats");
        System.out.println("[4] Restart");
        System.out.println("[-] End");
        System.out.println("----------------------");
    }

}
