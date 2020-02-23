package SelfPractice;

public class PracticeLogicalOperatorTask3 {
    public static void main(String[] args) {
        //Task 3 :
        //        given 3 whole numbers variable num1, num2 , num3 with value already set .
        //        Write a program to
        //        find out the largest number and print the result

        int num1 = 50, num2 = 60, num3 = 30;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }
    }
}