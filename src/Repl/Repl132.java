package Repl;

import java.util.Scanner;

public class Repl132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        for (int i=0;i<7;i++){
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i]=input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difficulty=input.nextFloat();
        float min=score[0];
        for (int i=0;i<7;i++){
            if (min<score[i]){
                min=score[i];
            }

        }
       System.out.println(min);
        float max=score[0];
        for (int i=0;i<7;i++){
            if (max>score[i]){
                max=score[i];
            }
        }
        System.out.println(max);
        float sum=0;
        for (int i=0;i<7;i++){
            sum=sum+score[i];
        }
        double total=0;
        total=(sum-(min+max))*difficulty*0.6;
        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
