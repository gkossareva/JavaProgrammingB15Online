package day07;

import java.util.Scanner;

public class EmailBuilderWithTheScanner {
    public static void main(String[] args) {

        System.out.println("Enter your name, last name, company separated by space");
        Scanner scan= new Scanner(System.in);
        String firstName=scan.next();
        String lastName=scan.next();
        String company=scan.next();
        String email=scan.next();

        System.out.println("My name is "+ firstName+" "+ lastName+" and I work for "+ company +" and my email is "+email);
    }
}
