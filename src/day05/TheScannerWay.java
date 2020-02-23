package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        //ask user for the name
        //and capture the result
        //print your name is
                //ask user for the birth year
        //and capture the result
        //print the age
        //ask user for height
        //and capture the result
        //print the height
        Scanner scan=new Scanner(System.in);
        // you can name your variable whatever you want
        //in below case we call it scsn
        //Scanner is date type, scan is the name, newScanner(System.in) is the value
        System.out.println("What is your name?");
       // String name="Sam";
        String name=scan.next();
        System.out.println("My name is "+ name);

        System.out.println("What is your birth year?");
        int birthYear=scan.nextInt();
        int age = 2019-birthYear;
        System.out.println("My age is "+age);


        System.out.println("What is your height?");
        double height=scan.nextDouble();
        System.out.println("My height is "+height);

    }
}
