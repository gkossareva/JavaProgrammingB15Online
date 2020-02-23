package day06;

import java.util.Scanner;


public class WakeUpTask {
    public static void main(String[] args) {
        //creat 3 variable called regularPrice,salePrice and discountPercentage
        //
        //Ask user fquestion using scaneer for regularPrice discountPercentage
        //and save the result into the variable
        //
        //Calculate sale price using above infp
        //e.g.: 80 regular price, 0.2 for discout, so sale price will be 64
        //
        //print out : regular price is 80, discount is 0.2 (%) you got deal for 64$
        Scanner scan=new Scanner(System.in);
       //double regularPrice;
       // double salePrice;
       //double discountPercentage;
        double regularPrice,salePrice,discountPercentage;

       // if you have variables with same data type, you can declarw them in 1 line like this:

        System.out.println("What is the regular price?");
        regularPrice=scan.nextDouble();

        System.out.println("What is the discount?");
        discountPercentage=scan.nextDouble();

        salePrice = regularPrice-regularPrice*discountPercentage;
        System.out.println("Regular price is $" + regularPrice + " discount is $"
                + discountPercentage + " your sale price is $" + salePrice);



    }
}
