package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl171 {
    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        String letters="abcdefgh";
        for (int rows = 0; rows < 8; rows++) {
            for (int col = 0; col < 8; col++) {
                chessBoard[rows][col]=(rows+1)+""+letters.charAt(col) ;
            }
        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}