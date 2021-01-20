package com.JavaCode.nd.nd2.nd2_Pinigu_skaiciavimas;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance");
        float input = sc.nextFloat();

        System.out.println(getInNotes(input));
    }

    public static String getInNotes(float money) {
        int note500 = 0, note200 = 0, note100 = 0, note50 = 0, note20 = 0, note10 = 0, note5 = 0;
        float euro2 = 0, euro1 = 0, cent50 = 0, cent20 = 0, cent10 = 0, cent05 = 0, cent02 = 0, cent01 = 0;
        while (money != 0) {
            if (money >= 500) {
                note500++;
                money -= 500;
            } else if (money >= 200) {
                note200++;
                money -= 200;
            } else if (money >= 100) {
                note100++;
                money -= 100;
            } else if (money >= 50) {
                note50++;
                money -= 50;
            } else if (money >= 20) {
                note20++;
                money -= 20;
            } else if (money >= 10) {
                note10++;
                money -= 10;
            } else if (money >= 5) {
                note5++;
                money -= 5;
            } else if (money >= 2) {
                euro2++;
                money -= 2;
            } else if (money >= 1) {
                euro1++;
                money -= 1;
            } else if (money >= 0.5) {
                cent50++;
                money -= 0.5;
            } else if (money >= 0.20) {
                cent20++;
                money -= 0.2;
            } else if (money >= 0.10) {
                cent10++;
                money -= 0.1;
            }else if (money >= 0.05){
                cent05++;
                money -= 0.05;
            }else if (money >= 0.02){
                cent02++;
                money -= 0.02;
            }else if (money >= 0.01){
                cent01++;
                money -= 0.01;
            }
        }
        return "500 : " + note500 + '\n' + "200 : " + note200 + '\n' + "100 : " + note100 + '\n' +
                "50 : " + note50 + '\n' + "20 : " + note20 + '\n' + "10 : " + note10 + '\n' +
                "5 : " + note5 + '\n' + "2 : " + euro2 + '\n' + "1 : " + euro1 + '\n' + "0.50 : " + cent50 + '\n' +
                "0.20 : " + cent20 + '\n' + "0.10 : " + cent10 + '\n' + "0.05 : " + cent05 + '\n' +
                "0.02 : " + cent02 + '\n' + "0.01 : " + cent01 + '\n' ;
    }
}
