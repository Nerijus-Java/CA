package com.JavaCode.project.collection;

import com.JavaCode.project.database.DatabaseMethods;
import com.JavaCode.project.model.Catagory;
import com.JavaCode.project.model.Payments;
import com.JavaCode.project.model.User;

import java.sql.SQLException;
import java.util.Date;

public class PaymentCollection {

    private Payments[] payments;
    private DatabaseMethods databaseMethods;


    public PaymentCollection() {
        this.payments = new Payments[0];
    }


    public void addIncome(Catagory catagory, int amount, boolean transfer, boolean taxes, User loggedInUser) throws SQLException {
        addMoreRoom();

        Payments newPayment = new Payments(catagory, amount, new Date(), transfer, taxes, true, false);
        databaseMethods.addIncome(amount, transfer, taxes, catagory.getId(), loggedInUser);
        payments[payments.length - 1] = newPayment;
    }

    public void addOldIncome(Catagory catagory, int amount, Date date, boolean transfer, boolean taxes) {
        addMoreRoom();

        Payments newPayment = new Payments(catagory, amount, date, transfer, taxes
                , true, false);
        payments[payments.length - 1] = newPayment;
    }

    public void addCosts(Catagory catagory, int amount, boolean hidden, User loggedInUser) throws SQLException {
        addMoreRoom();
        Payments newPayment = new Payments(catagory, -amount, new Date(), true, false, false, hidden);
        databaseMethods.addCost(amount, hidden, catagory.getId(), loggedInUser);
        payments[payments.length - 1] = newPayment;

    }


    public void addOldCost(Catagory catagory, int amount, Date date, boolean hidden) {
        addMoreRoom();
        Payments newPayment = new Payments(catagory, amount, date, true, false, false, hidden);
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

    public Payments[] getPayments() {
        return payments;
    }

    public void setDatabaseMethods(DatabaseMethods databaseMethods) {
        this.databaseMethods = databaseMethods;
    }
}
