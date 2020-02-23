package day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {
long [] myLongs={6L,11L,44L,32L,65L};
        System.out.println("Before swapping "+ Arrays.toString(myLongs));
        swampFirstAndLastValue(myLongs);
        System.out.println("Afterswapping "+ Arrays.toString(myLongs));

        long[] myNums1=new long[5];
        System.out.println( Arrays.toString(myNums1));

        String[] names=new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2=new Long[5];
        System.out.println( Arrays.toString(myNums2));
        //one thing that primitivre variables cannot do
        //we cannot assign it to null
        //any non-primitive variables(reference variable)
        //can assigned to null value
        // to define its not pointing to any object yet
    }

    /**Swamp first and last value of long array
     *
     * @param nums
     */
    public static void swampFirstAndLastValue(long[] nums){
long temp =nums[0];
nums[0]=nums[nums.length-1];//last value
        nums[nums.length-1]=temp;
    }
}
