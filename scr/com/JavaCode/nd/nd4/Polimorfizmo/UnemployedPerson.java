package com.JavaCode.nd.nd4.Polimorfizmo;

public class UnemployedPerson extends PrivetPerson {

    public UnemployedPerson(String gender, String name, int id) {
        super.Gender = gender;
        super.name = name;
        super.personalID = id;
    }

    @Override
    String getEmploymentStatus() {
        return "Unemployed";
    }
}
