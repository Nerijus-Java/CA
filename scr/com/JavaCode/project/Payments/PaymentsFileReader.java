package com.JavaCode.project.Payments;

import com.JavaCode.project.catagory.Catagory;

import java.text.SimpleDateFormat;

public class PaymentsFileReader {

    public static final String PAYMENTS_PATH = "scr/com/JavaCode/project/Payments.txt";
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    PaymentCollection paymentCollection = new PaymentCollection();

    public PaymentsFileReader(PaymentCollection paymentCollection) {
        this.paymentCollection = paymentCollection;
    }

    private void lineToPayment(String line){
        int lineCount = 0;
        String holder = "";
        String[] paymentDetails = new String[8];

        for (char c : line.toCharArray()) {
            if (c != ','){
                holder += c;
            } else {
                paymentDetails[lineCount] = holder;
                lineCount++;
                holder = "";
            }
        }
        paymentDetails[7] = holder;
        if (paymentDetails[6].equals("true")){
            paymentCollection.addIncome();
        }
    }


}
