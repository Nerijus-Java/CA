package com.JavaCode.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CatagoryCollection {

    public static final int INCREASE_BY = 1;
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

    private String[] catagory;
    private Integer[] amount;
    private Date[] date;

    private Boolean[] transferToBalance;
    private Boolean[] hasTaxes;
    private Boolean[] incomeOrCost;
    private Boolean[] hiddenCost;

    public CatagoryCollection() {
        this.catagory = new String[0];
        this.amount = new Integer[0];
        this.date = new Date[0];
        this.transferToBalance = new Boolean[0];
        this.hasTaxes = new Boolean[0];
        this.incomeOrCost = new Boolean[0];
        this.hiddenCost = new Boolean[0];
    }

    // Regular methods

    public void addIncome(String catagoryString, int amountNumber, boolean transferToBal, boolean taxes) {
        makeMoreRoom();

        String[] stArray = catagory;
        setCatagory(forLoopIncomeAdd(stArray, catagoryString));

        Integer[] intArray = amount;
        setAmount(forLoopIncomeAdd(intArray, amountNumber));

        Boolean[] transferToBalArray = transferToBalance;
        setTransferToBalance(forLoopIncomeAdd(transferToBalArray, transferToBal));

        Boolean[] hasTaxesArray = hasTaxes;
        setHasTaxes(forLoopIncomeAdd(hasTaxesArray, taxes));

        Boolean[] incomeOrCostArray = incomeOrCost;
        setIncomeOrCost(forLoopIncomeAdd(incomeOrCostArray, true));

        Date[] dateArray = date;
        setDate(forLoopIncomeAdd(dateArray, new Date()));

        Boolean[] hiddenCostArray = hiddenCost;
        setHiddenCost(forLoopIncomeAdd(hiddenCostArray, false));

    }

    public void addCosts(String catagoryString, int amountNumber, boolean hidden) {
        String[] stArray = catagory;
        setCatagory(forLoopIncomeAdd(stArray, catagoryString));

        Integer[] intArray = amount;
        setAmount(forLoopIncomeAdd(intArray, amountNumber));

        Boolean[] transferToBalArray = transferToBalance;
        setTransferToBalance(forLoopIncomeAdd(transferToBalArray, true));

        Boolean[] hasTaxesArray = hasTaxes;
        setHasTaxes(forLoopIncomeAdd(hasTaxesArray, false));

        Boolean[] incomeOrCostArray = incomeOrCost;
        setIncomeOrCost(forLoopIncomeAdd(incomeOrCostArray, false));

        Date[] dateArray = date;
        setDate(forLoopIncomeAdd(dateArray, new Date()));

        Boolean[] hiddenCostArray = hiddenCost;
        setHiddenCost(forLoopIncomeAdd(hiddenCostArray, hidden));

        makeMoreRoom();
    }

    //redo
    public String printAllTransactions() {
        String holder = "";
        for (int i = 0; i < catagory.length; i++) {
            if (catagory[i] != null) {
                holder += "Date :" + DATE_FORMAT.format(date[i])
                        + " " + catagory[i]
                        + " : €" + amount[i] + "\n";
            } else {
                return holder.replace("null", "");
            }
        }
        return holder.replace("null", "");
    }

    //Private Methods

    private void makeMoreRoom() {

        String[] newCatagory = new String[catagory.length + INCREASE_BY];
        Integer[] newAmount = new Integer[amount.length + INCREASE_BY];
        Date[] newDate = new Date[date.length + INCREASE_BY];

        Boolean[] newTransferToBalance = new Boolean[transferToBalance.length + INCREASE_BY];
        Boolean[] newHasTaxes = new Boolean[hasTaxes.length + INCREASE_BY];
        Boolean[] newIncomeOrCosts = new Boolean[incomeOrCost.length + INCREASE_BY];
        Boolean[] newHiddenCosts = new Boolean[hiddenCost.length + INCREASE_BY];

        for (int i = 0; i < catagory.length; i++) {

            newCatagory[i] = catagory[i];
            newAmount[i] = amount[i];
            newDate[i] = date[i];
            newTransferToBalance[i] = transferToBalance[i];
            newHasTaxes[i] = hasTaxes[i];
            newIncomeOrCosts[i] = incomeOrCost[i];
            newHiddenCosts[i] = incomeOrCost[i];

        }

        this.catagory = newCatagory;
        this.amount = newAmount;
        this.date = newDate;
        this.transferToBalance = newTransferToBalance;
        this.hasTaxes = newHasTaxes;
        this.incomeOrCost = newIncomeOrCosts;
        this.hiddenCost = newHiddenCosts;
    }

    private <E> E[] forLoopIncomeAdd(E[] array, E e) {
        int count = 0;
        for (E a : array) {
            if (a == null) {
                array[count] = e;
                return array;
            }
            array[catagory.length] = e;
        }
        return array;
    }

    //Setters


    private void setHiddenCost(Boolean[] hiddenCost) {
        this.hiddenCost = hiddenCost;
    }

    private void setCatagory(String[] catagory) {
        this.catagory = catagory;
    }

    private void setAmount(Integer[] amount) {
        this.amount = amount;
    }

    private void setDate(Date[] date) {
        this.date = date;
    }

    private void setTransferToBalance(Boolean[] transferToBalance) {
        this.transferToBalance = transferToBalance;
    }

    private void setHasTaxes(Boolean[] hasTaxes) {
        this.hasTaxes = hasTaxes;
    }

    private void setIncomeOrCost(Boolean[] incomeOrCost) {
        this.incomeOrCost = incomeOrCost;
    }
}
