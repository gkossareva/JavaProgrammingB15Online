package day05;

import java.sql.SQLOutput;

public class VariablePractice {
    public static void main(String[] args) {
        //8 primitive
       /*
       lan1
       lan2
       lan3
       whole numbers : byte,int,double
       fractional numbers: float, double
       logical: bolean(true, false)
       character: char in single quate

       USUALLY by default for whole numbers: just use int
       USUALLY by default for fractional numbers: just use double
       Is string a part of primitive tepy?: NOOOOOO
       String is a sequaence of character
        */


        //Task 1; Age calculator
        // given birth year, please calculate the age
        int birthYear=2001;
        int currentYear=2019;
       int age=currentYear-birthYear;
        //I was born in year 2001, and I am 18 years old;

        System.out.println("I was born in year "+birthYear+", and I am "+age+" years old");

        //task 2: you are speeding today. speed limit is , and your curent number is
        //generate this output of: you are driving 10mph more than speed limit

        int speedLimit = 60;
        int currentSpeed=70;
        int overTheLimit=currentSpeed-speedLimit;

        System.out.println("You are driving "+ overTheLimit + "mph over speed");



    }
}
