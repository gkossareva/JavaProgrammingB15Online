package Repl;

import java.util.Scanner;

public class Repl190MethodsUniqueNumArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for(int x=0; x < nums.length; x++) {
            int count = 0;   // find out the number of apperence
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[x]) {
                    count++;   //adds one to to occurence number of 1
                }
            }
            if (count == 1) {   // if the value is uniue, then we print out
                System.out.println(nums[x]);
            }
        }
    }
}

//Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints. 
// Every single unique int should be printed from the new line. 
//
//Example:
//input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
//output:
//2
//9
//34