package SelfPractice;
import java.util.Scanner;
public class StringTask4 {
    public static void main(String[] args) {
        //Task 4:
        //Ask user to enter a word with at least 3 characters
        //print the first character
        //print the last character
        //print the middle character
        //for example : Uighur
        //first character : U
        //last character  : r
        //middle character: g
        //(if the length is even number get the one on the left)
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word with at least 3 characters");
        String word=scan.next();

        System.out.println("The first character: " + word.charAt(0));
        System.out.println("The last character: "+ (word.charAt(word.length()-1)));
        if (word.length()%2==0) {
            System.out.println("The middle character: " + word.charAt(word.length() / 2 -1));
        }else if(word.length()/2!=0){
            System.out.println("The middle character: " + word.charAt(word.length() /2));
        }
    }
}
