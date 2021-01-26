package com.JavaCode.project.catagory;

public class CatagoryCollection {

    Catagory[] catagory = new Catagory[]{
    new Catagory("Salary", true, 0),
    new Catagory("Real estate for rent", true,0),
    new Catagory("Scholarship", true,0),
    new Catagory("Benefit", true,0),
    new Catagory("Individual activities", true,0),
    new Catagory("Gifts", true,0),
    new Catagory("Other", true,0),

    new Catagory("Shop" ,false,0),
    new Catagory("Leasing fees" ,false,0),
    new Catagory("Housing taxes" ,false,0),
    new Catagory("Studies" ,false,0),
    new Catagory("Entertainment" ,false,0),
    new Catagory("Car" ,false,0),
    new Catagory("Clothing" ,false,0),
    new Catagory("Health" ,false,0),
    new Catagory("Other" ,false,0)
    };

    public Catagory[] getCatagory() {
        return catagory;
    }
}
