package day32;

public class NumberAction2 {
    public static void main(String[] args) {
        numbetComparison(10,9);
        stringRepeater( "Hello,World",5);
        sipCountBy3From0to50();
       // countDownByEvenNumberFrom50to0();
        print1toX(10);
        countDownByEvenNumbersFromXtoY(50,0);
    }

    /*
    create static void method
    numbetComparison
    this method has 2 parameters called num1 and num2
    if num1 is > num2 print num1>num2
    ifnum2 is > num1 print num2>num1
    if num2 equals num2 print num1=num2

    String repeater
    this method has 2 parameters
    String strToRepeat and int count
    repeat printing the string as many times as ,count. number define
     */

    public static void  numbetComparison(int num1,int num2){

        if (num1>num2){
            System.out.println("num1>num2");
        }else if(num2>num1){
            System.out.println("num2>num1");
        }else{
            System.out.println("num1=num2");
        }

    }

    public static void stringRepeater( String strToRepeat,int count) {
        for (int i=0; i<=count;i++){
            System.out.print(strToRepeat);
        }
        System.out.println();
    }
    //Task 3
    //kipCountBy3From0to50
    // *
    // * * create a method that has no parameter
    // * and skip count by 3 from 0 to 50
    // *
    // * countDownByEvenNumberFrom50to0
    // * * create a method that has no parameter
    // * and count Down By Even Number From 50 to 0
    // * for example 50 , 48 , 46 .....0

  public static void sipCountBy3From0to50(){
            for (int i = 0; i <=50 ; i=i+3) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
//task4 * countDownByEvenNumberFrom50to0
// * * create a method that has no parameter
// * and count Down By Even Number From 50 to 0
// * for example 50 , 48 , 46 .....0
   // public static void countDownByEvenNumberFrom50to0(){
   //     for (int i = 50; i >=0; i--) {
    //        if (i%2==0){
      //          System.out.print(i+" ");
        //    }
        //}
        //System.out.println();
    //}
    //instead of counting from 50 to 0
    //now count down even numbers from x to y
    public static void countDownByEvenNumbersFromXtoY(int x, int y){
        for (int i = x; i >=y ; i--) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
//task5
    //print1toX
    // * * create a method that has 1 int parameter called x
    // * print from 1 to that number in one line
    // * print an empty line after the print.

    public static void print1toX(int x){
        for (int i = 1; i <x ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
    }
    }

