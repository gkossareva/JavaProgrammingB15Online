package Repl;

import java.util.Scanner;

public class Repl103Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for ( i = 0; i< n; i++) {


        for ( i = 1; i <=n ; i++) {
         //   System.out.println("*");
            for ( j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
        }
