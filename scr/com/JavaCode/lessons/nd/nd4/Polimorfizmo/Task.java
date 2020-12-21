package com.JavaCode.lessons.nd.nd4.Polimorfizmo;

public class Task {

    public static void main(String[] args) {

    }

    public static Person makePerson(boolean employed, String name, String gender, int id){
        if (employed){
            return new EmployedPerson(gender,name,id);
        }else {
            return new UnemployedPerson(gender,name,id);
        }
    }
}
