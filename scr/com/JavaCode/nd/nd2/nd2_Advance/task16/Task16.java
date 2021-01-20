package com.JavaCode.nd.nd2.nd2_Advance.task16;

public class Task16 {

    public static void main(String[] args) {
        primeNumbers(100);
    }

    public static void primeNumbers(int to) {
        for (int i = 2; i < to; i++) {
            if (isPrimeNumber(i) && isPrimeNumber(i + 2)){
                System.out.println("(" + i + ")" + "(" + (i + 2) + ")");

            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2){
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
