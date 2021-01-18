package com.JavaCode.lessons.week3.day3.inherance.task3;

public class Task3 {

    public static void main(String[] args) {
        User user = new User("Nerijus", "Vilusis");
        System.out.println(user.toString());

        System.out.println();

        User userClone = user.clone();
        System.out.println(user.toString());

        if (user.equals(userClone)){
            System.out.println("They are the same");
        }else {
            System.out.println("They are different");
        }

        System.out.println();

        User userTwo = new User("James","Jamerson");
        System.out.println();
        System.out.println(userTwo.toString());

        if (user.equals(userTwo)){
            System.out.println("They are the same");
        }else {
            System.out.println("They are different");
        }



    }
}
