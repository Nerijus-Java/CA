package nd.nd1_methods_and_more.nd1_A;

import java.util.Scanner;

public class Task2a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a full number");
        int userInput = sc.nextInt();

        System.out.println("Your number cubed: "+ toCubed(userInput));
    }

    public static int toCubed(int number){
        return number * number * number;
    }
}
