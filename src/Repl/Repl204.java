package Repl;

import java.util.Arrays;

public class Repl204 {
    public static boolean isAnagram(String word1, String word2) {

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        String [] arrWord1= word1.split("");
        String [] arrWord2=word2.split("");
        Arrays.sort(arrWord1);
        Arrays.sort(arrWord2);

        return Arrays.equals(arrWord1,arrWord2);
    }}