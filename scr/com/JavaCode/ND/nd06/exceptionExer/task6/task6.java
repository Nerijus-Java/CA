package com.JavaCode.ND.nd06.exceptionExer.task6;

public class task6 {

    public static void main(String[] args) {
        ThrowExceptions throwExceptions = new ThrowExceptions();

        try {
            throwExceptions.throwAllThree();
        } catch (ExceptionOne | ExceptionTwo | ExceptionThree e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
