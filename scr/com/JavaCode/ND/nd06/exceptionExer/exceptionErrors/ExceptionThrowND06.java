package com.JavaCode.ND.nd06.exceptionExer.exceptionErrors;

import com.JavaCode.ND.nd06.exceptionExer.myExceptions.MyExceptionForHW06;

public class ExceptionThrowND06 {

    public void throwNull(){
        throw new NullPointerException("NullException thrown");
    }

    public void throwMyException() throws MyExceptionForHW06 {
        throw new MyExceptionForHW06("MyException thrown");
    }

    public void throwMyException(String s) throws MyExceptionForHW06 {
        throw new MyExceptionForHW06(s);
    }

}
