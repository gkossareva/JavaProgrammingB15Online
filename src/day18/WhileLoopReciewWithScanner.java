package day18;
import java.util.Scanner;
public class WhileLoopReciewWithScanner {
    public static void main(String[] args) {
        //smart lock door has paaword
        //unless you enter correct password
        //it keep locking you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan= new Scanner(System.in);

        System.out.println("Knock Knock");
        System.out.println("What's the password?");

        //getting the password for the first time
        String password=scan.next();

        while (!password.equals("B15")){
            System.out.println("Wrong Password!Try Again!");
            password=scan.next();
        }
        System.out.println("Open Seasame");
    }
}
