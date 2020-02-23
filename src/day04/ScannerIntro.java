package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //I want to get users input asking some questions
        //and I want to save this input so I can do smth with it

        //step 1: use Scanner class to creat object
        //that have this functionality

        Scanner scan = new Scanner(System.in);
        //ask user to enter name
        System.out.println("Enter your first name, please: ");
        //capture what use typed on keyboard in console
        String firstName=scan.next();

        //print the result of what we saved from user input
        System.out.println("You have entered: "+firstName);
        System.out.println("What is your age? ");
        int age=scan.nextInt();
        System.out.println("You have entered: " +age);


    }
}
