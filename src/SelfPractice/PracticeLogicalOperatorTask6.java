package SelfPractice;

public class PracticeLogicalOperatorTask6 {
    public static void main(String[] args) {
//Task 6 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
//
//        if multiplication result of num1 and num2 greater than sum of all the numbers
//        print excellent result
// else
//        not the numebrs combination I am looking for
        int num1 = 101, num2 = 160, num3 = 130;
        int sumOfNum=num1+num2+num3;

        if ((num1*num2)>sumOfNum){
            System.out.println("excellent result");
        }else{
            System.out.println(" not the numebrs combination I am looking for");
        }
    }
}
