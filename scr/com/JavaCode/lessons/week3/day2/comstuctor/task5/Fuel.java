package com.JavaCode.lessons.week3.day2.comstuctor.task5;

public class Fuel {
    private static int fuel;

    protected String canCarDrive(int km, Fuel fuel) {
        if (fuel.getFuel() - (km * 5) < 0) {
            return "not enough fuel";
        } else {
            fuel.setFuel(fuel.getFuel() - (km * 5));
            return "Driving";
        }
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
