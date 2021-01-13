package com.JavaCode.ND.nd05.collectionTasks.Task1;

import java.util.Random;

public class PaymentGenerator {

    private Random random = new Random();

    public int generatePaymentID(){
        return (random.nextInt(8999) + 1000);
    }
}
