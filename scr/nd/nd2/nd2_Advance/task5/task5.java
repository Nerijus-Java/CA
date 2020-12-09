package nd.nd2.nd2_Advance.task5;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter :");
        String userInput = sc.nextLine();

        System.out.println("Word amount :" + howManySpaces(userInput.toCharArray()));
    }

    public static int howManySpaces(char[] userInputChar){
        int count = 0;

        for (char c : userInputChar){
            if (c == ' '){
                count++;
            }
        }
        count++;
        return count;
    }
}
