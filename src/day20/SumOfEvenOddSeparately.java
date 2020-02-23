package day20;

public class SumOfEvenOddSeparately {
    public static void main(String[] args) {
        ////give methe sum of odd number from 10-100

        int sumOfEven=0;
        int sumOfOdd=0;

        for (int i=10; i<=100; i++){
            if (i %2==0){
                sumOfEven=sumOfEven+1;
            }else{
                sumOfOdd=sumOfOdd+1;
            }
        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);
    }

}
