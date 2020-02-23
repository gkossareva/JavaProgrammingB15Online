package Repl;
import java.util.Scanner;
public class Repl108Triangle {
    public static void main(String[] args) {

//Assume that the int variables i and j have been declared, and that n has been declared and initialized.
//Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.

        int i = 1;
        int j = 1;
        String star="";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for ( i=1; i<=n; i++){
            //star=star +"* ";
         star+="*";
            System.out.println(star);
        }
    }
}
