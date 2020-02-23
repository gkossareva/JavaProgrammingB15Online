package Repl;
import java.util.*;
public class Repl33 {
    public static void main(String[] args) {

        //numberOfMilligrams in coffee=0.16
        ////numberOfMilligrams in cola=0.034
        Scanner scan = new Scanner(System.in);
        int milligrams, grams, drinks, overdose;
        System.out.println("Enter number of milligrams in drink: ");
        /*Write a program with a variable that holds the number of milli-
grams of caffeine in a drink and outputs how many drinks it takes to kill a person.

A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.

In one gram there are 1000 mg.

Please refer to the image above as an example and use any number of variables you want.
Dots mean a space in the image.*/
        milligrams=scan.nextInt();
        overdose= 10000/milligrams;

        System.out.println("It would take about "+overdose+"drinks for lethal overdose");
//coffee =10000%160=63
        //coke=10000%34=294

    }

    public static class Repl94 {
        public static void main(String[] args) {

                    Scanner scan = new Scanner(System.in);
                    // we import scanner for scan all itemns in our list

                    String shoppingListReport = "";
                    // we need to create new String variable for store our report for Shopping list

                    String item = "";
                    // for store each items which we have

                    String countinue = "";
    // for store "yes" or "no "

                    double price = 0;
    // create new double variable for store price (not int !)

                    int count = 1;
    // give the number each items ( like :items number 1, items number 2 )

                    double totalProce = 0;
                    // for summary all prices


    //  Ok, what we have). We should to write small program where accept up to 10 items. And our program should be ask scan name, price of items and "add new item?". lets try to use Do while loop.



                    do {
                        System.out.println("Enter Item" + count + " and its price:");
    // First question
                        item = scan.next();
    //scan item
                        price = scan.nextDouble();
    //scan price
                        System.out.println("Add one more item?");
    // second question
                        countinue = scan.next();
    // scan answer "yes" or "no"
                        shoppingListReport += "Item" + count + ": " + item + " Price: " + price +", ";
    // store and update our report , when do loop is repiting .
                        totalProce +=price;
                        // update our summary of price

                        if (countinue.equalsIgnoreCase("yes")) {
    // "if " condition we need to check our ansver about "add items "
    // I put string method ".equalsIgnoreCase" for ignore size of string .
                            count++;
                            // here we create a number of item

                            continue;
                            // I put "continue" for say to our program go to repit the loop

                        } else
                            break;
    //I put "break;" for If answer will be "no" go to stop our programm

                    } while (count <= 10); // here I will be put our condition how many time our "do loop" can repeat (not more then 10 times.)

                    String shoppingListReportV2 = "";// I want to create a new String because I want to store new shopping list without last "," .

                    if(shoppingListReport.endsWith(", ")) {// I will be use "If condition" and string method "endsWith" for cheak last  ",".

                        shoppingListReportV2 = shoppingListReport.substring(0, shoppingListReport.length()-2); // and I will to use "substring" method for cut the last ",".
                    }

                    System.out.println(shoppingListReportV2); // print our report
                    System.out.println("Total price: "+totalProce); // print sum


    //run the code two times with different items and show how code is working.


                }
            }
}
