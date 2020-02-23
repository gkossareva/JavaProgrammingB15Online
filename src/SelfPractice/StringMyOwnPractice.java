package SelfPractice;
import java.util.Scanner;
public class StringMyOwnPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid URL:");
        String validURL = scan.next();
        System.out.println("The dots are located at these indexes:  " + validURL.indexOf(".") + " and " +
                validURL.lastIndexOf("."));
    }
}
