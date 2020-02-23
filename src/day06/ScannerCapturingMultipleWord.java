package day06;


import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

        Scanner blabla=new Scanner (System.in);

        System.out.println("What's your name?");
        String name = blabla.nextLine();// it will capture the whole line

        System.out.println("You have entered "+ name);


        //task use nextLine to ask your bio
        //what is your name
        //Which city do you live?
        //What is your street address


        System.out.println("Which state and city do you live?");
        String cityAndState = blabla.nextLine();
        System.out.println("You have entered "+ cityAndState);
        System.out.println("What is your street address?");
        String address = blabla.nextLine();
        System.out.println("You have entered "+ address);
        System.out.println("Your name is " + name + " , your live in " + cityAndState + ", your street address is " + address + ".");


    }
}
