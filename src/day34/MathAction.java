package day34;
import day31.Calculator;

import java.util.Arrays;
public class MathAction {
    public static void main(String[] args) {

        //call your build3DigitNumber(6,14,0);
        //build3DigitNumber is under day34 package
        //and inside PracticeMethodWithNumber
        int result1= PracticeMethodWithNumber.build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        int [] num ={2,5,87};
        System.out.println("Arrays.toString(num) ="+Arrays.toString(num));

        Calculator.calculate('-',10,20);
    }
}
