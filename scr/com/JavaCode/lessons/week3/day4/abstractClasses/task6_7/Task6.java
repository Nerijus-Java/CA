package com.JavaCode.lessons.week3.day4.abstractClasses.task6_7;

public class Task6 {

    public static void main(String[] args) {
        Shape shapeOne = new Triangle("Blue", 2, 3);
        Shape shapeTwo = new Rectangle("Black", 48, 25);
        Shape shapeThree = new Circle("red", 3);

        System.out.println(shapeTwo.toString());
        System.out.println(shapeOne.toString());
        System.out.println(shapeThree.toString());

        System.out.println();

        System.out.println(figure(shapeOne));
        System.out.println(figure(shapeTwo));
        System.out.println(figure(shapeThree));
    }

    public static boolean figure(Shape shape) {
        if (shape.getArea() > 50) {
            return true;
        } else {
            return false;
        }
    }
}
