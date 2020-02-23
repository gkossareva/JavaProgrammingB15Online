package Repl;
//extractNum
//
//description:
//a method that cleans any non number string from a string it gets
//and returns the clean string
//input:
//-s (string)- a string the method gets
//return: string: a string of numbers only
public class Repl209 {
    public static void main(String[] args) {
        System.out.println(extractNum("aa2aa3"));
    }

    public static String extractNum(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result = result + s.charAt(i);
            }
        }
        return result;
    }

    public static String reverseLetters(String word) {
        //TODO
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {

            }

        }
        return word;
    }
}
