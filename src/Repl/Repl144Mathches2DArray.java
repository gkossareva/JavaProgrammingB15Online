package Repl;

import java.util.Scanner;

public class Repl144Mathches2DArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rwos
        int matches = 0;
        for (rows = 0; rows < arr.length; rows++) {
            //your code here
            for (int i = 0; i <arr[rows].length-1 ; i++) {

                    matches++;
            }



           // System.out.print("matches: " + matches);
        }//end main
        System.out.print("matches: " + matches);
    }
}
//3
//3
//2
//2
//1
//1
//3
//3
//7
//8
//8