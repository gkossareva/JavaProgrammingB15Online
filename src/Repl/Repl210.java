package Repl;

public class Repl210 {
    public static String reverseLetters(String word){
        //TODO
String word1="";
String finalWord="";
        for (int i = word.length()-1; i >=0 ; i--) {
            if(Character.isLetter(word.charAt(i)))
                word1=word1+ word.charAt(i);
        }

        int x=0;
        for (int i = 0; i <word.length() ; i++) {
            if(!Character.isLetterOrDigit(word.charAt(i))){
                finalWord=finalWord+ word.charAt(i);
            }else if(Character.isLetter(word.charAt(i))){
                finalWord=finalWord+ word1.charAt(x);
                x++;
            }
        }
        return finalWord;
    }
    public static void main(String[] args) {
        System.out.println(reverseLetters("4gal7%&ina"));
    }
}