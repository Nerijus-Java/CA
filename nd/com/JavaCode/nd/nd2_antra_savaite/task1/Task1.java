package com.JavaCode.nd.nd2_antra_savaite.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 6 word sentence" );
        System.out.print("Enter: ");

        String userInput = sc.nextLine();

        char[] chars = userInput.toCharArray();
        printArray(chars);

        String[] strings = changeTwoWordsPlaces(0,5,charsToStrings(chars));
        printArray(strings);

        strings = changeTwoWordsPlaces(1,4,strings);
        printArray(strings);
        strings = changeTwoWordsPlaces(2,3,strings);
        printArray(strings);


    }

    public static String[] charsToStrings(char[] chars){
        String[] strings = new String[6];
        String holder = "";
        int count = 0;
        for(char c : chars){
            if (c == ' '){
                strings[count] = holder;
                holder = "";
                ++count;
            }else {
                holder += c;
            }
        }
        strings[count] = holder;
        return strings;
    }

    public static void printArray(String[] array){
        for (String s : array){
            if (s.equals(" ")){

            }else {
                System.out.print(s + " ");
            }
        }
        System.out.println('\n'+"_______________");
    }

    public static void printArray(char[] array){
        for (char i : array){
            if (i == ' '){

            }else {
                System.out.print(i + " ");
            }
        }
        System.out.println('\n'+"_______________");
    }

    public static String[] changeTwoWordsPlaces(int wordOne, int wordTwo, String[] array){
        String[] newArray = array;
        String wordOneHolder = array[wordOne];
        String wordTwoHolder = array[wordTwo];

        newArray[wordOne] = wordTwoHolder;
        newArray[wordTwo] = wordOneHolder;

        return newArray;
    }
}
