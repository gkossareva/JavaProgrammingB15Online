package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl136Arrayshas55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:
        System.out.println(Arrays.toString(nums).contains("5, 5"));

    }
}