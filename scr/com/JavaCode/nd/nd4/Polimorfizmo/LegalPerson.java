package com.JavaCode.nd.nd4.Polimorfizmo;

public class LegalPerson extends Person {

    public LegalPerson(String gender, String name, int id) {
        super.Gender = gender;
        super.name = name;
        super.personalID = id;
    }

    public String getGender() {
        return super.Gender;
    }
}
