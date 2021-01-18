package com.JavaCode.lessons.week3.day4.abstractClasses.task4;

public class Teacher extends User {
    private int Id;

    public Teacher(String name, String surname, int teacherId) {
        super(name, surname);
        this.Id = teacherId;
    }

    @Override
    public String printUser() {
        return "Teacher:" + '\n' + getName() + '\n' + getSurname() + '\n' + this.Id;
    }

}
