package com.JavaCode.Pasklos;

public class InterestCalculator {
    public static final int INTEREST = 10;

    private final int monthCount;
    private int monthNow;

    private float sum;
    private float interest;
    private float payPerMonth;
    private float amountToPay;

    private float sumTotal;
    private float interestTotal;
    private float payPerMonthTotal;
    private float amountToPayTotal;

    public InterestCalculator(int sum, int monthCount) {
        this.sum = sum;
        this.monthCount = monthCount;
    }

    public void nextMonth(){
        this.monthNow = monthNow + 1;
        this.sum = sum - payPerMonth;
        this.sumTotal += this.sum;
    }

    public void totalAmountToPay(){
        this.amountToPay = payPerMonth + interest;
        this.amountToPayTotal += amountToPay;
    }

    public void payPerMonthMethod(){
        this.payPerMonth = sum / monthCount;
        this.payPerMonthTotal += this.payPerMonth;
    }

    public void interestSum() {
        this.interest = ((sum * INTEREST) / 100) / 12;
        this.interestTotal += this.interest;
    }

    public static int getINTEREST() {
        return INTEREST;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public int getMonthNow() {
        return monthNow;
    }

    public float getSum() {
        return sum;
    }

    public float getInterest() {
        return interest;
    }

    public float getPayPerMonth() {
        return payPerMonth;
    }

    public float getAmountToPay() {
        return amountToPay;
    }

    public float getSumTotal() {
        return sumTotal;
    }

    public float getInterestTotal() {
        return interestTotal;
    }

    public float getPayPerMonthTotal() {
        return payPerMonthTotal;
    }

    public float getAmountToPayTotal() {
        return amountToPayTotal;
    }
}
