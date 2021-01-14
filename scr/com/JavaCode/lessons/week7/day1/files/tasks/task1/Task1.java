package com.JavaCode.lessons.week7.day1.files.tasks.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = " ";
        PersonFileWriter fw = new PersonFileWriter();

        while (!input.equals("-")) {
            menu();
            input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println(fw.PrintPeople());
                    break;

                case "2":
                    System.out.print("Enter persons name :");
                    String name = sc.nextLine();
                    System.out.print("Enter persons age :");
                    String age = sc.nextLine();
                    fw.WritePerson(new Person(name, Integer.parseInt(age)));

                case "-":
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("____________");
        System.out.println("[1] print");
        System.out.println("[2] addIncome");
        System.out.println("[-] back");
        System.out.print("Enter :");
    }
}
