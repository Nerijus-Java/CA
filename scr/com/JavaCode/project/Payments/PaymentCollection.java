package com.JavaCode.project.Payments;

import com.JavaCode.project.catagory.Catagory;

import java.util.Date;

public class PaymentCollection {

    private Payments[] payments;
    private Printer printer = new Printer();
    private PaymentsFileWriter paymentsFileWriter = new PaymentsFileWriter();

    public PaymentCollection() {
        this.payments = new Payments[0];
    }

    public void addIncome(Catagory catagory, int amount, boolean transfer, boolean taxes) {
        addMoreRoom();

        Payments newPayment = new Payments(catagory, amount, new Date(), transfer, taxes, true, false);
        paymentsFileWriter.writeOnePaymentToFileWriter(newPayment);
        payments[payments.length - 1] = newPayment;
    }

    public void addCosts(Catagory catagory, int amount, boolean hidden) {
        addMoreRoom();

        Payments newPayment = new Payments(catagory, amount, new Date(), true, false, false, hidden);
        paymentsFileWriter.writeOnePaymentToFileWriter(newPayment);
        payments[payments.length - 1] = newPayment;

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

    public void print() {
        printer.printAllPaymentsMenu(payments);
    }

    public Payments[] getPayments() {
        return payments;
    }
}
