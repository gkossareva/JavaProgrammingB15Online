package day32;

public class CharacterActions {
    public static void main(String[] args) {
        printAtoZ();

        printZtoA();
        printAlthabetInRange('a','c');
        printAlthabetInRange('Z', 'a');
    }

    public static void printAtoZ(){

        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar +" ");
        }
        System.out.println();
    }

    public static void printZtoA(){

        for (char iChar = 'Z'; iChar >= 'A'; iChar--) {
            System.out.print(iChar +" ");
        }
        System.out.println();
}
public static void printAlthabetInRange(char begining, char ending){
        if (begining<ending){
            System.out.println("We need to increment from "+begining+" till "+ending);
            for (char ichar = begining; ichar <=ending ; ichar++) {
                System.out.print(ichar+" ");
            }
            System.out.println();
        } else if (begining>ending){
            System.out.println("We need to decrement from "+begining+" till "+ending);
            for (char ichar = begining; ichar >=ending ; ichar--) {
                System.out.print(ichar+" ");

            }
            System.out.println();
        }else{
            System.out.println("They are same characters");
        }

}
}
