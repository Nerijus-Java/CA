package com.JavaCode.nd.nd2.nd2_Advance.task1;

public class Task1 {

    public static void main(String[] args) {

        int userInput;
        int holder = Integer.MAX_VALUE;

        for (int i = 0 ; i < 10 ; i++){
            System.out.print("Enter: ");
            userInput = i;

            if (userInput < holder){
                holder = userInput;
            }
            System.out.println("Smallest number entered is :" + holder);
        }
    }
}
