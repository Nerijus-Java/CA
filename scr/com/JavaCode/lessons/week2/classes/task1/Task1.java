package com.JavaCode.lessons.week2.classes.task1;

public class Task1 {

    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Nerijus";
        user1.age = 18;

        User user2 = new User();
        user2.name = "James";
        user2.age = 56;

        User user3 = new User();
        user3.name = "Max";
        user3.age = 46;

        User user4 = new User();
        user4.name = "Jenny";
        user4.age = 36;

        System.out.println("___________________________________");

        user1.printUser();
        user2.printUser();
        user3.printUser();
        user4.printUser();
        System.out.println("___________________________________");

        printUser(user1);
        printUser(user2);
        printUser(user3);
        printUser(user4);
    }
    public static void printUser(User user){
        System.out.println("Name: " + user.name + '\n' + "Age: " + user.age + '\n'
                + "------------------");
    }
}
