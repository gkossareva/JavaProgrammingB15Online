package Repl;
import java.util.*;

public class Repl34VendingMachine {
    public static void main(String[] args) {
        int itemPrice;
        int quarters, dimes, nickels;
        System.out.println("Enter price in cents:");
       Scanner scan=new Scanner(System.in);
        itemPrice=scan.nextInt();
        quarters=(100-itemPrice)/25;
        dimes=(100-itemPrice)%25/10;
        nickels=(100-itemPrice)%25%10/5;
       // itemPrice % 5 == 0;
      // If (100<itemPrice<25){
        if (itemPrice<25 || itemPrice>100){
            System.out.println("Invalid price!");
        }else if (itemPrice%5!=0){
            System.out.println("Invalid price!");
        }else
        System.out.println("Your change is "+quarters+" quarters "+dimes+" dimes "+nickels+" nickels " );
        }
    }

