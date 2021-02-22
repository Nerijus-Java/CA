package com.JavaCode.project.database;

public class QueryHelper {

    public String allUsersQuery = "SELECT p.NAME ,p.PASSWORD ,p.USER_ID FROM PERSON p;";

    public String allCostsFromDB (int userID){
        return "SELECT c.AMOUNT ,c.COST_CATAGORY_ID ,c.COST_DATE ,c.HIDDEN FROM COSTS c JOIN PERSON p ON c.USER_ID = p."+userID+" ;";
    }

    public String allIncomeFromDB (int userID){
        return "SELECT i.AMOUNT ,i.INCOME_CATAGORY_ID ,i.INCOME_DATE,i.INCOME_ID ,i.TAXES ,i.TRANSFER" +
                "FROM INCOME i JOIN PERSON p ON i.USER_ID = "+userID+" ;";
    }

    public String allCostCategoriesFromDB(int userID){
        return "SELECT cc.AMOUNT , cc.COST_CATAGORY_ID , cc.NAME ,cc.USER_ID FROM COST_CATAGORY cc " +
                "JOIN PERSON p ON cc.USER_ID = "+userID+";";
    }

    public String allIncomeCategoriesFromDB(int userID){
        return "SELECT ic.AMOUNT , ic.INCOME_CATAGORY_ID , ic.NAME ,ic.USER_ID FROM INCOME_CATAGORY ic " +
                "JOIN PERSON p ON ic.USER_ID = "+userID+";";
    }

    public String addPersonQuery(String name, String password) {
        return "INSERT INTO PERSON (NAME,PASSWORD) VALUES('" + name + "','" + password + "');";
    }

    public String addIncome(int amount, boolean transfer, boolean taxes, int userID, int catagoryID) {
        return "INSERT INTO INCOME (AMOUNT,TRANSFER,TAXES,USER_ID,INCOME_DATE,INCOME_CATAGORY_ID) " +
                "VALUES(" + amount + "," + transfer + "," + taxes + "," + userID + ",CURRENT_TIMESTAMP," + catagoryID + ");";
    }

    public String addCost(int amount, boolean hidden, int userID, int catagoryID){
        return "INSERT INTO COSTS (AMOUNT, HIDDEN, USER_ID,COST_DATE, COST_CATAGORY_ID) " +
                "VALUES ("+amount+","+hidden+","+userID+",CURRENT_TIMESTAMP,"+catagoryID+")";
    }

    public String addOrMinusToBalance(int amount,int userID){
        return "UPDATE BALANCE SET AMOUNT = AMOUNT + "+amount+" WHERE USER_ID = "+userID+";";
    }

    public String costCatagoryAddOrMinus(int amount, int catagoryID){
        return "UPDATE COST_CATAGORY SET AMOUNT = "+amount+" + 20 WHERE COST_CATAGORY_ID = "+catagoryID+";";
    }

    public String incomeCatagoryAddOrMinus(int amount, int catagoryID){
        return "UPDATE INCOME_CATAGORY SET AMOUNT = "+amount+" + 20 WHERE INCOME_CATAGORY_ID = "+catagoryID+";";
    }
}
