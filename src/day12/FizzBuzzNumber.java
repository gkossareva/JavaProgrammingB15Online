package day12;

public class FizzBuzzNumber {
    public static void main(String[] args) {
        //Given a number
        //if this number can be divided by 5 without remainder lets call it Fizz number
        //if this number can be divided by 3 without remainder lets call it Buzz number
        //if this number can be divided by both 3 and 5 without remainder lets call it FizzBuzz number
        int number=45;

        if (number%3==0 && number%5==0){
            System.out.println("FizzBuzz number");
        }else if (number%5==0){
            System.out.println("Fizz number");
        }else if (number%3==0 ) {
            System.out.println("Buzz number");
        }else{
            System.out.println("Not my number");
        }
    }
}
