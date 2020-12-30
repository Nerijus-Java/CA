package com.JavaCode.ND.nd06.exceptionExer.task3;

import com.JavaCode.ND.nd06.exceptionExer.exceptionErrors.ExceptionThrowND06;
import com.JavaCode.ND.nd06.exceptionExer.myExceptions.MyExceptionForHW06;

public class Task3 {

    public static void main(String[] args) {
        ExceptionThrowND06 exceptionThrowND06 = new ExceptionThrowND06();

        try {
            exceptionThrowND06.throwMyException();
        }catch (MyExceptionForHW06 e){
            System.err.println("Error: " + e.getMessage());
        }

    }
}
