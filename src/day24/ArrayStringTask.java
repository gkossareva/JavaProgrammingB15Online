package day24;

import java.util.Arrays;

public class ArrayStringTask {
    public static void main(String[] args) {
        //create a double array of 3 items:
        //get a string representation out this array and save it as priceString
        //print each and every charcter in this String in this format
        //character at index 11 is: yourCharacterHere
        //character at index 2 is: yourCharacterHere and so on all the way till last

        double [ ] prices = {0.99, 2.00 , 1.25 ,3.97};
        System.out.println(Arrays.toString(prices));
        String priceString=Arrays.toString(prices);
        for (int i = 0; i < priceString.length(); i++) {
            System.out.println("character at index "+i+"is: "+priceString.charAt(i));

        }

    }

}
