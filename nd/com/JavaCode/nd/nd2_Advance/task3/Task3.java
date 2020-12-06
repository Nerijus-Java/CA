package com.JavaCode.nd.nd2_Advance.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter:");
        String userInput = sc.nextLine();
        System.out.println("The middle is :" + middleOfString(userInput));
    }

    public static String middleOfString(String input){
        String holder = " ";

        if (input.length() % 2 != 0){
            int stringMiddle = input.length()/2;
            holder = input.substring(stringMiddle);

            holder = holder.substring(0,1);
        }else{
            int stringMiddle = input.length()/2 - 1;
            holder = input.substring(stringMiddle);

            holder = holder.substring(0,2);
        }

        return holder;
    }
}
