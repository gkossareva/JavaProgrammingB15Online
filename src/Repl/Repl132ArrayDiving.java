package Repl;

import java.util.Scanner;

public class Repl132ArrayDiving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();
        }
            System.out.println("Enter difficulty:");
            float difficulty = input.nextFloat();


        // float max=score[1];
//float min,max,sum;
        float min = score[0];
        for (int i = 0; i < 7; i++) {
            if (score[i] < min) {
min=score[i];

             //   System.out.println(min);
            }

        }
     System.out.println(min);
        float max = score[0];
            for (int j = 0; j < 7; j++) {
                if (score[j] > max) {
max=score[j];
            //        System.out.println(max);
                }
            }
System.out.println(max);
                float sum = 0;
        for (int j = 0; j < 7; j++) {
                sum = sum + score[j];

            }

double total=0;
        total=(sum-(min+max))*difficulty*0.6;
//        double total1=sum-(min+max);
  //     total=total1*difficulty*0.6;
     System.out.printf("Total: %.2f", total);
        }
    }