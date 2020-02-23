package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        /**
         * create an Array of Integer and fill it with 1-100
         */

        List<Integer> nums= new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {
          //  System.out.println("i = " + i);
            nums.add(number);
        }
        System.out.println("nums = " + nums);

        //change all the odd number value to 0;
        for (int i = 0; i <nums.size() ; i+=2) {
            System.out.println("Odd values are at index " + i);
            nums.set(i,0);
        }
        System.out.println("nums = "+nums);

        // how to find index of 20
        System.out.println("index of 20 "+ nums.indexOf(20));

        //insert 100 to first index:
        nums.add(0,100);
        System.out.println("nums = " + nums);

        // how to find index of 20
        System.out.println("index of 20 "+ nums.indexOf(20));

       /* List<Integer>list=new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
// insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

        System.out.println("lst2 = " + lst2);*/

    }
}
