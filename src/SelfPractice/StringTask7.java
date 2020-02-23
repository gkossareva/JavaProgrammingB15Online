package SelfPractice;
import java.util.Scanner;
public class StringTask7 {
    public static void main(String[] args) {
        //Task 7:
        //Ask user to enter valid email address
        //for example :
        // JSnow@NightWatch.com or
        // Arya@KingsLanding.edu
        // print 3 part of the email separately
        // for example :
        // Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
        // Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email address");
        String email=scan.next();

        String part1 = email.substring(0, email.indexOf('@'));
        System.out.println("part1 -" + part1);

        String part2 = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        System.out.println("part2 - " + part2);

        String part3 = email.substring(email.indexOf('.')+1);
        System.out.println("part3 - " + part3);

    }
}
