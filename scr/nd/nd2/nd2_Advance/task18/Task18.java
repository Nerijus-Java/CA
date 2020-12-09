package nd.nd2.nd2_Advance.task18;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount of rice");
        int amountOfRice = sc.nextInt();

        System.out.println(amountOfBags(amountOfRice));
    }

    public static String amountOfBags(int amount) {
        int amountOfBags5Kg = 0;
        int amountOfBags1Kg = 0;

        while (amount != 0) {
            if (amount > 5) {
                amountOfBags5Kg++;
                amount -= 5;
            } else if (amount >= 1) {
                amountOfBags1Kg++;
                amount -= 1;
            }
        }
        return "5kg bags :" + amountOfBags5Kg + '\n' + "1kg bags :" + amountOfBags1Kg;
    }
}
