package SelfPractice;

import java.util.Scanner;

public class StringTask10 {
    public static void main(String[] args) {
        //Task 10:
        //Ask user to enter sentence with 3 words
        //For example I love Java
        //write a program to print second word

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter sentence with 3 words");
        String sentence=scan.nextLine();
        //String beginingOfWord=sentence.indexOf(' ')+1;
        String secondWord=sentence.substring(sentence.indexOf(' ')+1, sentence.lastIndexOf(' '));
        System.out.println("secondWord = " + secondWord);
    }
}
