package Repl;
import java.util.Scanner;
public class Repl146Method {



    public static void printHollowRect()
    {
        for (int y = 0; y <= 3; y++) {
            if (y == 0 || y == 3) {
                System.out.print("*****\n");
                if (y == 3) {

                    break;
                }
            }


            for (int x = 0; x <= 5; x++) {
                if (x == 0 || x == 5) {
                    System.out.print("*");
                    if (x == 5) {
                        System.out.println();
                    }
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void main(String[] args) {

        printHollowRect();
    }




}