package Repl;
import java.util.*;
public class Repl32 {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds:");
        inputSeconds=scan.nextInt();
        hours = (inputSeconds/60)/60;
        minutes = (inputSeconds/60)%60;
        seconds = inputSeconds%60;
        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
    }
    }
