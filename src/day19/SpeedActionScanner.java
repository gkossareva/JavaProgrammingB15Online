package day19;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class SpeedActionScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting and ending speed");

        int start = scan.nextInt();
        int end = scan.nextInt();


        System.out.println("You have started at speed----->");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");


        }


    }
}