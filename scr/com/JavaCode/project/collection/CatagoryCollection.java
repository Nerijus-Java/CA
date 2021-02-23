package com.JavaCode.project.collection;

import com.JavaCode.project.model.Catagory;

public class CatagoryCollection {

    public Catagory[] catagory = new Catagory[]{
            new Catagory("Salary", true, 0, 1),
            new Catagory("Real estate for rent", true, 0, 2),
            new Catagory("Scholarship", true, 0, 3),
            new Catagory("Benefit", true, 0, 4),
            new Catagory("Individual activities", true, 0, 5),
            new Catagory("Gifts", true, 0, 6),
            new Catagory("Other", true, 0, 7),

            new Catagory("Shop", false, 0, 1),
            new Catagory("Leasing fees", false, 0, 2),
            new Catagory("Housing taxes", false, 0, 3),
            new Catagory("Studies", false, 0, 4),
            new Catagory("Entertainment", false, 0, 5),
            new Catagory("Car", false, 0, 6),
            new Catagory("Clothing", false, 0, 7),
            new Catagory("Health", false, 0, 8),
            new Catagory("Other", false, 0, 9)
    };

    public Catagory[] getCatagory() {
        return catagory;
    }

    public Catagory getCatagoryByName(String name) {
        for (Catagory catagory : catagory) {
            if (catagory.getName().equals(name)) {
                return catagory;
            }
        }
        return new Catagory("null", true, 0, -1);
    }

    public Catagory getCatagoryByID(int id, boolean income) {
        for (Catagory catagory: catagory){
            if (catagory.getId() == id && income == catagory.isIncome()){
                return catagory;
            }
        }
        return new Catagory("null", true, 0, -1);
    }

}
