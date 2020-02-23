package Repl;

import java.util.*;

public class Repl159MethodPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }
//[2, 5, 5, 6, 3, 6, 9, 34, 3]
    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for(int j=0; j < nums.length; j++) {
            int count = 0;   // find out the number of apperence
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[j]) {
                    count++;   //adds one to to occurence number of 1
                }
            }
            if (count == 1) {   // if the value is uniue, then we print out
                System.out.println(nums[j]);
            }
        }

    }
}