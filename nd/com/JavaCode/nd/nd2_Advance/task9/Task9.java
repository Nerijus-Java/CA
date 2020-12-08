package com.JavaCode.nd.nd2_Advance.task9;

public class Task9 {

    public static void main(String[] args) {
        printChar('A','Z');
    }
    public static void printChar(char first, char last){
        for (int i = 0; first < last; first++) {
            System.out.print(first + " ");
        }
        System.out.println(last);
    }
}
