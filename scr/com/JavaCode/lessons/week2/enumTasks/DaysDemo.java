package com.JavaCode.lessons.week2.enumTasks;

public class DaysDemo {
    Days days;

    public DaysDemo(Days days) {
        this.days = days;
    }

    public void whatDay(){
        switch (days){
            case MONDAY:
                System.out.println("Today is monday");
                break;
            case TUESDAY:
                System.out.println("Today is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is thursday");
                break;
            case FRIDAY:
            case SUNDAY:
            case SATURDAY:
            default:
                System.out.println("must be FRIDAY or SUNDAY , SATURDAY");
        }
    }
}
