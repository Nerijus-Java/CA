package com.JavaCode.lessons.week3.day4.abstractClasses.task5;

import com.JavaCode.lessons.week3.day4.abstractClasses.task4.*;

public class Task5 {

    public static void main(String[] args) {

        User teacher = new Teacher("SomeOne", "Something", 5125);
        User user = new Student("Nerijus", "Viliusis", 41243);
        User teacher2 = new Student("Nerijus", "Viliusis", 41243);
        User user2 = new Student("Nerijus", "Viliusis", 41243);

        User[] users = {teacher, teacher2, user, user2};
        System.out.println(arUsersUnique(users));

    }


    public static boolean arUsersUnique(User[] user) {
        int userCount = 0;
        int userCount2 = 0;
        for (User u : user) {
            for (User u1 : user) {
                if (userCount == userCount2) {
                    userCount2++;
                    continue;
                } else if (u.equals(u1)) {
                    return false;
                }
                userCount2++;
            }
            userCount2 = 0;
            userCount++;
        }
        return true;
    }
}
