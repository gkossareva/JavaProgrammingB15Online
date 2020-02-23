package Repl;

public class Repl71 {
    public static void main(String[] args) {
        //Write a program that will print out even numbers from 2 to 100 through the comma.

      /*  int number = 0;
        while (number <= 100) {
            number = number + 2;
            System.out.print(number + ", ");*/
        int number=1;

        while (number<=100){
            if (number%2==0){
                System.out.print(number+",");
            }
            ++number;
        }
    }
}

