package com.JavaCode.project.catagory;

import com.JavaCode.project.collection.CatagoryCollection;
import com.JavaCode.project.model.Catagory;

public class CatagoryHelper {

    public static final Catagory NONE_INCOME = new Catagory("None", true, 0,0);
    public static final Catagory NONE_COST = new Catagory("None", false, 0,0);

    private final CatagoryCollection catagoryCollection;

    public CatagoryHelper(CatagoryCollection catagoryCollection) {
        this.catagoryCollection = catagoryCollection;
    }

    public Catagory getCatagory(int i){
        return catagoryCollection.getCatagory()[i];
    }

    public Catagory getHighestIncomeCatagory(){
        int max = Integer.MIN_VALUE;
        Catagory catagoryMax = NONE_INCOME;
        for (Catagory c : catagoryCollection.catagory){
            if (c.getAmount() > max && c.isIncome() && c.getAmount() != 0){
                catagoryMax = c;
                max = c.getAmount();
            }
        }
        return catagoryMax;
    }

    public Catagory getLowestIncomeCatagory(){
        int min = Integer.MAX_VALUE;
        Catagory catagoryMax = NONE_INCOME;

        for (Catagory c : catagoryCollection.catagory){
            if (c.getAmount() < min && c.isIncome() && c.getAmount() != 0){
                catagoryMax = c;
                min = c.getAmount();
            }
        }
        return catagoryMax;
    }

    public Catagory getMostCostCatagory(){
        int max = Integer.MIN_VALUE;
        Catagory catagoryMax = NONE_COST;

        for (Catagory c : catagoryCollection.catagory){
            if (c.getAmount() > max && !c.isIncome() && c.getAmount() != 0){
                catagoryMax = c;
                max = c.getAmount();
            }
        }
        return catagoryMax;
    }

    public Catagory getLowestCostCatagory(){
        int max = Integer.MAX_VALUE;
        Catagory catagoryMax = NONE_COST;

        for (Catagory c : catagoryCollection.catagory){
            if (c.getAmount() < max && !c.isIncome() && c.getAmount() != 0){
                catagoryMax = c;
                max = c.getAmount();
            }
        }
        return catagoryMax;
    }

}
