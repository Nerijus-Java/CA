package com.JavaCode.junit.week4.day4.task3;

import org.junit.Assert;
import org.junit.Test;

public class WalletTester {

    @Test
    public void testOne() {
        Wallet wallet = new Wallet();
        wallet.addToBalance(10.50);
        Assert.assertEquals(10.50, wallet.getBalance(), 0.0001);
    }

    @Test
    public void testTwo() {
        Wallet wallet = new Wallet();
        wallet.addToBalance(50.36);
        wallet.addToBalance(13.13);
        Assert.assertEquals(63.49, wallet.getBalance(), 0.0001);
    }

    @Test
    public void testThree() {
        Wallet wallet = new Wallet();
        wallet.addToBalance(53.36);
        wallet.takeAwayFromBalance(15.23);
        Assert.assertEquals(38.13, wallet.getBalance(), 0.0001);
    }
}
