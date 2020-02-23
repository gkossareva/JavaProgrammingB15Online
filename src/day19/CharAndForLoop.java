package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        int x = 'A';

        char myChar = 'A';

        //    System.out.println(x);
        System.out.println(myChar);
        //'A'+1---->65+1=66--->'B'(myChar data type is char)
        System.out.println(++myChar);
        //'B'+1---->66+1=67--->'C'(myChar data type is char)
        System.out.println(++myChar);
        //'C'+1---->67+1=68--->'D'(myChar data type is char)
        System.out.println(++myChar);
        //'D'+1---->68+1=69--->'E'(myChar data type is char)
        System.out.println(++myChar);

        System.out.println('A' > 'B');
        System.out.println('Z' > 'B');

        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");

        }
        System.out.println();

        for (char kChar = 'Z'; kChar >= 'A'; kChar--) {
            System.out.print(kChar + " ");
        }
    }
}
//homework
//create an interactive prgram
        //ask user starting character and ending character
// then print everything in between
//it could be starting character is after ending character
//for e.g. user can enter Z A or A K
//Can we ask user character>NOOOO
//Ask user String and pick the  caracter