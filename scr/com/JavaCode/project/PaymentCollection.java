package com.JavaCode.project;

import java.util.Date;

public class PaymentCollection {

    private Payments[] payments;
    private MenuPrinter menuPrinter = new MenuPrinter();

    public PaymentCollection() {
        this.payments = new Payments[0];
    }

    public void addIncome(String catagory, int amount, boolean transfer, boolean taxes) {
        addMoreRoom();
        Payments newPayment =new Payments(catagory, amount, new Date(), transfer, taxes, true, false);
        payments[payments.length - 1] = newPayment;
    }

    public void addCosts(String catagory, int amount,boolean hidden){
        addMoreRoom();
        Payments newPayments = new Payments(catagory, amount,new Date(), true,false,false,hidden);
        payments[payments.length - 1] = newPayments;

    }

    private void addMoreRoom() {
        Payments[] newPayments = new Payments[payments.length + 1];

        int count = 0;
        for (Payments p : payments) {
            newPayments[count] = p;
            count++;
        }

        this.payments = newPayments;
    }

    public String printAllTransactions() {
        String holder = "";
        for (Payments p : payments){
            if (!p.getHiddenCost()){
                holder += p.toString();
            }
        }
        return holder;
    }

    public void print(){
        menuPrinter.printAllPaymentsMenu(payments);
    }
}
