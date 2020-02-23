package day06;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        System.out.println(5/2);

        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        System.out.println("----modulus.  remainder---");
        //5/2 = 2 and remainder 1
        System.out.println(5%2);

        System.out.println(99%10); //10*9+(remainder9)=99

        System.out.println(100%10);

        //declare a variable called minutes data type int
        //ask user to enter minutes as whole number
        //print the result in x hr y minutes format
        //for example 135 minutes, 2 hours 15 minutes
      //  Scanner blabla=new Scanner (System.in);
        /*int minutes=135;

        int hour=135/60;
        int minsPart=135%60;
        System.out.println("The minutes "+minutes+"is "+"is"+hour+" hours and "+minsPart+" minutes");
        */
        System.out.println("Enter minutes");
        Scanner scan = new Scanner(System.in);
       int minutes=scan.nextInt();
       int hour=minutes/60;
       int minutesRemainder=minutes%hour;
        System.out.println("Hours are "+hour+", the minutes are "+minutesRemainder);

    }
}
