package com.JavaCode.project.Payments;

public class Printer {

    public void printAllPaymentsMenu(Payments[] payments){
        for (Payments p : payments){
            System.out.printf(
                    "Date :%-15s  Catagory:%-25s  Amount :%-10d  Transfer :%-6b Taxes :%-6b Income:%-6b \n",
                    Payments.DATE_FORMAT.format(p.getDate()),p.getCatagory().getName(),p.getAmount()
                    ,p.getTransferToBalance(),p.getHasTaxes(),p.getIncomeOrCost()
            );
        }
    }


}
