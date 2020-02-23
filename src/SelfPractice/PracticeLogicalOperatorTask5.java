package SelfPractice;

public class PracticeLogicalOperatorTask5 {
    public static void main(String[] args) {
        //Task 5 :
        //        given 3 whole numbers variable num1, num2 , num3 with value already set .
        //        Write a program with below logic
        //        add 100 to all the numbers less than 20 ;
        //        print out the value of each variable to test your code.
       int num1 = 10, num2 = 160, num3 = 30;
    if (num1 < 20) {
            System.out.println(num1 + 100);
        }
        if (num1 >= 20) {
            System.out.println(num1);
        }
        if (num2 < 20) {
            System.out.println(num2 + 100);
        }
        if (num2 >= 20) {
            System.out.println(num2);
        }
        if (num3 < 20) {
            System.out.println(num3 + 100);
        }
        if (num3 >= 20) {
            System.out.println(num3);
        /*if (num1 < 20) {
            System.out.println(" if the number is less than 20 ,add 100 -> " + (num1+100));
        }if (num2 < 20) {
            System.out.println(" if the number is less than 20 ,add 100 -> " + (num2+100));
        }if (num3 < 20) {
            System.out.println(" if the number is less than 20 ,add 100 -> " + (num3+100));*/
        }
    }
}