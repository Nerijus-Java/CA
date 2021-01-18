package com.JavaCode.project.Payments;

import com.JavaCode.project.catagory.Catagory;
import com.JavaCode.project.catagory.CatagoryHelper;
import com.JavaCode.project.user.User;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentsFileReader {

    public static final String PAYMENTS_PATH = "scr/com/JavaCode/project/Payments.txt";
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    PaymentCollection paymentCollection;
    CatagoryHelper catagoryCollection;
    User user ;

    public PaymentsFileReader(PaymentCollection paymentCollection, CatagoryHelper catagoryCollection, User loggedInUser) {
        this.paymentCollection = paymentCollection;
        this.catagoryCollection = catagoryCollection;
        this.user = loggedInUser;
    }

    public void readFile(){
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
        String holder = "";
        String[] paymentDetails = new String[8];

        for (char c : line.toCharArray()) {
            if (c != ',') {
                holder += c;
            } else {
                paymentDetails[lineCount] = holder;
                lineCount++;
                holder = "";
            }
        }
        paymentDetails[7] = holder;
        if (paymentDetails[6].equals("true")) {
            Date date = new SimpleDateFormat("dd-M-yyyy hh:mm:ss").parse(paymentDetails[3]);
            Catagory catagory = setGetCatagory(paymentDetails[0], Integer.parseInt(paymentDetails[1]));
            user.setBalance(user.getBalance() + Integer.parseInt(paymentDetails[2]));

            paymentCollection.addOldIncome(catagory, Integer.parseInt(paymentDetails[2]), date,
                    getTrueOrFalse(paymentDetails[4]), getTrueOrFalse(paymentDetails[5]));

        } else if (paymentDetails[7].equals("false")) {
            Date date = new SimpleDateFormat("dd-M-yyyy hh:mm:ss").parse(paymentDetails[3]);
            Catagory catagory = setGetCatagory(paymentDetails[0], Integer.parseInt(paymentDetails[1]));
            user.setBalance(user.getBalance() - Integer.parseInt(paymentDetails[2]));

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
