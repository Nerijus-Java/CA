package com.JavaCode.project.Payments;

import java.util.Date;

public class Printer {

    public String printAllPaymentsMenu(Payments[] payments){
        StringBuilder holder = new StringBuilder();
        String spaces = "---------------------------------------";
        for (Payments p : payments){
            if (!p.getHiddenCost()){
                holder.append(String.format("Date :%-30s%-50sCatagory:%-30s%-50sAmount :%-30s%-50sTransfer :%-30b%-50sTaxes :%-20b%-50s Income:%b|\n",
                        Payments.DATE_FORMAT.format(p.getDate()),
                        spaces,
                        p.getCatagory().getName(),
                        spaces,
                        p.getAmount(),
                        spaces
                        , p.getTransferToBalance(),
                        spaces,
                        p.getHasTaxes(),
                        spaces,
                        p.getIncomeOrCost()));

            }
        }
        return holder.toString();
    }

    public String printCostPayment(Payments[] payments){
        StringBuilder holder = new StringBuilder();
        String spaces = "---------------------------------------";

        for (Payments p : payments){
            if (!p.getIncomeOrCost()){
                holder.append(String.format("Date :%-30s%-50sCatagory:%-30s%-50sAmount :%-30s%-50sTransfer :%-30b%-50sTaxes :%-20b%-50s Income:%b|\n",
                        Payments.DATE_FORMAT.format(p.getDate()),
                        spaces,
                        p.getCatagory().getName(),
                        spaces,
                        p.getAmount(),
                        spaces
                        , p.getTransferToBalance(),
                        spaces,
                        p.getHasTaxes(),
                        spaces,
                        p.getIncomeOrCost()));
            }
        }
        return holder.toString();
    }

    public String printIncomesPayment(Payments[] payments){
        StringBuilder holder = new StringBuilder();
        String spaces = "------------------------------";

        for (Payments p : payments){
            if (p.getIncomeOrCost()){
                holder.append(String.format("Date :%-30s%-50sCatagory:%-30s%-50sAmount :%-30s%-50sTransfer :%-30b%-50sTaxes :%-20b%-50s Income:%b|\n",
                        Payments.DATE_FORMAT.format(p.getDate()),
                        spaces,
                        p.getCatagory().getName(),
                        spaces,
                        p.getAmount(),
                        spaces
                        , p.getTransferToBalance(),
                        spaces,
                        p.getHasTaxes(),
                        spaces,
                        p.getIncomeOrCost()));
            }
        }
        return holder.toString();
    }

    public String printPaymentFromThisMonth(Payments[] payments){
        Date date = new Date();
        StringBuilder holder = new StringBuilder();
        String spaces = "---------------------------------------";

        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getMonth() == date.getMonth()){
                holder.append(String.format("Date :%-30s%-50sCatagory:%-30s%-50sAmount :%-30s%-50sTransfer :%-30b%-50sTaxes :%-20b%-50s Income:%b|\n",
                        Payments.DATE_FORMAT.format(p.getDate()),
                        spaces,
                        p.getCatagory().getName(),
                        spaces,
                        p.getAmount(),
                        spaces
                        , p.getTransferToBalance(),
                        spaces,
                        p.getHasTaxes(),
                        spaces,
                        p.getIncomeOrCost()));
            }
        }
        return holder.toString();
    }

//    public String printPaymentFromChosenMonth(Payments[] payments, Date date){
//        for (Payments p : payments){
//            if (!p.getHiddenCost() && p.getDate().getMonth() == date.getMonth()){
//                System.out.printf(
//                        "Date :%-15s  Catagory:%-25s  Amount :%-10d  Transfer :%-6b Taxes :%-6b Income:%-6b \n",
//                        Payments.DATE_FORMAT.format(p.getDate()),p.getCatagory().getName(),p.getAmount()
//                        ,p.getTransferToBalance(),p.getHasTaxes(),p.getIncomeOrCost()
//                );
//            }
//        }
//    }
//
    public String printPaymentFromThisYear(Payments[] payments){
        Date date = new Date();
        StringBuilder holder = new StringBuilder();
        String spaces = "---------------------------------------";
        for (Payments p : payments){
            if (!p.getHiddenCost() && p.getDate().getYear() == date.getYear()){
                holder.append(String.format("Date :%-30s%-50sCatagory:%-30s%-50sAmount :%-30s%-50sTransfer :%-30b%-50sTaxes :%-20b%-50s Income:%b|\n",
                        Payments.DATE_FORMAT.format(p.getDate()),
                        spaces,
                        p.getCatagory().getName(),
                        spaces,
                        p.getAmount(),
                        spaces
                        , p.getTransferToBalance(),
                        spaces,
                        p.getHasTaxes(),
                        spaces,
                        p.getIncomeOrCost()));
            }
        }
        return holder.toString();
    }
//
//    public String printPaymentChosenYear(Payments[] payments, Date date){
//        for (Payments p : payments){
//            if (!p.getHiddenCost() && p.getDate().getYear() == date.getYear()){
//                System.out.printf(
//                        "Date :%-15s  Catagory:%-25s  Amount :%-10d  Transfer :%-6b Taxes :%-6b Income:%-6b \n",
//                        Payments.DATE_FORMAT.format(p.getDate()),p.getCatagory().getName(),p.getAmount()
//                        ,p.getTransferToBalance(),p.getHasTaxes(),p.getIncomeOrCost()
//                );
//            }
//        }
//    }


}
