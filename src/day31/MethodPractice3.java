package day31;

public class MethodPractice3 {
    //task 2 create a method called countDownFrom20toOne
    //task 3 create a method to print odd numbers from 1-100:printOddNumbers1to100
    //task4 create a method to spell your name:Seda ----->s-e-d-a

    public static void main(String[] args) {

        countDownFrom20();
        System.out.println();
        oddNumbersFrom1To100();
        System.out.println();
        spellYourName();
    }
    public static void countDownFrom20() {
        for (int i = 20; i >0 ; i--) {
            System.out.print(i+" ");
        }
    }
    public static void oddNumbersFrom1To100 () {
        for (int i = 0; i <=100 ; i++) {
            if (i%2!=0) {
                System.out.print(i+" ");

            }

        }
        }
    public static void spellYourName(){
        String myName="Galina";
        for (int i = 0; i <myName.length(); i++) {
            System.out.print(myName.charAt(i) + "-");
        }
    }
}