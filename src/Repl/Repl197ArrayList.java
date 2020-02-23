package Repl;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl197ArrayList {
    //  public static void main(String[] args) {
    public static void main(String[] args) {
        ArrayList<String> word1 = new ArrayList<>(Arrays.asList("Erva", "Feyza", "Cabir"));
        ArrayList<String> word2 = new ArrayList<>(Arrays.asList("Mehtap", "Emir"));
        System.out.println(combineAL(word1, word2));
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "hey", "hi", "yo"));

        removeAll(wordList, "hi");
        System.out.println(isError("foo bar"));
        System.out.println(isError("error foo bar"));

    }

    public static void test(ArrayList<String> words) {
        //write code here
        //nums.add(1,100);
        //The result will be (4,100,2,5,6)
        //
        //On the left, given an ArrayList of Strings called words, insert "hey" in the 0th index and then insert "yo" in the 3rd index.
        words.add(0, "hey");
        words.add(3, "yo");

    }

    //Create a static method that:
    //is called combineAL
    //returns an ArrayList
    //takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2
    //
    //This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, then add all the words (in order) from wordList2.  In other words, it is combining all the elements from the two parameters.
//Repl198
    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
        wordList1.addAll(wordList2);
        return wordList1;
    }

    public static void removeAll(ArrayList<String> wordList, String targetWord) {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(targetWord)) {
                wordList.remove(targetWord);
            }
        }
    }

    //task 200 isError method checks if the line of string it gets has the word error at the start of it.
//
//it gets a string and returns a boolean.
//true if it found the word 'error' an the start of the line string
//
//example use:
    public static boolean isError(String line) {
        if (line.startsWith("error")) {
            return true;
        } else {
            return false;
        }
    }
    public static  ArrayList<Integer> appendPosSum (ArrayList<Integer> num){
        ArrayList<Integer> newList = new ArrayList<>();
        int sum = 0;
        for (int i=0; i<num.size(); i++) {
            if (num.get(i)>0) {
                newList.add(num.get(i));
                sum += num.get(i);
            }
        }
        newList.add(sum);
        return newList;
    }
    public static void timesTwo(ArrayList<Integer> nums ){
        for (int i = 0; i <nums.size() ; i++) {
           nums.set(i,nums.get(i)*2);
        }
        }
    public static boolean isPalindrome(String check) {
        for (int i = check.length(); i >=0 ; i--) {
            
        }
        return false;
    }
    public static boolean isAnagram(String word1, String word2) {
        for (int i = 0; i <word1.length() ; i++) {

        }
        return false;
    }
}
    