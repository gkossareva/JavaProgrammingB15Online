package Repl;
import java.util.*;
public class Repl64 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.next();

            /*You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
            *
            * */
       // int countOfLetters = 0;
      /*  if (word.length() % 2 != 0 && word.length() >= 3) {
            System.out.println(word.charAt(word.length() / 2)+word.charAt(word.length() / 2-1));
            for (int i = 1; word.length()>=3; i++) {
            String    countOfLetters=word.substring(0);
                System.out.println(word.substring(0));

//}if (word.length()<3){
                //           System.out.println(word.substring(0));
                //       }else if(word.length()%2==0 && word.length()>=4);
//String partOfWord=word.substring(word.length()/2,-1);
                //      System.out.println("partOfWord = " + word.charAt(word.length()/2-1));

    /*    int countOfLetters=0;
        if (word.length()%2!=0) {
            System.out.println(word.charAt(word.length() / 2));
            for (int i = 1; word.length() >= 3; i++) {
                ++countOfLetters;
                System.out.println(word.substring(0));

            }
        }else if (word.length()%2==0) {
            System.out.println(word.substring(word.length()/2+1));

            for (int i = 1; word.length()>=4; i++) {
                System.out.println(word.substring(0,1));
                ++countOfLetters;
            }*/
     //   String word = "ab";
        int charCount = word.length();

        if (charCount == 1) {
            System.out.println(word + word + word);

        } else if (charCount == 2) {

            System.out.println(word + word);

        } else if (charCount > 2) {
            // if the word character count is more than 2 then i worry about it's even or odd

            if (charCount % 2 == 1) {

                int indexOfMidCharacter = charCount / 2;
                System.out.println(word.charAt(indexOfMidCharacter));

            } else {

                int indexOfFirstHalf = charCount / 2 - 1;
                int indexOfSecondhalf = charCount / 2;

                System.out.println(word.charAt(indexOfFirstHalf) + "" + word.charAt(indexOfSecondhalf));

            }

        }

    }


}
