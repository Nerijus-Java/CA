package com.JavaCode.nd.nd1_methods_and_more.task13_phone_keypad;

import java.util.ArrayList;
import java.util.Scanner;

public class Task13_Phone_Keypad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] letters = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

        System.out.print("Enter:");
        String enteredNumbers = sc.nextLine();

        char[] toChar = enteredNumbers.toCharArray();
        ArrayList<String> enteredNumbersArray = charArrayToArrayList(toChar);

        System.out.println(arrayToString(enteredNumbersArray,letters));
    }

//    public static ArrayList<String> charArrayToArrayList(char[] toChar){
//        StringBuilder holder = new StringBuilder();
//        ArrayList<String> enteredNumbersArray = new ArrayList<>();
//
//        for (char c : toChar){
//            if (c == ','){
//                enteredNumbersArray.add(holder.toString());
//                holder = new StringBuilder();
//            } else {
//                holder.append(c);
//            }
//        }
//        enteredNumbersArray.add(holder.toString());
//        return enteredNumbersArray;
//    }

    public static String[] charsToStrings(char[] chars){
        String[] strings = new String[7];
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
        strings[count + 1] = " ";
        return strings;
    }

    public static String arrayToString (ArrayList<String> enteredNumbersArray , String[] letters){
        StringBuilder word = new StringBuilder();
        for (String n : enteredNumbersArray){
            word.append(numberToPhoneKeyString(n, letters));
        }
        return word.toString();
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