package day09;

public class WarmUpTask1 {
    public static void main(String[] args) {
        //task1 if the number is even than say this is an even number
        //if the number is odd than say this is an oddnumber
        //(devided by 2 no remainder---->> even, remainder 1 ---> odd)
        int number=5;
        if (number%2==0) {
            System.out.println("This is an even number");
        } else if (number%2==1) {
            System.out.println("The number is odd");

        }
    }
}
