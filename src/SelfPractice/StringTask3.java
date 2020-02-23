package SelfPractice;
import java.util.Scanner;
public class StringTask3 {
    public static void main(String[] args) {
        // //Task 3:
        //        //Ask user to enter full name
        //        //assuming full name is 2 word
        //        //Write a program to print users initials
        //        //for example :
        //        //Jon Snow -->> Initial is JS
       Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name=scan.nextLine();
        System.out.println("Your initials are "+name.charAt(0) + name.charAt(name.indexOf(" ") + 1));
    }
}
