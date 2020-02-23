package SelfPractice;

public class StringTask12 {
    public static void main(String[] args) {
        //Task 12:
        //Given a String with at least two characters
        //swamp first character with last character
        //for example
        //    Java --> aavJ , Kawap --> pawaK
        String word= "Java";
        String firstCharacter=word.substring(0,1);
        System.out.println("firstCharacter = " + firstCharacter);
        String lastCharacter=word.substring(word.length()-1);
        System.out.println("lastCharacter = " + lastCharacter);
        String middleCharacters=word.substring(1,word.length()-1);
        System.out.println("middleCharacters = " + middleCharacters);
        System.out.println(lastCharacter+middleCharacters+firstCharacter);
    }
}
