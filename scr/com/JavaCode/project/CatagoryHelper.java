package com.JavaCode.project;

public class CatagoryHelper {

    private String[] catagory;
    private int[] amount;

    public CatagoryHelper() {
        this.catagory = new String[20];
        this.amount = new int[20];
    }


    public void add(String catagoryString, int amountNumber) {
        int count = 0;
        String[] stArray = catagory;
        for (String s : stArray) {
            if (s == null) {
                stArray[count] += catagoryString;
                setCatagory(stArray);
                break;
            }
            count++;
        }

        count = 0;
        int[] intArray = amount;
        for (int number : intArray) {
            if (number == 0) {
                intArray[count] = amountNumber;
                setAmount(intArray);
                break;
            }
            count++;
        }
    }

    public String printAllTransactions() {
        String holder = "";

        for (int i = 0; i < catagory.length; i++) {
            if (catagory[i] != null) {
                holder += catagory[i] + " : €" + amount[i] + "\n";
            }else {
                return holder.replace("null","");
            }
        }
        return holder.replace("null","");
    }

    private void setCatagory(String[] catagory) {
        this.catagory = catagory;
    }

    private void setAmount(int[] amount) {
        this.amount = amount;
    }
}
