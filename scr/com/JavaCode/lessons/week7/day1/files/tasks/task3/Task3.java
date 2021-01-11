package com.JavaCode.lessons.week7.day1.files.tasks.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = " ";
        AutoMobilFileWriter fw = new AutoMobilFileWriter();

        while (!input.equals("-")) {
            menu();
            input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println(fw.PrintCar());
                    break;

                case "2":
                    System.out.print("Enter persons name :");
                    String name = sc.nextLine();
                    System.out.print("Enter car make :");
                    String make = sc.nextLine();
                    System.out.print("Enter car number :");
                    String number = sc.nextLine();
                    System.out.print("Enter km :");
                    String km = sc.nextLine();

                    fw.WriteCar(new AutoMobil(name, make, number, Integer.parseInt(km)));
                case "-":
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("____________");
        System.out.println("[1] print");
        System.out.println("[2] add");
        System.out.println("[-] back");
        System.out.print("Enter :");
    }
}
