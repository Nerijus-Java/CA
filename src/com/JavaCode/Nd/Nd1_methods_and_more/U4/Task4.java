package com.JavaCode.Nd.Nd1_methods_and_more.U4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Text:");
        String userInput = sc.nextLine();
        System.out.println();

        System.out.println("To UpperCase: ");
        System.out.println(userInput.toUpperCase()+ '\n');

        System.out.println("Length of text: ");
        System.out.println(userInput.length()+ '\n');

        System.out.println("Last letter of text: ");
        System.out.println(userInput.lastIndexOf(userInput)+ '\n');

        System.out.println("e to w: ");
        System.out.println(userInput.replace("a","w") + '\n');

        System.out.println("e to RAIDE: ");
        System.out.println(userInput.replace("e","RAIDE")+ '\n');


        System.out.println("First and Last char swapped :" );
        String newInput = userInput;
        newInput = newInput.replace(getFirstOrLastWord(true,userInput),"");
        newInput = newInput.replace(getFirstOrLastWord(false,userInput),"");

        System.out.println(
                getFirstOrLastWord(false,userInput)
                + newInput +
                getFirstOrLastWord(true,userInput)
        );
    }

    public static String getFirstOrLastWord(boolean firstOrLast ,String userInput){
        ArrayList<String> words = new ArrayList<>();
        String holder = "";

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == ' '){
                words.add(holder);
                holder = "";
            } else {
                holder += userInput.charAt(i);
            }

        }
        words.add(holder);

        if (firstOrLast){
            return words.get(0);
        } else {
            return words.get(words.size() - 1);
        }
    }
}
