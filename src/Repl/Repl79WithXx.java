package Repl;

public class Repl79WithXx {
    public static void main(String[] args) {
        //Given a string word, if the first or last chars are 'x' or 'X',
        // print the string without those 'x' or 'X' chars,
        // otherwise print the string unchanged.

        String word = "Cybertek";

        int lastCharIndex = word.length() - 1;
       /* if ((word.startsWith("x") || word.startsWith("X"))
                && ((word.endsWith("x") || word.endsWith("X")))) {
            System.out.println(word.substring(1, word.length() - 1));
        } else if (word.startsWith("x") || (word.startsWith("X"))) {
            System.out.println(word.substring(1));
        } else if (word.endsWith("x") || word.endsWith("X")) {
            System.out.println(word.substring(0, word.length() - 1));
        } else {
            System.out.println(word);
        }*/
        if (word.startsWith("x")|| word.startsWith("X") && (word.endsWith("x")|| word.endsWith("X"))){
            System.out.println(word.substring(1, word.length() - 1));
        }else if (word.endsWith("x")|| word.endsWith("X")){
            System.out.println(word.substring(0, word.length() - 1));
        }else if ((word.startsWith("x")|| word.startsWith("X"))  ){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }


        }
    }


//  word = word.toLowerCase();
      /* System.out.println(word.substring(1,lastCharIndex+1));
        System.out.println(word.substring(0,lastCharIndex));
        System.out.println(word.substring(1, lastCharIndex));*/


     /* if (word.charAt(0) == 'x') {
            System.out.println(word.substring(1,word.length()));
      } else if (lastCharIndex == 'x') {
        System.out.println(word.substring(0,lastCharIndex));
        } else if (word.charAt(0) == 'x' && lastCharIndex == 'x') {
            System.out.println(word.substring(1, lastCharIndex+1));
        } else {
            System.out.println(word);*/