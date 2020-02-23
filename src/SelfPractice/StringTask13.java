package SelfPractice;

public class StringTask13 {
    public static void main(String[] args) {
        //Task 13:
        //Given a String with 3 characters
        //swamp first character with last character
        //and check whether new String is same as old one
        //if so print Palindrome
        String word="Ava";
        String firstCharacter=word.substring(0,1);
        String lastCharacter=word.substring(word.length()-1);
String middleCharacter= word.substring(1,2);
        String changedWord=lastCharacter+middleCharacter+firstCharacter;

        if (changedWord.equalsIgnoreCase(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("changedWord = " + changedWord);
        }
    }
}
