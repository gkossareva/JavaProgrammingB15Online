package day25;

import java.util.Arrays;

public class FindLongestWord {
    public static void main(String[] args) {
        String sentence="We are trying to find the longest word";
        String [] allWords=sentence.split(" ");
        System.out.println("Arrays.toString(allWords) = " + Arrays.toString(allWords));

        String longestWord="";
        int maxCharCount=0;
        // first create a string variable longestWord to store my result
        // also create maxCharCount variable to store my longest char count
        // i want to go thru each and every word in string array
        // and check wether the length of current word is more than longestWord
        //if its i will assign the longest word value to current word im looking at

        for(String currentWord:allWords){
            if (currentWord.length()>longestWord.length()){
                longestWord=currentWord;
            }
        }
        System.out.println("longestWord = " + longestWord);


    }
}
