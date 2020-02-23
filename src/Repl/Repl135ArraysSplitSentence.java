package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl135ArraysSplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] splitSentence = sentence.split(" ");
        for (int i = 0; i <splitSentence.length ; i++) {
            System.out.println(splitSentence[i]);
        }
    }
}
