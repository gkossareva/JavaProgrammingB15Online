package day32;

import java.util.Arrays;

public class ArrayPacticeWithMethod {
    public static void main(String[] args) {
        //this is passing the array object directly into the method
        printArrayItems( new int [] {1,6,5,3,12,3});
        //this is assigning the array object into a variable
        //and then pass it into the method
        int[] scores ={2,5,8,23,4,5,6};
        printArrayItems(scores);
        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores);
        checkScoresAllMoreThan60(scores);
        compare2arraySize(new String[]{"Sezgin", "Senay", "Astrit"}, new String[]{"Araz"});
        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};

        compare2arraySize(names1, names2);

    }

    //printArrayItems
    // create a method that has 1 array int array as a parameter
    //print out each item in this format
    //arrays  has items: ------> all the items here

    public static void printArrayItems( int[] nums){
        System.out.println("arrays have items: "+ Arrays.toString(nums));


    }

    //create the array method printMaxOfIntArray
    //thus method has one int array as parameter
    //and it will print the max number inside the array
    public static void printMaxOfIntArray(int[]num2) {
        int maxNum = num2[0];
        for (int i = 0; i < num2.length ; i++) {
            if(num2[i] > maxNum){
                maxNum = num2[i];
            }
        }
        System.out.println(maxNum);
    }
    public static void printMinOfIntArray(int[]num3) {
        int minNum = num3[0];
        for (int i = 0; i< num3.length ; i++) {
            if(num3[i] < minNum){
                minNum = num3[i];
            }
        }
        System.out.println(minNum);

}

//// printSumOfIntArray
//// this method has one int array as parameter
//// and it will print the sum of all the numbers

    public static void printSumOfIntArray(int[] nums){

            int sum=0;
            for ( int each: nums ){
                sum=sum+each;
            }
        System.out.println("sum = " + sum);


    }
// OPTIONALLY
// checkScoresAllMoreThan60
// this method has one int array as parameter
// and it will check whether each and every numbers are more than 60
// if so print everyone passed
// if not print someone has failed

    public static void checkScoresAllMoreThan60(int[] num){
        int count=0;
        for (int i = 0; i <=num.length ; i++) {
            if (num[i] > 60) {
                count++;
                if (count == num.length) {
                    System.out.println("Everyone passed");
                } else {
                    System.out.println("Someone has failed");
                }
            }


        }
    //compareArraySize
        //create a method thataccepts 2 string



        }
    /**
     * compare2arraySize
     * create a method that accept 2 String array object
     * and compare the item counts inside these 2 arrays
     * if arr1 is more then print array 1 has more item
     * if arr2 is more then print array 2 has more item
     * else print they have same item count
     */
    public static void compare2arraySize(String[] arr1, String[] arr2) {

        if (arr1.length > arr2.length) {
            System.out.println("array 1 has more item ");
        } else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more item ");
        } else {
            System.out.println("they have same item count");
        }

    }}