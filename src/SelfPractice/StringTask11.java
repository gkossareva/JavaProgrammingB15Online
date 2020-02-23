package SelfPractice;

import java.util.Scanner;

public class StringTask11 {
    public static void main(String[] args) {
        //Task 11:
        //Ask user to enter sentence with more than 1 word
        //For example I love Java
        //write a program to
        //print first word and last word
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter sentence with more than 1 word");
        String sentence=scan.nextLine();

        String firstWord=sentence.substring(sentence.indexOf(' ')+1,sentence.lastIndexOf(' '));
        String secondWord=sentence.substring(sentence.lastIndexOf(' '));

        System.out.println("first word is "+ firstWord);
        System.out.println("second word is "+secondWord);
    }
}
