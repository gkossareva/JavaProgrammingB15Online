package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl139Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        if (size<=2){
            System.out.println(Arrays.toString(num));
        }else {

     //    for (int i = 0; i <num.length ; i++) {
       //      System.out.println();
            System.out.println("["+num[0]+", " +num[1]+"]");
         }


    }
}