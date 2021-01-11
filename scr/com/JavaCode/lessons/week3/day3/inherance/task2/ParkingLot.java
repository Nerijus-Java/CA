package com.JavaCode.lessons.week3.day3.inherance.task2;


public class ParkingLot {
    private Automobile[] automobile;

    public ParkingLot(Automobile[] automobile) {
        this.automobile = automobile;
    }

    public String printFirstCar(){
        return automobile[0].toString();
    }

    public String printLastCar(){
        return automobile[automobile.length - 1].toString();
    }

    public String printCar(int car){
        return automobile[car].toString();
    }

    @Override
    public String toString() {
        String allAuto = "";
        for(Automobile a : automobile) {
            allAuto += a.toString();
        }
        return allAuto;
    }
}
