package com.JavaCode.project;

public class CatagoryHelper {

    private String[] catagory;
    private int[] amount;

    public CatagoryHelper() {
        catagory = new String[10];
        this.amount = new int[10];
    }

    public void add(String catagoryString, int amountNumber) {
        int count = 0;
        for (String s : catagory) {
            if (s == null) {
                catagory[count] += catagoryString;
            }
            count++;
        }

        count = 0;
        for (int number : amount) {
            if (number == 0){
                amount[count] = amountNumber;
            }
            count++;
        }
    }
}
