package com.JavaCode.project.catagory;

public class CatagoryHelper {
    private final CatagoryCollection catagoryCollection = new CatagoryCollection();

    public Catagory getCatagory(int i){
        return catagoryCollection.getCatagory()[i];
    }

    public Catagory getHighestIncomeCatagory(){
        int max = Integer.MIN_VALUE;

        Catagory catagoryMax = new Catagory("None",true,1);
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
        Catagory catagoryMax = new Catagory("None",true,1);

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
        Catagory catagoryMax = new Catagory("None",false,1);

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
        Catagory catagoryMax = new Catagory("None",false,1);

        for (Catagory c : catagoryCollection.catagory){
            if (c.getAmount() < max && !c.isIncome() && c.getAmount() != 0){
                catagoryMax = c;
                max = c.getAmount();
            }
        }
        return catagoryMax;
    }
}
