package Repl;
import java.util.*;
public class Repl37 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int coupon;
        System.out.println("Enter number of coupons:");
        coupon=scan.nextInt();
        //int numberOfCandies, numberOfGumball;
   int numberOfCandies=coupon/10;
 int numberOfGumball=(coupon%10)/3;
        //candy bar 10 gumball 3
        if ( coupon>=10 ||coupon>=3) {
            System.out.println("Number of Candies:" +numberOfCandies);
     //   }else if(coupon>=3) {
            System.out.println("Number of Gumball:" +numberOfGumball);
        }else{
            System.out.println("Not enough coupons");

        }

    }
}

