package day27;

import java.util.Arrays;

public class Multi_D_Array_3D {
    public static void main(String[] args) {
        //2D array contains 1 dementional array

        int[][] arr2D={{1,2,3},{4,5,6}};
        //3d array contains 2d array
        //index                      0                        1
        int[][][] arr3D={{     {1,2,3},{4,5,6}},         {{7,9,9},{10,11,12}}};

        //[index num of 2d array] [index num of 1d array] [index num of values]

        //print 9

        System.out.println(arr3D[1][0][2]);

        //print 2
        System.out.println( arr3D[0][0][1]);

        //print {1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0]));

        //print {10,11,12}}
        System.out.println(Arrays.toString(arr3D[1][1]));

        //print {{7,9,9},{10,11,12}}};
        System.out.println(Arrays.deepToString(arr3D[1]));

        //print an entire array
        System.out.println(Arrays.deepToString(arr3D));
    }
}
