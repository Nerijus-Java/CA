package com.JavaCode.ND.nd06.exceptionExer.task5;

import com.JavaCode.ND.nd06.exceptionExer.exceptionErrors.ExceptionThrowND06;
import com.JavaCode.ND.nd06.exceptionExer.myExceptions.MyExceptionForHW06;

public class Task5 {

    ExceptionThrowND06 exceptionThrow = new ExceptionThrowND06();

    public void f() throws MyExceptionForHW06 {
        try {
            g();
        } catch (MyExceptionForHW06 e) {
            System.out.println(e.getMessage());
            throw new MyExceptionForHW06("Second Error", e);
        }
    }

    public void g() throws MyExceptionForHW06 {
        exceptionThrow.throwMyException("First Error");
    }
}
