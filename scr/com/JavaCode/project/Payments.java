package com.JavaCode.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Payments {

    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

    private String catagory;
    private Integer amount;
    private Date date;

    private Boolean transferToBalance;
    private Boolean hasTaxes;
    private Boolean incomeOrCost;
    private Boolean hiddenCost;

    public Payments(String catagory, Integer amount, Date date, Boolean transferToBalance, Boolean hasTaxes, Boolean incomeOrCost, Boolean hiddenCost) {
        this.catagory = catagory;
        this.amount = amount;
        this.date = date;
        this.transferToBalance = transferToBalance;
        this.hasTaxes = hasTaxes;
        this.incomeOrCost = incomeOrCost;
        this.hiddenCost = hiddenCost;
    }

    @Override
    public String toString() {
        return "Date :" + DATE_FORMAT.format(date) + '\t' +
                "Catagory :" + catagory + '\t' +
                "Amount :" + amount + '\t' +
                "TransferToBalance :" + transferToBalance + '\t' +
                "HasTaxes :" + hasTaxes + '\t' +
                "IncomeOrCost :" + incomeOrCost + '\t' +
                "HiddenCost :" + hiddenCost + '\n';
    }

    public static SimpleDateFormat getDateFormat() {
        return DATE_FORMAT;
    }

    public String getCatagory() {
        return catagory;
    }

    public Integer getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public Boolean getTransferToBalance() {
        return transferToBalance;
    }

    public Boolean getHasTaxes() {
        return hasTaxes;
    }

    public Boolean getIncomeOrCost() {
        return incomeOrCost;
    }

    public Boolean getHiddenCost() {
        return hiddenCost;
    }
}
