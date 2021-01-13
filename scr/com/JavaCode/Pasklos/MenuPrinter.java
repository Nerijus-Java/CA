package com.JavaCode.Pasklos;

public class MenuPrinter {

    private InterestCalculator iC;

    public MenuPrinter(InterestCalculator iC) {
        this.iC = iC;
    }

    public void printAllMonths() {
        printTop();
        for (int i = 0; i < iC.getMonthCount(); i++) {
            printOneMonth();
        }
        printTotal();
        System.out.println("________________________________________________________");
    }

    private void printTop(){
        System.out.println("________________________________________________________");
        System.out.println("| Month    PerMonth    Total         Interest  Payed   |");
    }

    private void printOneMonth() {
        iC.interestSum();
        iC.payPerMonthMethod();
        iC.totalAmountToPay();
        iC.nextMonth();
        oneLine();
    }

    private void oneLine() {
        System.out.printf("|  %2d  %10.2f  %10.2f  %10.2f  %10.2f  | \n", iC.getMonthNow(), iC.getPayPerMonth()
                , iC.getSum(), iC.getInterest(), iC.getAmountToPay());
    }

    private void printTotal(){
        System.out.printf("| Total %10.2f  %10.2f  %10.2f  %10.2f | \n",iC.getPayPerMonthTotal(),iC.getSumTotal()
                ,iC.getInterestTotal(), iC.getAmountToPayTotal());
    }
}
