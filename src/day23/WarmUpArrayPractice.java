package day23;

import java.util.Arrays;

public class WarmUpArrayPractice {
    public static void main(String[] args) {
        //create an int array of 7 items
        //assign value
        //1.print out in a reverse order
        //2. store last item in a variable called last item
        //print it out separately
        //3 print the item right in the middle
        //4 optionally find sum, average, max and min

       /* int[] nums = new int[7];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 20;
        nums[4] = 30;
        nums[5] = 35;
        nums[6] = 90;*/

      //  System.out.println(Arrays.toString(nums));

     /*   for (int x = nums.length-1; x>=0 ; x--) {
            System.out.println(nums[x]);*/

            System.out.println("Hello");
            //first way to create an array object
            int []nums=new int[7];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] =5;
        nums[5] = 6;
        nums[6] = 7;
        
        //2nd way to create an array with values already filled
        int[] nums2=new int [] {11,2,34,4,54,6,3};
        
        //3rd way and shortes
        //this must happen in one line, we cannot declare and assign late
        
        int []nums3={11,2,34,4,53,6,3};

        for (int x = nums.length-1; x >=0 ; x--) {
            System.out.println("item= " + nums[x]);
        }
        int arraySize=nums.length;
        int lastItemIndex=arraySize-1;

        int lastItemValue=nums[lastItemIndex];
        System.out.println("lastItemValue = " + lastItemValue);

        int middleItemIndex=arraySize/2;
        System.out.println("middleItemIndex = " + nums[middleItemIndex]);

        int sum=0;
        for (int x = 0; x < arraySize; x++) {

            int currentItem=nums[x];
           // sum=sum+currentItem;
            sum=sum+nums[x];

        }
        System.out.println("sum = " + sum);
        }

    }
