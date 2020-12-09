package nd.nd1_methods_and_more.task11_Odd;

public class Task11_Odd {

    public static void main(String[] args) {
        System.out.println(isOdd(44));
        System.out.println(isOdd(45));
    }

    public static Boolean isOdd(int num){
        if (num % 2 == 0){
            return false;
        }else {
            return true;
        }
    }
}
