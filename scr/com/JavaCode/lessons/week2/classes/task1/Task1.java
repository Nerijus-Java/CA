package com.JavaCode.lessons.week2.classes.task1;

public class Task1 {

    public static void main(String[] args) {

//        task1();

        task1a();
    }

    public static String printUser(User user){
        return "Name: " + user.name + '\n' + "Age: " + user.age + '\n'
                + "------------------";
    }

    public static void task1(){
        User user1 = new User("Nerijus",18);
        User user2 = new User("James",56);
        User user3 = new User("Max",46);
        User user4 = new User("Jenny",36);
        User user5 = new User("Jay",58);

        System.out.println("__________________Class__________________");

        System.out.println(user1.printUser());
        System.out.println(user2.printUser());
        System.out.println(user3.printUser());
        System.out.println(user4.printUser());
        System.out.println(user5.printUser());

        System.out.println("__________________Static__________________");
        System.out.println(printUser(user1));
        System.out.println(printUser(user2));
        System.out.println(printUser(user3));
        System.out.println(printUser(user4));
        System.out.println(printUser(user5));
    }

    public static void task1a (){
        User[] users = new User[5];

        users[0] = new User("Nerijus",18);
        users[1] = new User("James",56);
        users[2] = new User("Max",46);
        users[3] = new User("Jenny",36);
        users[4] = new User("Jay",58);

        for (User user : users){
            System.out.println(user.printUser());
        }
    }
}
