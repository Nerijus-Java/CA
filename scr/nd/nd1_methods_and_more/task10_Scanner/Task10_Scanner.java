package nd.nd1_methods_and_more.task10_Scanner;

import java.util.Scanner;

public class Task10_Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
