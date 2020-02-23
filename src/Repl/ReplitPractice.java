package Repl;

import java.util.Scanner;

public class ReplitPractice {
    public static void main(String[] args){

    Scanner scan=new Scanner(System.in);

    int areaCode, localNumber;
    String phoneNumber;

  System.out.println("What is your area code?");
    areaCode=scan.nextInt();
  System.out.println("What is your local number?");
    localNumber=scan.nextInt();
        phoneNumber= "-("+areaCode+")-"+localNumber;

        System.out.println("Calling number is "+phoneNumber);

}



}