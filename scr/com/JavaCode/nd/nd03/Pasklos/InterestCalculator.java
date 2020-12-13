package com.JavaCode.nd.nd03.Pasklos;

public class InterestCalculator {
    private int monthCount;
    private int sum;
    private int interest;
    private int term;
    private int contractFee;


    public InterestCalculator(int sum, int interest) {
        this.sum = sum;
        this.interest = interest;
    }


    public double interestSum(int sum, int interest) {
        return ((sum * interest) / 100) / 12;
    }

    @Override
    public String toString() {
        return  monthCount + sum + interest + "";
    }
}
