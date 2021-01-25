package com.JavaCode.ND.nd06.exceptionExer.task7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntConverterTest {

    private IntConverter converter;

    @Before
    public void setUp(){
        converter = new IntConverter();
    }

    @Test
    public void whatIfNullEntered(){
        Assert.assertEquals(java.util.Optional.of(6), converter.convert("6"));
    }
}