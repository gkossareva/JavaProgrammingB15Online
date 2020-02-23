package SelfPractice;

public class PracticeLogicalOperatorTask1 {
    public static void main(String[] args) {
       /* Task 1 :
        given 3 whole numbers variable num1, num2 , num3 with value already set .
        If the sum of the numbers are more than 100 print you have won
        if not print sum of 3 numbers are not more than 100*/

       int num1=5,num2=7,num3=10;

       if ((num1+num2+num3)>100){
           System.out.println("You have won!");
       }else{
           System.out.println("sum of 3 numbers are not more than 100");
       }
    }
}
