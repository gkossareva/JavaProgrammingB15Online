package day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerCapturingOneWord {
    public static void main(String[] args) {

        Scanner blabla=new Scanner (System.in);

        System.out.println("What's your name?");
        String name = blabla.next();// it will only capture first word(separated by space)

        // String anotherWord = blabla.next();

        int age=blabla.nextInt();
        System.out.println("You entered "+ name);
        System.out.println("You have enetered age "+ age);
    }
}
