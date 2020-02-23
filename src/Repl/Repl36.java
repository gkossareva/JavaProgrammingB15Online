package Repl;
import java.util.*;
public class Repl36 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int coupon;
        System.out.println("Enter number of coupons:");
        coupon=scan.nextInt();
int numberOfCandies, numberOfGumball;
        numberOfCandies=coupon/10;
        numberOfGumball=coupon/3;
        //candy bar 10 gumball 3
        if ( coupon>=10|| coupon>=3) {
            System.out.println("Number of Candies:" +numberOfCandies);
        System.out.println("Number of Gumball:" +((numberOfCandies-numberOfGumball)%3));
       /* }else if( coupon>=3) {
            System.out.println("Number of Gumball:" +numberOfGumball);
            System.out.println("Number of Gumball:" +((numberOfCandies-numberOfGumball)%3));*/
        }

    }
}
