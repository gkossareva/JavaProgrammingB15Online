package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {
    public static void main(String[] args) {
        String sentence= "I love Java Java Java";
//split has 2 versions: first split by some separator and get whatever the count of item we get from the result
        //second version : accept 2 external data
        //one is the separator another is the limit of your array size
        //so if you have 5 word in a sentence if you split by space and put the limit for 2
        //then you will get an array with  size 2 ----->[first word, the rest of the sentence}
        String [] wordsArray= sentence.split(" ",7);
        System.out.println("wordsArray="+ Arrays.toString((wordsArray)));
        System.out.println("wordsArray size = " + wordsArray.length);
    }
}
