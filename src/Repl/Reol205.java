package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Reol205 {
    public static void main(String[] args) {


    }

    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] sum = new int[5];
        for (int i = 0; i < 5; i++) {
            sum[i] = ints1[i] + ints2[i];
        }
        return sum;
    }
    //Create a static method that:
    //is called repeatAL
    //returns nothing
    //takes in a single parameter - an ArrayList of Booleans
    public static void repeatAL(ArrayList<Boolean> list){
        list.addAll(list);
    }
    public static int[] do_switch(int[] i)
    {
        int temp=i[0];
        for (int x = 1; x <i.length ; x++) {
            i[x-1]=i[x];
        }
        i[i.length-1]=temp;
return i;
    }
}
