package day27;

import java.util.Arrays;

public class Multi_Demential_Array {
    public static void main(String[] args) {

      //  2d array: is an array that contains single dementional array
//INDEX OF EACH ELEMENT     0 1 2    0 1 2
        int [] [] arr2D= { {1,2,3}, {3,4,5}};
        //index             0          1


        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[0][1]);
        System.out.println(Arrays.deepToString(arr2D));


    }
}
