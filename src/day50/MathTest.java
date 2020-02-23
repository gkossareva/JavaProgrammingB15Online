package day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {
    public static void main(String[] args) {
        AdditionQuestion q1=new AdditionQuestion(10,90);
        System.out.println(q1);
        q1.calculate();
        System.out.println("q1 = " + q1);

        Substraction q2=new Substraction(90,10);
        System.out.println("q2 = " + q2);
        q2.calculate();
        System.out.println("q2 = " + q2);
        q2.calculate();


        Substraction q3=new Substraction(10,90);
        System.out.println("q3 = " + q3);
        q3.calculate();
        System.out.println("q3 = " + q3);
        q3.calculate();

        Multiplication q4=new Multiplication(10,3);
        System.out.println("q4 = " + q4);
        q4.calculate();
        System.out.println("q4 = " + q4);

        Division q5 = new Division(10, 5);
        System.out.println("q5 = " + q5);
        q5.calculate();
        System.out.println("q5 = " + q5);

        Division q6 = new Division(10, 50);
        System.out.println("q6 = " + q6);
        q6.calculate();
        System.out.println("q6 = " + q6);

        Division q7 = new Division(10, 0);
        System.out.println("q7 = " + q7);
        q7.calculate();
        System.out.println("q7 = " + q7);


        List<Question>allTestQuestions= Arrays.asList(q1,q2,q3,q4,q5,q6,q7);
        for (Question eachQ:allTestQuestions ){

            System.out.println("eachQ = " + eachQ);
        }

    }}