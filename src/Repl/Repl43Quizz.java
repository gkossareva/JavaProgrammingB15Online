package Repl;
import java.util.*;
public class Repl43Quizz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();
        if( a.startsWith("a")) {
            System.out.println("a is wrong");
        } else if ( a.startsWith("b") ) {
            System.out.println("b is correct");
        }else if( a.startsWith("c") ) {
            System.out.println("c is wrong");
        }else{
            System.out.println(a+ " is not a valid answer");
        }
    }
}
