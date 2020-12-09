package nd.nd2.nd2_Advance.task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ");

        String userInput = sc.nextLine();
        System.out.println("Number of vowels " + amountOfVowelsInString(userInput));

    }

    public static int amountOfVowelsInString(String input){
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'i' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'o'|| input.charAt(i) == 'u'){
                count ++;
            }
        }
        return count;
    }
}
