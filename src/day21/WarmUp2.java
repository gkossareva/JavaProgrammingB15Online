package day21;

public class WarmUp2 {
    public static void main(String[] args) {

        String myName = "Daria Ozer";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);
// find out index of all the letter a in case insensitives manner
        // i will go thru each and every letter of the String----> for loop
        //---------->eacg character i can use substring (0,1) and so on
        //-------------> going to 0 to last indexv____.fo loop
        //ehile im going thru each and every character
        //i will check weather current character I am looking at
        //equals to a or A
        //if it is i will print the index
        //if not---> just move on
        //perform this acction until i reach last character
        System.out.println("---1char----");

        for (int x = 0; x <= lastCharIndex; x++) {

            String currentCharacter=myName.substring(x, x + 1);

            if (currentCharacter.equalsIgnoreCase("a") ) {
                System.out.println("The index of a or A is "+x);
            }
        }
    }
}