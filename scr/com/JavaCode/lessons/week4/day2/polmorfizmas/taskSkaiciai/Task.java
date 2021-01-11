package com.JavaCode.lessons.week4.day2.polmorfizmas.taskSkaiciai;

public class Task {

    public static void main(String[] args) {
        Number numberOne = new TrueNumber();
        printIntArray(numberOne);

        Number numberTwo = new EvenNumber();
        printIntArray(numberTwo);
    }

    public static void printIntArray(Number number){
        for (int i : number.generate()){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("sum :" + number.sum());
    }
}
