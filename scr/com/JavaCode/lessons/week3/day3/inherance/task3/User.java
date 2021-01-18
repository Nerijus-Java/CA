package com.JavaCode.lessons.week3.day3.inherance.task3;

public class User {

    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name :" + name + '\n' +
                "surname :" + surname;
    }

    @Override
    public User clone() {
        return new User(name, surname);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User) {
            User user = (User) o;
            if (name.equals(user.getName()) && surname.equals(user.getSurname())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
