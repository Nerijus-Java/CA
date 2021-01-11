package com.JavaCode.nd.nd03.Pasklos;

public class InterestCalculator {
    public static final int INTEREST = 10;

    private int monthCount;
    private int monthNow;
    private float sum;
    private float interest;
    private float payPerMonth;
    private float amountToPay;

    public InterestCalculator(int sum, int monthCount) {
        this.sum = sum;
        this.monthCount = monthCount;
    }

    public void nextMonth(){
        this.monthNow = monthNow + 1;
        this.sum = sum - payPerMonth;
    }

    public void totalAmountToPay(){
        amountToPay = payPerMonth + interest;
    }

    public void payPerMonthMethod(){
        this.payPerMonth = sum / monthCount;
    }

    public void interestSum() {
        this.interest = ((sum * INTEREST) / 100) / 12;
    }



    @Override
    public String toString() {
        interestSum();
        payPerMonthMethod();
        totalAmountToPay();
        nextMonth();
        return  monthNow + " " + payPerMonth +  " " + sum + " " + interest + " " + amountToPay;
    }
}
