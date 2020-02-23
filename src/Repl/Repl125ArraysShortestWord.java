package Repl;
import java.util.Scanner;
public class Repl125ArraysShortestWord {
    public static void main(String[] args) {
        //Write a program that will print the shortest word in the given array str.
        //
        //input: java, cable, red, vivid, remedy, grace
        //output: red
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};


        int minLength = str[0].length();
        String shortestSring = str[0];
        for (int i = 0; i < str.length; i++) {

            if (minLength > str[i].length()) {
                minLength = str[i].length();
                shortestSring = str[i];
            }
        }

        System.out.println(shortestSring);

    }}