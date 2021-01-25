package com.JavaCode.ND.nd06.exceptionExer.task6;

import java.util.Random;

public class ThrowExceptions {

    private Random random = new Random();

    public void throwAllThree() throws ExceptionOne, ExceptionTwo, ExceptionThree {
        int generatedNumber = random.nextInt(10) + 1;

        if (generatedNumber == 1){
            throw new ExceptionOne("One");
        } else if (generatedNumber == 2){
            throw new ExceptionTwo("Two");
        } else if (generatedNumber == 3){
            throw new ExceptionThree("Three");
        }

        throw new ArrayIndexOutOfBoundsException("Array out of bounds");
    }


}
