package day28;

import java.util.Arrays;

public class ExcellVisualizer {
    public static void main(String[] args) {
        /*
        Excel Task 2D Array Version:

You have Excel myExcell with 6 rows and 4 columns
and it contains below data:
First store those data in 2 dimensional array
then write a logic to print out in below format.

Below output is expected from your program:

Cell(1,1)= 78    Cell(1,2)= 54    Cell(1,3)= 100    Cell(1,4)= 84
Cell(2,1)= 33    Cell(2,2)= 44    Cell(2,3)= 77    Cell(2,4)= 123
Cell(3,1)= 12    Cell(3,2)= 88    Cell(3,3)= 52    Cell(3,4)= 76
Cell(4,1)= 67    Cell(4,2)= 33    Cell(4,3)= 98    Cell(4,4)= 67
Cell(5,1)= 12    Cell(5,2)= 88    Cell(5,3)= 52    Cell(5,4)= 45
Cell(6,1)= 67    Cell(6,2)= 33    Cell(6,3)= 98    Cell(6,4)= 34
{ {78,54,100,84},{33,44,77,123},{12,88,52,76},{67,33,98,67},{12,88,52,45},{67,33,98,34} };
       */
        int []row1 = new int []{78,54,100,84};
        int []row2 = new int []{33,44,177,123};
        int []row3 = new int []{12,88,52,76};
        int []row4  = new int []{67,33,98,67};
        int []row5  = new int []{12,88,52,45};
        int []row6  = new int []{67,33,98,34};

        //to store this in another array object
    int [][]sheet=new int [][]{row1, row2, row3, row4, row5, row6};
    //                 0 1      0   1  2      0   1
    int [][] myExcell={{10,27 }, {87,99,100 }, {90,45}};
    ////                  0           1          2

        //tell me how to print 100 and 90 from this array
        System.out.println(myExcell.length);
        System.out.println(myExcell[1][2]);
        System.out.println(myExcell[2][0]);

        //how many item in this entire excell sheet
        System.out.println(Arrays.toString(myExcell[0]));////seeing what is inside first 1D array
        System.out.println(myExcell[0].length);//getting the length of first 1 D array
        System.out.println(myExcell[1].length);//getting the length of first 2nd D array
        System.out.println(myExcell[2].length);//getting the length of first 3rd D array
//how can i make above code better by loop and get the item count of each 1d array

        for (int x = 0; x < myExcell.length; x++) {
            System.out.println("item number "+(x+1)+" length "+myExcell[x].length);
        }
    }

}
