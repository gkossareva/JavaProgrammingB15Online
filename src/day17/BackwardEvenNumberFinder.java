package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {
        //print all the even numbers backward from 100-0
        //try to use if statement rather than -2
        //100-98-96-94-92....
        int num = 100;



        while (num > 0) {

            if (num % 2 == 0) {
                System.out.println(num+ " is an even number");

            }
            --num;
            }
        }
    }
