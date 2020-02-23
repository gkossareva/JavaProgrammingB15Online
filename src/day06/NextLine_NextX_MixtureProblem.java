package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = blabla.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("What's your age?");
        int age = blabla.nextInt();
        //we are not storing this into variable
        //we just want below line to capture ENTER KEYBOARD INPUT
        //so that it does not accidently get captured by the nextLine we use to capture address
        blabla.nextLine();
        System.out.println("Your age is " + age);

        System.out.println("What's your address?");
        String address=blabla.nextLine();
        System.out.println("Your address is " + address);
    }
}