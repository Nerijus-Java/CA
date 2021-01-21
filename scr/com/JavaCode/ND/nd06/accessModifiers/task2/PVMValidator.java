package com.JavaCode.ND.nd06.accessModifiers.task2;

public class PVMValidator {

    public boolean validate(char[] numbers){

        int[] ints = charArrayToIntArray(numbers);

        int count = 0;
        for (int i : ints){
            if (count == 8){
                return i == 1;
            } else if (count == 9){

            }

            count++;
        }
    }

    private int getA1(int [] ints){
        int count = 1;
        int sum = 0;
        for (int i : ints){
            sum += (count * i);
            count++;
        }
        return sum;
    }

    private int getR1(int[] ints){
        return getA1(ints) % 11;
    }


    private int[] charArrayToIntArray(char[] chars){
        int[] ints = new int[chars.length];
        int count = 0;
        for (char c: chars){
            ints[count] = Integer.parseInt(String.valueOf(c));
            count++;
        }

        return ints;
    }
}
