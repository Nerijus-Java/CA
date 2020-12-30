package com.JavaCode.ND.nd06.exceptionExer.myExceptions;

public class MyExceptionForHW06 extends Exception{

    public MyExceptionForHW06(String s) {
        super(s);
    }

    public MyExceptionForHW06(String s, Exception e) {
        super(s, e);
    }

}
