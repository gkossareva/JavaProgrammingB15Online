package Repl;

import java.util.Scanner;

public class Repl162MethodsFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);

    }

    public static void fib(int num) {
        //WRITE YOUR CODE HERE
        //In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
        // The first two numbers of the Fibonacci series are 0 and 1.
        //You are given a number num, print n-th Fibonacci Number.
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
      /*  if ( num == 0 ){
            System.out.println(firstNum);

        if (num == 1) {
            System.out.println(secondNum);
        }
*/
        for (int i = 2; i <= num; i++) {
            sum = firstNum + secondNum;
            secondNum = firstNum;
            firstNum = sum;

        }
        System.out.println(sum);
    }
}
      /*  int [] fibNum=new int[num];
        fibNum[0] = 0;
        fibNum[1] = 1;
        for (int i = 2; i <=num ; i++) {
            fibNum[i]=fibNum[i-2]-fibNum[i+1];

        }
        System.out.println(fibNum[num]);*/



