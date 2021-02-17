package com.JavaCode.lessons.week10.day3;

import java.awt.*;
import java.util.Optional;

public class MainOptional {

    public static void main(String[] args) {

        //Optional Class example

        //Make class
        //VVVVVVVVVVVVVVV
        Optional<Color> color1 = getColour("red");
        //^^^^^^^^^^^^^^^
        System.out.println(color1.toString());

        if (color1.isPresent()) {
            printRGB(color1.get());
        }else {
            isNull();
        }
    }

    private static void printRGB(Color color) {
        System.out.println("R :" + color.getRed());
        System.out.println("G :" + color.getGreen());
        System.out.println("B :" + color.getBlue());

    }

    public static Optional<Color> getColour(String color) {
        switch (color) {
            case "gray":
                return Optional.of(Color.gray);
            case "red":
                return Optional.of(Color.red);
            case "blue":
                return Optional.of(Color.blue);
        }
        return Optional.empty();
    }

    public static void isNull(){
        System.out.println("null Colour");
    }

}

