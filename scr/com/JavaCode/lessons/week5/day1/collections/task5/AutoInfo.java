package com.JavaCode.lessons.week5.day1.collections.task5;

public class AutoInfo {
    private String make;
    private int years;
    private String registrationNum;
    private String fuelType;

    public AutoInfo(String make, int years, String registrationNum, String fuelType) {
        this.make = make;
        this.years = years;
        this.registrationNum = registrationNum;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "make :" + make + '\n' +
                "years :" + years + '\n' +
                "registrationNum :" + registrationNum + '\n' +
                "fuelType :" + fuelType + '\n';
    }
}
