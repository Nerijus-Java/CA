package com.JavaCode.junit.week4.day4.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WalletTester {

    public static final double DELTA = 0.0001;
    private Wallet wallet;

    @Before
    public void first(){
        wallet = new Wallet();
    }

    @Test
    public void testOne() {
        wallet.addToBalance(10.50);
        Assert.assertEquals(10.50, wallet.getBalance(), DELTA);
    }

    @Test
    public void testTwo() {
        wallet.addToBalance(50.36);
        wallet.addToBalance(13.13);
        Assert.assertEquals(63.49, wallet.getBalance(), DELTA);
    }

    @Test
    public void testThree() {
        wallet.addToBalance(53.36);
        wallet.takeAwayFromBalance(15.23);
        Assert.assertEquals(38.13, wallet.getBalance(), DELTA);
    }
}
