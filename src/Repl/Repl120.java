package Repl;
import java.util.Arrays;
import java.util.Scanner;
public class Repl120 {
    public static void main(String[] args) {
        //Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
        //
        //Example:
        //words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
        //prints jaaaaavvaaaaaaaaaa
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        String longestWord="";
        int maxCharCount=0;
        for(String scannedWords:words){
            if (scannedWords.length()>longestWord.length()){
                longestWord=scannedWords;
            }
        }
        System.out.println("longestWord = " + longestWord);

    }
}
