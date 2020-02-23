package Repl;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Repl86Party {

    public static void main(String[] args) {
        //Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
        //Ask for the first guest name.
        //Then ask does user want to enter one more guest.
        // If yes - take input from.
        //If not - finish the program and print list of the guests.
        //
        //Example of the program:
        Scanner input = new Scanner(System.in);
        String name = "";
        String answer = "";

        int count = 0;
        do {
            System.out.println("Please enter guest name:");
            name += input.next();
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();
            name = name + ", ";
        } while (answer.equalsIgnoreCase("yes"));
     //   if (name.charAt(name.length() - 1) == ',') {
       //     name = name.replace(name.substring(name.length() - 1), "");
            System.out.println("Guest's list: " + name.substring(0, name.length()-2));
        }
    }

       /*     String name = "Galina";
        String countinue = "";
        Scanner input = new Scanner(System.in);
        int count = 1;


        System.out.println("Please enter guest name:");

        String guest = input.next();

        System.out.println("Do you want to enter new guest name:");

        countinue = input.next();

   if (countinue.equalsIgnoreCase("yes"));
        System.out.println("Do you want to enter new guest name:");
            count++;*/

