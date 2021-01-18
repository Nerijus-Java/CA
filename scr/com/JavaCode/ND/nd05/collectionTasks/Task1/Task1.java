package com.JavaCode.ND.nd05.collectionTasks.Task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        MyLists list = new MyLists(generatePaymentList(10));
        printList(list.getPaymentsList());
        System.out.println();
        printList(list.paymentsArrayList());
        System.out.println();
        System.out.println(list.printAll());


    }

    public static <E> void printList(List<E> list) {
        for (E e : list) {
            System.out.println(e.toString());
        }
    }

    public static List<Payments> generatePaymentList(int i) {
        List<Payments> paymentsList = new ArrayList<>();
        PaymentGenerator pG = new PaymentGenerator();

        for (int j = 0; j < i; j++) {
            Date date = new Date();
            paymentsList.add(new Payments(pG.generatePaymentID(), pG.generatePaymentID(), pG.generatePaymentID(),
                    "Payment :" + j, date));
        }
        return paymentsList;
    }
}
