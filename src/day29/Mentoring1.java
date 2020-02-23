package day29;
import java.util.Arrays;
import java.util.Scanner;
public class Mentoring1 {
    public static void main(String[] args) {
//Write a program that will find out shortest words in the given string str.
// If there are few words that are evenly short, print them all.
// Use split method in order to split str string variable and create an array of strings.
// Print array with Arrays.toString() method. Sort array before printing.
//Split values by comma: split(", ");
//input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//output: [cat, old, ray]
        //DO NOT CHANGE


                Scanner scan = new Scanner(System.in);
                String word1 = scan.next();
                String word2 = scan.next();
                //YOUR CODE HERE
        for (int i = 1; i <=2 ; i++) {
            System.out.print(word1+word2);

        }
    }
}