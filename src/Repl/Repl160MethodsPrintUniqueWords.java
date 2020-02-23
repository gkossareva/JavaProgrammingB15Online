package Repl;

import java.util.Scanner;

public class Repl160MethodsPrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        for (int x = 0; x < words.length; x++) {
            int count=0;
            for (int i = 0; i <words.length; i++) {
                if (words[x].equals(words[i])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(words[x]);
            }
        }
        }

    }
