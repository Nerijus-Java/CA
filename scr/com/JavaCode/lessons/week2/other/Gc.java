package com.JavaCode.lessons.week2.other;

import java.util.Scanner;

public class Gc {

// Not done

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Save[] saves = new Save[5];

        saves = newSaves(saves, saves.length-1);

    }

    public static void printAllInfo(Save[] saves){
        for (Save info : saves){
            System.out.println(info.getInfo());
        }
    }

    public static void userInput(Save saves , String input){
        saves.setInfo(input);
    }

    public static Save[] newSaves (Save[] saves, int amount){
        for (Save save : saves){
            save = new Save();
        }
        return saves;
    }
}
