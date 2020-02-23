package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        //syntax for creating variable and assigning value
        //dayType variableName=value here
        int num1=10;

        System.out.println("num1 = " + num1);
        //syntax for creating variable to store multiple items
        // and assigning value
        //dayType[] variableName=new dataType [count of item ];
        //this array can hold 4 items, its also known as array size
         int[] score= new int[4];
//assigning value to each endex
         score[0]=95;
         score[1]=70;
         score[2]=88;
         score[3]=100;
         //accesing the elements inside array one by one
        System.out.println(   score[0]);
        System.out.println(   score[1]);
        System.out.println(   score[2]);
        System.out.println(   score[3]);
        //updating the value at certain index
        score[1]=99;
        System.out.println(score[1]);

        //once array is creted with certain size ,we CANNOT CHANGE THE SIZE
        //When you create new array object, it will get a default value in each element

        int[] numbers=new int[3];
        System.out.println( numbers[0]);
        System.out.println( numbers[1]);
        System.out.println( numbers[2]);


        //task
        //create an byte array with size 4
        //and store it into the variable called data
        //assign the value for each index location
        //print out the values at each index
        //update last index value
        //then print it out
    }
}
