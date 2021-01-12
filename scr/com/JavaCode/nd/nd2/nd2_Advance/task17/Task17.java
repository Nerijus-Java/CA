package com.JavaCode.nd.nd2.nd2_Advance.task17;

public class Task17 {

    public static final char [] ABC = new char[] {
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static final char[] CAESAR_CIPHER = new char[] {
            'X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W'};

    public static void main(String[] args) {
        System.out.println(cipher("Hi my name is nerijus", ABC, CAESAR_CIPHER));

    }

    public static String cipher(String input, char[] abc, char[] cipher) {
        char[] charInput = input.toUpperCase().toCharArray();
        String holder = "";

        for (char c : charInput) {
            if (c != ' ') {
                holder += cipher[getCharNumber(c, abc)];
            } else {
                holder += " ";
            }
        }
        return holder;
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
