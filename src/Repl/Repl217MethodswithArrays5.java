package Repl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Repl217MethodswithArrays5 {
    public static void main(String[] args) {
//        badP([1,1,1,1],5);

    }

    public static boolean badP(int[] products, int limit) {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (count == 0) {
                count++;
            }
        }
        if (count < limit) {
            return true;
        } else {
            return false;
        }
    }
}