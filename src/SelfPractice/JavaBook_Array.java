package SelfPractice;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBook_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please eneter 7 day temperature ");
        double sum = 0;
       int size=scan.nextInt();
        double[] temp = new double[7];
        for (int index = 0; index < 7; index++) {
          temp[index] = scan.nextDouble();
            sum = sum + temp[index];
            System.out.println("sum = " + sum);
        }
        double average = sum / 7;
        System.out.println("average temperature= " + average);
        System.out.println("The temperatures  are");
        for (int index = 0; index < 7; index++) {
            {
                if (temp[index] < average) {
                    System.out.println("below zero");
                } else if (temp[index] > average) {
                    System.out.println("above zero");
                } else {
                    System.out.println("temp average");
                }
            }
        }
    }}