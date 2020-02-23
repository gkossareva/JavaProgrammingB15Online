package day29;

import java.util.Arrays;

public class FillingupArrayValue {
    public static void main(String[] args) {
        //create an array with size 100 and fill it up as below

        int[] numbers=new int [100];
        System.out.println("before filling up \n"+Arrays.toString(numbers));

      /*  numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        .....
       numbers[99]=100;
      */

        for (int x = 0; x < numbers.length; x++) {
            numbers[x]=x+1;
        }
        System.out.println("After filling up \n"+Arrays.toString(numbers));

        //create an int array with size 100 and fill it up as below
        //fill up this array with number from 0 to 100

        numbers[0]=1;
        numbers[1]=2;//1*2
        numbers[2]=4;//2*2
        numbers[3]=6;//3*2
        numbers[4]=8;//4*2
     //   .....
        numbers[99]=198; //99*2

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=1*2;

        }
        //numbers[x]=x*2
        System.out.println("After filling up \n"+Arrays.toString(numbers));
//Create an array with size 300 and fill it up with I Love Java
       String [] strArr = new String[30];
        strArr[0]="I love Java";
        strArr[1]="I love Java";
        strArr[2]="I love Java";

        for (int i = 0; i <strArr.length ; i++) {
            strArr[i]=(i+1)+". I love Java";

        }
        System.out.print("strArr " + Arrays.toString(strArr));
        System.out.println("==========");
        String str = new String("ABC");
        String []strArr2=new String[5];
        strArr2[0]="ilove Java";
        strArr2[1]="ilove Java";
        strArr2[2]="ilove Java";
        strArr2[3]="ilove Java";
        strArr2[4]="ilove Java";

        System.out.println("Arrays.toString(strArr2) = " + Arrays.toString(strArr2));

    }
}
