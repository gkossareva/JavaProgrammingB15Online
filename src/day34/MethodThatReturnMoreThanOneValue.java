package day34;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {
    public static void main(String[] args) {
        String sentence="I love Java";
        char[] eachChars=sentence.toCharArray();
        String[] eachWords=sentence.split(" ");
        int [] resultArr=returnBoysVsGirlsResult();
        System.out.println(Arrays.toString(resultArr));
    }
    //create a method that return int array returnboysAndGirls

    public static int [] returnBoysVsGirlsResult(){
        //after fierce competition
        int [] boysGirlsCount={56,52};
        return boysGirlsCount;
    }
}
