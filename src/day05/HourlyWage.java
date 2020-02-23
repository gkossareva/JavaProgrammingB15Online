package day05;

import java.util.Scanner;

public class HourlyWage {
    public static void main(String[] args) {
        //Task 4 :
        //    *  Create an interactive program to ask user for hourly wage
        //    *  and generate yearly salary
        //        assume that he works 2080 hour for a year.
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your hourly wage?");
        double hourlyWage=scan.nextDouble();
        //int yearHours=2080;
        System.out.println("How many days a year did you work");
        int yearHours=scan.nextInt();
        double yearlySalary=yearHours*hourlyWage;
        System.out.println("You earned $"+ yearlySalary+" for this year");

    }
}
