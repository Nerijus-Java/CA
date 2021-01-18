package com.JavaCode.lessons.week3.day4.abstractClasses.task4;

public abstract class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract String printUser();

    protected String getName() {
        return name;
    }

    protected String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "name :" + name + '\n' +
                "surname :" + surname + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Teacher){
            Teacher teacher = (Teacher) o;
            if (name.equals(teacher.getName()) && surname.equals(teacher.getSurname())){
                return true;
            }
        }else if (o instanceof Student){
            Student student = (Student) o;
            if (name.equals(student.getName()) && student.equals(student.getSurname())){
                return true;
            }
        }
        return false;
    }

}
