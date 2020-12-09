package nd.nd2.nd2_antra_savaite.task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id :");

        String userInput = sc.nextLine();

        Task4ClassIDCode idOne = new Task4ClassIDCode(userInput);

        if (idOne.isCodRightSize()){
            System.out.println(idOne.getCodeBDate() + " " + idOne.getGender());
        }else {
            System.out.println("Invalid id Code");
        }
    }
}
