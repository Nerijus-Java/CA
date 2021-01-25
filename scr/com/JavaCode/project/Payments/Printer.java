package com.JavaCode.project.Payments;

import java.util.Date;

public class Printer {

    public static final String PRINT_FORMAT = "Date :%-30s%-10sCatagory:%-30s%-10sAmount :%-30s%-10sTransfer :%-30b%-10sTaxes :%-20b%-10s Income:%b\n";
    public static final String SPACES = "---->";

    public String printAllPaymentsMenu(Payments[] payments){
        StringBuilder holder = new StringBuilder();
        for (Payments p : payments){
            if (!p.getHiddenCost()){
                makeOneLine(holder, p);
            }
        }
        return holder.toString();
    }

    public String printCostPayment(Payments[] payments){
        StringBuilder holder = new StringBuilder();
        for (Payments p : payments){
            if (!p.getIncomeOrCost()){
                makeOneLine(holder, p);
            }
        }
        return holder.toString();
    }

    public String printIncomesPayment(Payments[] payments){
        StringBuilder holder = new StringBuilder();
        for (Payments p : payments){
            if (p.getIncomeOrCost()){
                makeOneLine(holder, p);
            }
        }
        return holder.toString();
    }

    public String printPaymentFromThisMonth(Payments[] payments){
        Date date = new Date();
        StringBuilder holder = new StringBuilder();

        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getMonth() == date.getMonth()){
                makeOneLine(holder, p);
            }
        }
        return holder.toString();
    }

    public String printPaymentFromThisYear(Payments[] payments){
        Date date = new Date();
        StringBuilder holder = new StringBuilder();
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getYear() == date.getYear()){
                makeOneLine(holder, p);
            }
        }
        return holder.toString();
    }

    public String printPaymentChosenYear(Payments[] payments, int year){
        Date date = new Date();
        date.setYear(year - 1900);
        StringBuilder holder = new StringBuilder();
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getYear() == date.getYear()){
                makeOneLine(holder, p);
            }
        }
        return holder.toString();
    }

    public String printPaymentFromChosenMonth(Payments[] payments, int month){
        Date date = new Date();
        date.setMonth(month - 1);
        StringBuilder holder = new StringBuilder();
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getMonth() == date.getMonth()){
                makeOneLine(holder, p);
            }
        }
        return holder.toString();
    }

    public String printPaymentFromChosenMonthAndYear(Payments[] payments, int month, int year){
        Date date = new Date();
        date.setMonth(month - 1);
        date.setYear(year - 1900);
        StringBuilder holder = new StringBuilder();
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getMonth() == date.getMonth() && p.getDate().getYear() == date.getYear()){
                makeOneLine(holder, p);
            }
        }
        return holder.toString();
    }

    private void makeOneLine(StringBuilder holder, Payments p) {
        holder.append(String.format(PRINT_FORMAT,
                Payments.DATE_FORMAT.format(p.getDate()),
                SPACES,
                p.getCatagory().getName(),
                SPACES,
                p.getAmount(),
                SPACES
                , p.getTransferToBalance(),
                SPACES,
                p.getHasTaxes(),
                SPACES,
                p.getIncomeOrCost()));
    }
}
