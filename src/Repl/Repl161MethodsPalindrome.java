package Repl;

import java.util.Scanner;

public class Repl161MethodsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
//Complete a method isPalindrome() that will check if number is a palindrome.
// Print your result as a boolean (true or false).
        int remainder, originalInteger;
        int reversedInteger = 0;
        originalInteger = num;
        while (num != 0) {
            remainder = num % 10;
            // reversedInteger = revesedInteger * 10 + remainder;
            reversedInteger = reversedInteger * 10 + remainder;
            num = num / 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(" true");
        else
            System.out.println(" false");
    }

}