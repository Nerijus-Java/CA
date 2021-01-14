package com.JavaCode.project.Payments;

import java.util.Date;

public class Printer {

    public void printAllPaymentsMenu(Payments[] payments){
        for (Payments p : payments){
            if (!p.getHiddenCost()){
                System.out.printf(
                        "Date :%-15s  Catagory:%-25s  Amount :%-10d  Transfer :%-6b Taxes :%-6b Income:%-6b \n",
                        Payments.DATE_FORMAT.format(p.getDate()),p.getCatagory().getName(),p.getAmount()
                        ,p.getTransferToBalance(),p.getHasTaxes(),p.getIncomeOrCost()
                );
            }
        }
    }

    public void printPaymentFromThisMonth(Payments[] payments){
        Date date = new Date();
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getMonth() == date.getMonth()){
                System.out.printf(
                        "Date :%-15s  Catagory:%-25s  Amount :%-10d  Transfer :%-6b Taxes :%-6b Income:%-6b \n",
                        Payments.DATE_FORMAT.format(p.getDate()),p.getCatagory().getName(),p.getAmount()
                        ,p.getTransferToBalance(),p.getHasTaxes(),p.getIncomeOrCost()
                );
            }
        }
    }

    public void printPaymentFromChosenMonth(Payments[] payments, Date date){
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getMonth() == date.getMonth()){
                System.out.printf(
                        "Date :%-15s  Catagory:%-25s  Amount :%-10d  Transfer :%-6b Taxes :%-6b Income:%-6b \n",
                        Payments.DATE_FORMAT.format(p.getDate()),p.getCatagory().getName(),p.getAmount()
                        ,p.getTransferToBalance(),p.getHasTaxes(),p.getIncomeOrCost()
                );
            }
        }
    }

    public void printPaymentFromThisYear(Payments[] payments){
        Date date = new Date();
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getYear() == date.getYear()){
                System.out.printf(
                        "Date :%-15s  Catagory:%-25s  Amount :%-10d  Transfer :%-6b Taxes :%-6b Income:%-6b \n",
                        Payments.DATE_FORMAT.format(p.getDate()),p.getCatagory().getName(),p.getAmount()
                        ,p.getTransferToBalance(),p.getHasTaxes(),p.getIncomeOrCost()
                );
            }
        }
    }

    public void printPaymentChosenYear(Payments[] payments, Date date){
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getYear() == date.getYear()){
                System.out.printf(
                        "Date :%-15s  Catagory:%-25s  Amount :%-10d  Transfer :%-6b Taxes :%-6b Income:%-6b \n",
                        Payments.DATE_FORMAT.format(p.getDate()),p.getCatagory().getName(),p.getAmount()
                        ,p.getTransferToBalance(),p.getHasTaxes(),p.getIncomeOrCost()
                );
            }
        }
    }

}
