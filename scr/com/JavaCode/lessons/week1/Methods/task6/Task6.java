package com.JavaCode.lessons.week1.Methods.task6;

public class Task6 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);
        System.out.println(addOne(number));
        System.out.println(addNum(number,10));
    }

    public static int addOne(int num){
        return ++num;
    }
    public static int addNum(int num , int addNum){
        return num+addNum;
    }
}
