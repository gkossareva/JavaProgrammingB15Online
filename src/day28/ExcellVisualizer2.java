package day28;

import java.util.Arrays;

public class ExcellVisualizer2 {
    public static void main(String[] args) {

        int [][] myExcell={   //this is the begining of the 2d array object
                                 {10,27,88,99 }, //index 0: this is 1st 1D array
                                 {87,100 },      //index 1: this is the 2nd 1d array
                                 {90,45,65}      //index 2:this is 3rd 1D array
                           };//this is the ending of the 2D array object
//what does deepToString method do:
        //it takes an multiD array and turn it into a String with all items
        //THE multiD array object or the multiD array veriable
        //what do I get out of it========> String representation of multiD array object
        System.out.println(Arrays.deepToString(myExcell));

for  (  int [] eachRow : myExcell  ){
    for ( int eachCell   :  eachRow  ){
        System.out.print(eachCell+" ");
    }
    System.out.println();
}

    }
}
