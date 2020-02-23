package SelfPractice;

import java.util.Scanner;

public class StringTask14 {
    public static void main(String[] args) {
        //Task 14:
        //Ask user to enter sentence with any number of words
        //For example I love Java Java Java Java
        //write a program to print last word
        //remove last word from the sentence
        //check weather remaining part still contains last word
        //for example :
        //1, I love Java Java Java Java  -->> Java
        //2, I love Java Java Java
        //3, I love Java Java Java still contains last word
        Scanner scan= new Scanner(System.in);
        System.out.println("Please, enter sentence with any number of words");
        String sentence= scan.nextLine();
        String lastWord=sentence.substring(sentence.lastIndexOf(" ")+1 );
        System.out.println("lastWord = " + lastWord);

        String edittedSentence=sentence.substring(0,sentence.lastIndexOf(" "));
        System.out.println("edittedSentence = " + edittedSentence);

        if (edittedSentence.contains(lastWord)){
            System.out.println("Still contains last word");
        }else{
            System.out.println("Does not contain last word");
        }
    }
}
