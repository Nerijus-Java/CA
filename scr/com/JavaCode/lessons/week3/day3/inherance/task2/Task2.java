package com.JavaCode.lessons.week3.day3.inherance.task2;

public class Task2 {

    public static void main(String[] args) {
        Automobile a = new Automobile("BMW", "NBC314");
        Automobile b = new Automobile("VW", "kul124");

        Automobile[] cars = {a, b};

        ParkingLot parkingLot = new ParkingLot(cars);

        System.out.println(parkingLot.toString());

        System.out.println();

        System.out.println(parkingLot.printFirstCar());
        System.out.println(parkingLot.printLastCar());
        System.out.println(parkingLot.printCar(1));
    }
}
