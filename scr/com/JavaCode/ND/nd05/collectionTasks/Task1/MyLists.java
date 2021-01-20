package com.JavaCode.ND.nd05.collectionTasks.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLists {

    public static final int INCREASE_BY = 1;
    private Payments[] paymentsList;

    public MyLists(List<Payments> paymentsList) {
        this.paymentsList = listToMas(paymentsList);
    }

    public void add(Payments payment){
        increaseSize();
        paymentsList[paymentsList.length - 1] = payment;
    }

    public void delete(int paymentAt){
        int count = 0;
        Payments[] newPayments = new Payments[paymentsList.length - INCREASE_BY];

        if (paymentAt <= paymentsList.length - 1){
            for(Payments payment: paymentsList){
                if (count != paymentAt){
                    newPayments[count] = payment;
                }
                count++;
            }
        }
        paymentsList = newPayments;
    }

    public Payments get(int paymentAt){
        int count = 0;

        if (paymentAt <= paymentsList.length - 1){
            for(Payments payment: paymentsList){
                if (count == paymentAt){
                    return payment;
                }
                count++;
            }
        }
        throw new NullPointerException("Payment Not Fount");
    }

    public String printAll (){
        String holder = "";
        for (Payments payment : paymentsList){
            String holderTwo = payment.toString();
            holder += holderTwo + '\n';
        }
        return holder;
    }

    private void increaseSize() {
        Payments[] newPayments = new Payments[paymentsList.length + INCREASE_BY];
        int count = 0;
        for (Payments p : paymentsList) {
            newPayments[count] = p;
            count++;
        }
        this.paymentsList = newPayments;
    }

    private Payments[] listToMas(List<Payments> list){
        Payments[] newPayments = new Payments[list.size()];
        int count = 0;

        for (Payments payments : list){
            newPayments[count] = payments;
            count++;
        }
        return newPayments;
    }

    public ArrayList<Payments> paymentsArrayList(){
        return new ArrayList<Payments>(Arrays.asList(paymentsList));
    }

    public Payments[] getPaymentsMas() {
        return paymentsList;
    }

    public List<Payments> getPaymentsList(){
        List<Payments> paymentsReturnList = new ArrayList<>();
        paymentsReturnList.addAll(Arrays.asList(paymentsList));
        return paymentsReturnList;
    }
}
