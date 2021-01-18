package com.JavaCode.nd.nd2.nd2_Advance.task13;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side one ");
        float sideOne = sc.nextFloat();

        System.out.println("Enter side two");
        float sideTwo = sc.nextFloat();

        System.out.println("Enter side three");
        float sideThree = sc.nextFloat();

        System.out.println("Area of Triangle " + areaOfTriangle(sideOne,sideTwo,sideThree));
    }

    public static double areaOfTriangle(float sideOne, float sideTwo, float sideThree){
        float sum = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(sum * (sum -sideOne) * (sum - sideTwo) * (sum - sideThree));
        return area;
    }

}
