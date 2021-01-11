package com.JavaCode.lessons.week3.day2.comstuctor.task5;

public class Car {

    public Car() {
    }

    public void drive(int km) {
        Fuel fuel = new Fuel();
        System.out.println(fuel.canCarDrive(km, fuel));
    }

    public void fuelCar(int amount) {
        Fuel fuel = new Fuel();
        fuel.setFuel(fuel.getFuel() + amount);
    }


}
