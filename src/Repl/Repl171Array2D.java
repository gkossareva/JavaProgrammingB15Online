package Repl;

import java.util.Arrays;
//Given a 8x8 two-dimensional array of strings named chessboard.
// Initialize values inside an array accordingly to the chess board. So first element in the array,
// chessboard[0][0] should have a value "1a",
// and last element in the array, chessboard[7][7] should have a value "8h".
public class Repl171Array2D {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for (int i = 0; i < 8; i++) {
      int chessNum=i;
            for (int j = 0; j < 'g'; j++) {
                char chessLetter='a';
                chessBoard[i][j] = "" + (chessNum+1) + chessLetter;
                chessLetter++;
            }
        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }

}
