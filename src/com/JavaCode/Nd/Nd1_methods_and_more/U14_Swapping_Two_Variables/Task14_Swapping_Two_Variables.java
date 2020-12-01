package com.JavaCode.Nd.Nd1_methods_and_more.U14_Swapping_Two_Variables;

import java.util.Scanner;

public class Task14_Swapping_Two_Variables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String holder;

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        System.out.println("Enter the Second word");
        String second = sc.nextLine();

        holder = first;
        first = second;
        second = holder;

        System.out.println("First: " + first + '\n'  + "Second: " + second);
    }

}
