package Repl;
import java.util.*;
public class Repl35GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        //  item Smartphone, Laptop, Charger, USB cable, Headphones,
        //   Pants,Hat, Socks,Blanket,Pillow;
        //WRITE YOUR CODE HERE
       /* double Smartphone=300.00;
        double Laptop=400.00;
        double Charger=15.00;
        double USBCable=10.00;
        double Headphones=30.00;
        double Pants=50.00;
        double Hat=25.00;
        double Socks=5.00;
        double Blanket=60.00;
        double Pillow=40.00;*/

        if (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 15));
        } else if (item.equals("USB Cable")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 10));
        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 30));
        } else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 50));
        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 25));
        } else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 5));
        } else if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 60));
        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - 40));
        }else{
            System.out.println("Invalid item!");
        }
    }
}