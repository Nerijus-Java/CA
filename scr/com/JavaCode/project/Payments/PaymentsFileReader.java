package com.JavaCode.project.Payments;

import com.JavaCode.project.model.Catagory;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.model.User;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentsFileReader {

    public static final String PAYMENTS_PATH = "scr/com/JavaCode/project/Payments.txt";
    public static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss";
    private final PaymentCollection paymentCollection;
    private final CatagoryHelper catagoryCollection;
    private final User user;

    public PaymentsFileReader(PaymentCollection paymentCollection, CatagoryHelper catagoryCollection, User loggedInUser) {
        this.paymentCollection = paymentCollection;
        this.catagoryCollection = catagoryCollection;
        this.user = loggedInUser;
    }

    public void readNewFile(String path){
        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;

            while ((line = br.readLine()) != null) {
                lineToPayment(line);
            }
            br.close();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(PAYMENTS_PATH);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;

            while ((line = br.readLine()) != null) {
                lineToPayment(line);
            }
            br.close();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private void lineToPayment(String line) throws ParseException {
        int lineCount = 0;
        StringBuilder holder = new StringBuilder();
        String[] paymentDetails = new String[8];

        for (char c : line.toCharArray()) {
            if (c != ',') {
                holder.append(c);
            } else {
                paymentDetails[lineCount] = holder.toString();
                lineCount++;
                holder = new StringBuilder();
            }
        }

        paymentDetails[7] = holder.toString();
        if (paymentDetails[6].equals("true")) {
            Date date = new SimpleDateFormat(DATE_FORMAT).parse(paymentDetails[3]);
            Catagory catagory = setGetCatagory(paymentDetails[0], Integer.parseInt(paymentDetails[1]));
            user.setBalance(user.getBalance() + Integer.parseInt(paymentDetails[2]));

            paymentCollection.addOldIncome(catagory, Integer.parseInt(paymentDetails[2]), date,
                    getTrueOrFalse(paymentDetails[4]), getTrueOrFalse(paymentDetails[5]));

        } else if (paymentDetails[7].equals("false")) {
            Date date = new SimpleDateFormat(DATE_FORMAT).parse(paymentDetails[3]);
            Catagory catagory = setGetCatagory(paymentDetails[0], Integer.parseInt(paymentDetails[1]));
            user.setBalance(user.getBalance() + Integer.parseInt(paymentDetails[2]));

            paymentCollection.addOldCost(catagory, Integer.parseInt(paymentDetails[2]), date, getTrueOrFalse(paymentDetails[7]));

        }
    }

    private Catagory setGetCatagory(String name, int amount) {
        int count = 0;
        for (Catagory c : catagoryCollection.getCatagoryCollection().getCatagory()) {
            if (c.getName().equals(name)) {
                c.setAmount(amount);
                break;
            }
            count++;
        }
        return catagoryCollection.getCatagoryCollection().getCatagory()[count];
    }

    private boolean getTrueOrFalse(String text) {
        return text.equals("true");
    }

}
