package com.JavaCode.project;

public class Menu {

    public static void mainMenu(){
        System.out.println("_______________");
        System.out.println("[1] income");
        System.out.println("[2] costs");
        System.out.println("[3] balance");
        System.out.println("[4] get check");
        System.out.println("[-] Done");
        System.out.println("_______________");
    }

    public static void incomeMenu(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("[1] Salary");
        System.out.println("[2] Real estate for rent");
        System.out.println("[3] Scholarship");
        System.out.println("[4] Benefit");
        System.out.println("[5] Individual activities");
        System.out.println("[6] Gifts");
        System.out.println("[7] Other");
        System.out.println();
        System.out.println("[-] back");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static void getCheckMenu(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("[1] All");
        System.out.println("[2] Highest income catagory");
        System.out.println("[3] Lowest income catagory");
        System.out.println("[4] highest cost catagory");
        System.out.println("[5] Lowest cost catagory");
        System.out.println();
        System.out.println("[-] back");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static void costMenu(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("[1] Shop");
        System.out.println("[2] Leasing fees");
        System.out.println("[3] Housing taxes");
        System.out.println("[4] Studies");
        System.out.println("[5] Entertainment");
        System.out.println("[6] car");
        System.out.println("[7] Clothing");
        System.out.println("[8] Health");
        System.out.println("[9] Other");
        System.out.println();
        System.out.println("[-] back");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static void amountMenu(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("Enter :" );
    }

    public static void transferToBalance(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Transfer to balance? (1 yes, 2 no)");
        System.out.print("Enter :" );
    }

    public static void taxes(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Dose payment have taxes? (1 yes, 2 no)");
        System.out.print("Enter :" );
    }

    public static void hidden(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Hidden cost? (1 yes, 2 no)");
        System.out.print("Enter :" );
    }
}
