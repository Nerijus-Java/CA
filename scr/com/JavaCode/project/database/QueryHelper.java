package com.JavaCode.project.database;

public class QueryHelper {

    public String allUsersQuery = "SELECT p.NAME ,p.PASSWORD ,p.USER_ID FROM PERSON p;";

    public String userBalanceByID(int userID) {
        return "SELECT AMOUNT FROM BALANCE WHERE USER_ID = " + userID + ";";
    }

    public String allCostsFromDB(int userID) {
        return "SELECT c.AMOUNT ,c.COST_CATAGORY_ID ,c.COST_DATE ,c.HIDDEN " +
                "FROM COSTS c WHERE c.USER_ID = " + userID + ";";
    }

    public String allIncomeFromDB(int userID) {
        return "SELECT i.AMOUNT ,i.INCOME_CATAGORY_ID ,i.INCOME_DATE,i.INCOME_ID ,i.TAXES ,i.TRANSFER " +
                "FROM INCOME i WHERE i.USER_ID = " + userID + ";";
    }

    public String allCostCategoriesFromDB(int userID) {
        return "SELECT cc.AMOUNT , cc.COST_CATAGORY_ID , cc.NAME ,cc.USER_ID " +
                "FROM COST_CATAGORY cc WHERE USER_ID = " + userID + ";";
    }

    public String allIncomeCategoriesFromDB(int userID) {
        return "SELECT ic.AMOUNT , ic.INCOME_CATAGORY_ID , ic.NAME ,ic.USER_ID " +
                "FROM INCOME_CATAGORY ic WHERE USER_ID = " + userID + ";";
    }

    public String makeBalance(int userID) {
        return "INSERT INTO BALANCE (AMOUNT,USER_ID) " +
                "VALUES (0," + userID + ");";
    }

    public String addPersonIncomeCatagorys(int userID) {
        return "INSERT INTO INCOME_CATAGORY (NAME,AMOUNT,USER_ID) " +
                "VALUES " +
                " ('Salary',0," + userID + "), " +
                " ('Real estate for rent',0," + userID + "), " +
                " ('Scholarship',0," + userID + "), " +
                " ('Benefit',0," + userID + "), " +
                " ('Individual activities',0," + userID + "), " +
                " ('Gifts',0," + userID + "), " +
                " ('Other',0," + userID + ") ;";
    }

    public String addPersonCostCategory(int userID) {
        return "INSERT INTO COST_CATAGORY (NAME,AMOUNT,USER_ID) " +
                "VALUES " +
                " ('Shop',0," + userID + "), " +
                " ('Leasing fees',0," + userID + "), " +
                " ('Housing taxes',0," + userID + "), " +
                " ('Studies',0," + userID + "), " +
                " ('Entertainment',0," + userID + "), " +
                " ('Car',0," + userID + "), " +
                " ('Clothing',0," + userID + "), " +
                " ('Health',0," + userID + "), " +
                " ('Other',0," + userID + ") ;";
    }

    public String addPersonQuery(String name, String password) {
        return "INSERT INTO PERSON (NAME,PASSWORD) VALUES('" + name + "','" + password + "');";
    }

    public String addIncome(int amount, boolean transfer, boolean taxes, int userID, int catagoryID) {
        return "INSERT INTO INCOME (AMOUNT,TRANSFER,TAXES,USER_ID,INCOME_DATE,INCOME_CATAGORY_ID) " +
                "VALUES(" + amount + "," + transfer + "," + taxes + "," + userID + ",CURRENT_TIMESTAMP," + catagoryID + ");";
    }

    public String addCost(int amount, boolean hidden, int userID, int catagoryID) {
        return "INSERT INTO COSTS (AMOUNT, HIDDEN, USER_ID,COST_DATE, COST_CATAGORY_ID) " +
                "VALUES (" + amount + "," + hidden + "," + userID + ",CURRENT_TIMESTAMP," + catagoryID + ")";
    }

    public String addOrMinusToBalance(int amount, int userID) {
        return "UPDATE BALANCE SET AMOUNT = AMOUNT + " + amount + " WHERE USER_ID = " + userID + ";";
    }

    public String costCatagoryAddOrMinus(int amount, int catagoryID) {
        return "UPDATE COST_CATAGORY SET AMOUNT = " + amount + " + 20 WHERE COST_CATAGORY_ID = " + catagoryID + ";";
    }

    public String incomeCatagoryAddOrMinus(int amount, int catagoryID) {
        return "UPDATE INCOME_CATAGORY SET AMOUNT = " + amount + " + 20 WHERE INCOME_CATAGORY_ID = " + catagoryID + ";";
    }
}
