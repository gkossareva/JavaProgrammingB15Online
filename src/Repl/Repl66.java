package Repl;

public class Repl66 {
    public static void main(String[] args) {
        //You have 2 words, both of them have 3 characters.
        //If either of them does not have exactly 3 characters, print "cannot merge"
        //Merge their characters one by one and print together like below:
        //
        //aok
        //lol
        //alookl
        //
        //ear
        //pie
        //epaire
        //
        //java
        //wow
        //cannot merge
        //
        //hint:
        //by inserting +""+ (empty string) between chars, you can concatenate char values.

        String word1="Big";
        String word2="Mac";

        if (word1.length()==3 && word2.length()==3){
            //System.out.println(word1.substring(0,1));
            String wordMixed=word1.substring(0,1)+word2.substring(0,1)+word1.substring(1,2)+word2.substring(1,2)+word1.substring(2)+word2.substring(2);
            System.out.println(wordMixed);
        }else{
            System.out.println("cannot merge");
        }
    }
}
