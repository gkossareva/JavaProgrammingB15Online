package day19;

import java.util.Scanner;

public class SpeedUpOrSlowDownScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting and ending speed");

        int start = scan.nextInt();
        int end = scan.nextInt();


        System.out.println("You have started at speed----->");
        if (start<end){
            System.out.println("Increasing the speed");
       //i will increase the speed till i reach ending speed
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");

        }
        }else if (start>end){
            System.out.println("Decreasing the speed");
            //i will dicrease the speed till i reach ending speed
            for (int x=start; x>=end; x--){

            }
        }else{
            System.out.println("No action needed. same speed");
        }


    }
}