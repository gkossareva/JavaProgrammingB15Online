package Repl;

import java.util.Scanner;

public class Repl92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n != 0) {

            long factorial = 1L;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }
    }
}