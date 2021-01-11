package com.JavaCode.project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionsArray {

    public static final int INCREASE_ARRAY_BY = 1;

    private String[] catagory = new String[0];
    private int[] amount = new int[0];
    private LocalDateTime[] dates = new LocalDateTime[0];


    public TransactionsArray() {

    }

    public void add(String catagoryString, int amountNumber) {
        int count = 0;
        makeArraysBigger();
        for (String s : catagory) {
            if (s == null) {
                amount[count] = amountNumber;
                catagory[count] += catagoryString;
                dates[count] = LocalDateTime.now();
                break;
            }
            count++;
        }
    }

    public String printAllTransactions() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String holder = "";

        for (int i = 0; i < catagory.length; i++) {
            if (catagory[i] != null) {
                holder += "Time :" + dtf.format(dates[i]) + "    " + catagory[i] + " : €" + amount[i] + "\n";
            } else {
                return holder.replace("null", "");
            }
        }
        return holder.replace("null", "");
    }

    private void makeArraysBigger() {
        if (checkArraysLength()) {
            String[] newCatagoryArray = new String[catagory.length + INCREASE_ARRAY_BY];
            int[] newAmountArray = new int[amount.length + INCREASE_ARRAY_BY];
            LocalDateTime[] newDatesArray = new LocalDateTime[dates.length + INCREASE_ARRAY_BY];

            for (int i = 0; i < catagory.length; i++) {
                newCatagoryArray[i] = catagory[i];
                newAmountArray[i] = amount[i];
                newDatesArray[i] = dates[i];
            }
            catagory = newCatagoryArray;
            amount = newAmountArray;
            dates = newDatesArray;
        }
    }

    private boolean checkArraysLength() {
        return catagory.length == amount.length && dates.length == catagory.length;
    }
}
