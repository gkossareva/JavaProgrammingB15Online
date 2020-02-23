package Repl;

import java.util.Scanner;

public class Repl143MultidArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
int maxValue=0;
        for (int row = 0; row <arr.length ; row++) {
            for (cols = 0; cols <arr[row].length ; cols++) {
if (maxValue<arr[row][cols]){
    maxValue=arr[row][cols];
}
            }
        }


        System.out.println(maxValue);

    }//end main
}