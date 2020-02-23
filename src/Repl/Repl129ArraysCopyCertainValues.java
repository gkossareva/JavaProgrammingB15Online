package Repl;

import java.util.Arrays;

public class Repl129ArraysCopyCertainValues {
    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
int count=0;
        for (String eachNum : arr) {
if (eachNum.contains("e")){
    count++;
}
        }
        int index=0;
        String[] fewValues = new String [count];
        for (String eachNum: arr) {
            if (eachNum.contains("e")) {
                fewValues[index] = eachNum;
                index++;
            }}
        //YOUR CODE ENDS HERE -----------------------

     return fewValues;
    }



}