package day27;

public class ClassNote {
    public static void main(String[] args) {
        //index                      0                        1
        int[][][] arr3D={{     {1,2,3},{4,5,6}},         {{7,9,9},{10,11,12}}};

        for (int i = 0; i < arr3D.length; i++) {//each index of 2D array
            for (int j = 0; j < arr3D[i].length; j++) {//each index number of 1D array
                for (int k = 0; k <arr3D[i][j].length ; k++) {//each index number of the values
                    System.out.print(arr3D[i][j][k]+" ");//it returns me values

                    //single dimensional array: contains multiple values
                    //int [] a={1,2,3}
                    //index     0 1 2
                    //retrieve :
                    //variableName[indexNum]
                    //ex: arr[2]====>3
                    //Array size is fixed

                    //MultiDimensional Array: an array that can contain arrays N dimensional arrai contains(N-1) dimensional arrays
                    //ex: 2 dimensional arrays:contains 1 demensional arrays
                    // int[][] arr2d={     {1,2,3},{4,5,6}};
                    //length of 2D array is determined by the numbers of 1D array
                    //[index num of 1d array][index  num of elements]
                    //arr2D[0][1]======>2
                    //arr2D[1]======>{4,5,6}

                    /*Arrays util class:
                    Arrays.toString(): converts single dimentional array to String, returns it as String
                    Arrays.deepToString():converts smulti dimentional array to String,returns it as String
                    Arrays.sort(): sorts the single dimensional array in acsending order

                    creating 2darray
                    int[][] arr2D={     {1,2,3},{4,5,6}};
                    int[][] arr2D=new int [] [] {     {1,2,3},{4,5,6}};
                    int[][] arr2D= new int [lengthNumber][];

                    ex; 3d array: contains 2D arrays
                    length of the 3d array is determined by the numbers of 2d array
                    int [][][] arr3D={{     {1,2,3},{4,5,6}},         {{7,8},{9}}};
                    [index num of 2 d array][index num of 1D array ][index num of elements]
                    retrieve:
                    arr3d[1][1][0]======>9
                    arr3d[1]===> 2Darray {{7,8},{9}}
                    arr3d[1][0]==========>1d array {7,8}
                    */

                }
            }

        }
    }
}
