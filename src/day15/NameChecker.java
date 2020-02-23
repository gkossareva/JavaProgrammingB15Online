package day15;
import javax.swing.*;
import java.util.Scanner;
public class NameChecker {
    public static void main(String[] args) {
        //task 1 check wether your name length is less than 4
        //if so print short name
        //if it is within 5-10
       // if so print medium name
        //if it is more than 11
       // print longer name
        //part 2 check wether your name  either character a or e
        //if so name contains a or e
        //if not i dont have both a or e in my name
Scanner scan= new Scanner(System.in);
        System.out.println("Enter your name");
        String name =scan.next();
        int lengthOfTheName=name.length();
        System.out.println("Length of the name = "+lengthOfTheName);

        if (lengthOfTheName < 4) {
            System.out.println("Short name");
        } else if (lengthOfTheName > 4 && lengthOfTheName <= 11) {
            System.out.println("Medium name");
        } else {
            System.out.println("Longer name");
        }
        //--------------------------------
       if((name.contains("a")||name.contains("e"))) {
         System.out.println("name contains a or e");
        }else{
            System.out.println("i dont have a or e in my name");

        }

    }
}


