package com.JavaCode.nd.nd1_methods_and_more.task13_phone_keypad;

import java.util.Scanner;

public class Task13_Phone_Keypad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] letters = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

        System.out.print("Enter:");
        String enteredNumbers = sc.nextLine();

        char[] toChar = enteredNumbers.toCharArray();

        String[] numbers = charsToStrings(toChar,findAmountOfVariables(toChar));

        System.out.println(arrayToString(numbers,letters));
    }

    public static String[] charsToStrings(char[] chars, int AmountOfVariables){
        String[] strings = new String[AmountOfVariables];
        String holder = "";
        int count = 0;
        for(char c : chars){
            if (c == ','){
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

    public static int findAmountOfVariables(char[] chars){
        int spaces = 0;
        for (char c : chars){
            if (c == ','){
                spaces++;
            }
        }
        return spaces + 1;
    }

    public static String arrayToString (String[] words , String[] letters){
        String wordTwo = "";
        for (String n : words){
            wordTwo += numberToPhoneKeyString(n,letters);
        }
        return wordTwo;
    }

    private static String numberToPhoneKeyString (String number , String[] letters){
        if (number.length() == 1){
            return letters[Integer.parseInt(number.substring(0,1))].substring(0,1);
        } else if (number.length() == 2){
            return letters[Integer.parseInt(number.substring(0,1))].substring(1,2);
        } else if (number.length() == 3){
            return letters[Integer.parseInt(number.substring(0,1))].substring(2,3);
        }else if (number.length() == 4){
            return letters[Integer.parseInt(number.substring(0,1))].substring(4,5);
        }
        return " ";
    }

}