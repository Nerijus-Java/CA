package com.JavaCode.lessons.week2.enumTasks.task7;

import com.JavaCode.lessons.week2.enumTasks.Days;
import com.JavaCode.lessons.week2.enumTasks.Months;

public class DayCal {

    private Days weekDay;
    private Months month;
    private int day;
    private int year;

    public DayCal(Days weekDay, Months month, int day, int year) {
        this.weekDay = weekDay;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private String whatDay(Days weekDay){
        switch (weekDay){
            case MONDAY:
                return "WorkDay";
            case TUESDAY:
                return "WorkDay";
            case WEDNESDAY:
                return "WorkDay";
            case THURSDAY:
                return "WorkDay";
            case FRIDAY:
                return "WorkDay";
            case SATURDAY:
                return "non-WorkDay";
            case SUNDAY:
                return "non-WorkDay";
            default:
                return "Error";
        }
    }

    private String whatMonth(Months month){
        switch (month){
            case JAN:
                return "January";
            case FEB:
                return "February";
            case MAR:
                return "March";
            case APR:
                return "April";
            case MAY:
                return "May";
            case JUN:
                return "June";
            case JUL:
                return "July";
            case AUG:
                return "August";
            case SEP:
                return "September";
            case OCT:
                return "October";
            case NOV:
                return "November";
            case DEC:
                return "December";
            default:
                return "Error";
        }
    }

    public String getInfo(){
        return whatDay(weekDay) + " " + whatMonth(month) + " " + day + " " + year;
    }

    public String getMonth(){
        return whatMonth(month);
    }

    public String getDay(){
        return whatDay(weekDay);
    }

}
