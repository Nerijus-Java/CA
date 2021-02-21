package com.JavaCode.project.database;

public class QueryHelper {

    public String allUsersQuery = "SELECT p.NAME ,p.PASSWORD ,p.USER_ID FROM PERSON p;";

    public String addPersonQuery(String name, String password) {
        return "INSERT INTO PERSON (NAME,PASSWORD) VALUES('" + name + "','" + password + "');";
    }

    public String addIncome(int amount, boolean transfer, boolean taxes, int userID, int catagoryID) {
        return "INSERT INTO INCOME (AMOUNT,TRANSFER,TAXES,USER_ID,INCOME_CATAGORY_ID) " +
                "VALUES(" + amount + "," + transfer + "," + taxes + "," + userID + "," + catagoryID + ");";
    }

    public String addCost(int amount, boolean hidden, int userID, int catagoryID){
        return "INSERT INTO COSTS (AMOUNT, HIDDEN, USER_ID, INCOME_CATAGORY_ID) " +
                "VALUES ("+amount+","+hidden+","+userID+","+catagoryID+")";
    }

}
