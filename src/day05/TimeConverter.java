package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        int minutesaDay=1440;
    Scanner scan=new Scanner (System.in);
        System.out.println("How much day you want to convert:");
        double day= scan.nextDouble();
        double minute=day*minutesaDay;
        System.out.println("You entered "+day+" and it equals to "+minute+" minutes");
        day=minute/minutesaDay;
        System.out.println(minute+"minutes equals to "+day+" days");

    // create an interactive program to ask user for a day
    //and generate minute that day have

    //task4:
    //create an interactive program to ask user for hourly wage
    //and generate yearly salary
    //assume he works 2080 hour a year

    //task 5


    }
}
