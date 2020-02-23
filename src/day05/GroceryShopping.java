package day05;
 import java.sql.SQLOutput;
 import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Task 5 : Grocery Shopping
        //    *   ask user whats the price of tomato and store it
        //        ask user how many tomato you want to buy and store it
        //    *   ask user whats the price of potato and store it
        //        ask user how many potato you want to buy and store it
        //    *   ask user whats the price of banana and store it
        //        ask user how many banana you want to buy and store it
        //
        //        generate this example output
        //        You got 3 tomato price is 2.99 and total -->>
        //        You got 5 potato price is 3.49 and total -->>
        //        You got 2 banana price is 1.99 and total -->>
        //
        //        Your grand total for this shopping is ????
        System.out.println("What is the tomato price?");
        double tomatoPrice=scan.nextDouble();
        System.out.println("How many tomatoes do you want to buy?");
        int tomatoQuantity=scan.nextInt();
        double tomatoTotal=tomatoPrice*tomatoQuantity;

        System.out.println("What is the potato price?");
        double potatoPrice=scan.nextDouble();
        System.out.println("How many tomatoes do you want to buy?");
        int potatoQuantity=scan.nextInt();
        double potatoTotal=potatoPrice*potatoQuantity;

        System.out.println("What is the banana price?");
        double bananaPrice=scan.nextDouble();
        System.out.println("How many bananas do you want to buy?");
        int bananaQuantity=scan.nextInt();
        double bananaTotal=bananaPrice*bananaQuantity;

        System.out.println("You got "+tomatoQuantity+" tomatoes "+"price is "+tomatoPrice+"and total is "+tomatoTotal);
        System.out.println("You got "+potatoQuantity+" potatoes "+"price is "+potatoPrice+"and total is "+potatoTotal);
        System.out.println("You got "+bananaQuantity+" bananas "+"price is "+bananaPrice+"and total is "+bananaTotal);

    }
}
