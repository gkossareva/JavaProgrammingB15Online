package day35;

public class CharacterPractice {
    public static void main(String[] args) {
        //
       /* System.out.println("\n-----------CHARACTER-----------------");
        Character charObject = Character.valueOf('a');
        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a') );
        System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
        System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
        System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
        System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
        System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
        System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));*/

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str ="A34B123C4X";
        //get the number out of this String
        //and store it into Interger variable x
String numsInStr="";
        for (int x = 0; x <str.length() ; x++) {

if (Character.isDigit(str.charAt(x))){
    System.out.println("str.CharAt( "+x+")" +str.charAt(x));
    numsInStr+=str.charAt(x);
}
        }
        System.out.println("numsInStr = " + numsInStr);
        Integer num=Integer.valueOf(numsInStr);
        System.out.println("num = " + num);

    }
   }