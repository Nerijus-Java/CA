package com.JavaCode.nd.nd2.nd2_Advance.task17;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text");
        String input = sc.nextLine();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caesarCipher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        cipher(input, abc.toCharArray(), caesarCipher.toCharArray());
    }

    public static void cipher(String input, char[] abc, char[] cipher) {
        char[] charInput = input.toUpperCase().toCharArray();
        String holder = "";

        for (char c : charInput) {
            if (c != ' ') {
                System.out.print(cipher[getCharNumber(c, abc)]);
            } else {
                System.out.print(" ");
            }

        }
    }

    public static int getCharNumber(char c, char[] charArray) {
        int count = 0;
        for (char c1 : charArray) {
            if (c1 != c) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
