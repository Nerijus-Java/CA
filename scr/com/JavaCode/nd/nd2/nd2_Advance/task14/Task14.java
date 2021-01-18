package com.JavaCode.nd.nd2.nd2_Advance.task14;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of sides");
        int numberOfSides = sc.nextInt();

        System.out.println("Side value");
        double sideValue = sc.nextDouble();

        System.out.println("The area is " + penArea(numberOfSides, sideValue));


    }

    public static double penArea(int numberOfSide, double sideValue) {
        return (numberOfSide * sideValue * sideValue) / (4 * Math.tan(Math.PI/numberOfSide));
    }

}
