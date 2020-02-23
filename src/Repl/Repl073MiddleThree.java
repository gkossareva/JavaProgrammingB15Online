package Repl;

public class Repl073MiddleThree {
    public static void main(String[] args) {
        //You have a word, do the following:
        //
        //If the word has odd number of characters
        //and has 5 or more characters, print the middle three
        //characters of the word.
        //
        //Otherwise print "invalid".
        //
        //fifteen ==> fte
        //apple ==> ppl
        //hey ==> invalid
        //java ==> invalid
        //whatsup ==> ats
        //$ ==> invalid
        String word="fifteen";
        if (word.length()>=5 && word.length()%2!=0){
           // String middlePart=word.substring(word.length()/2, word.length()/2-1
            System.out.println(word.substring(word.length()/2-1, word.length()/2+2));
        }else{
            System.out.println("invalid");
        }
    }
}
