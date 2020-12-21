package com.JavaCode.lessons.nd.nd4.Polimorfizmo;

public class EmployedPerson extends PrivetPerson {

    public EmployedPerson(String gender, String name, int id) {
        super.Gender = gender;
        super.name = name;
        super.personalID = id;
    }

    @Override
    String getEmploymentStatus() {
        return "Employed";
    }
}
