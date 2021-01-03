package com.JavaCode.Pasklos;

public class Program {

    public static void main(String[] args) {
        InterestCalculator interestCalculator = new InterestCalculator(1000,10);
        MenuPrinter menuPrinter = new MenuPrinter(interestCalculator);
        menuPrinter.printAllMonths();
    }


}
