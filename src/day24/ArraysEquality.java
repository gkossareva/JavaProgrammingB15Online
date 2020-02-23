package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int [] scores1={2,5,6,7,3,34,6};
        int [] scores2={22,45,6,37,3,6,9};
        int [] scores3={6,5,2,7,3,34,6};
        int [] scores4={2,5,6,3,7,6,34};// same numbers but different order
      //  System.out.println(scores1==scores2);
       // System.out.println(scores1==scores3);

        boolean s1s2equals = Arrays.equals(scores1,scores2);
        System.out.println("Does score 1 have the same content as score 2= " + s1s2equals);
        boolean s1s3equals = Arrays.equals(scores1,scores3);
        System.out.println("Does score 1 have the same content as score 3=  " + s1s3equals);
        boolean s3s4equals = Arrays.equals(scores3,scores4);
        System.out.println("Does score 3 have the same content as score 4=  " + s3s4equals);

        System.out.println("Sorting score3 and 4 the compare equality");
        Arrays.sort(scores3);
        Arrays.sort(scores4);

    }
}
