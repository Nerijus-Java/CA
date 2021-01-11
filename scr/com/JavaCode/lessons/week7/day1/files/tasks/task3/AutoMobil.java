package com.JavaCode.lessons.week7.day1.files.tasks.task3;

public class AutoMobil {
    private String name;
    private String make;
    private String number;
    private int km;

    public AutoMobil(String name, String make, String number, int km) {
        this.name = name;
        this.make = make;
        this.number = number;
        this.km = km;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getNumber() {
        return number;
    }

    public int getKm() {
        return km;
    }
}
