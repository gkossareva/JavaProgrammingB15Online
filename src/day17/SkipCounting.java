package day17;

public class SkipCounting {
    public static void main(String[] args) {
        //skip counting by 3 from 0 till 30
        //3 6 9 12 15 18 21 24 27 30

        int counter = 0;

        while (counter < 30) {
            counter += 3;
            System.out.print(counter + " ");
            //counter=counter+3;
            // counter+=3;

        }
            //write a loop to print out even number from 0 to 50
            //write a loop to print out odd number from 0 to 50
            int number = 0;
            while (number >= 50) {
                number = number + 2;
                System.out.print(number + " ");
            }

        }
    }

