package nd.nd2.nd2_Advance.task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        String number = sc.nextLine();

        System.out.println(sumOfNumber(number.toCharArray()));
    }

    public static int sumOfNumber (char[] chars){
        String holder = "";
        int sum = 0;
        for (char c : chars){
            holder += c;
            sum += Integer.valueOf(holder);
            holder = "";
        }
        return sum;
    }
}
