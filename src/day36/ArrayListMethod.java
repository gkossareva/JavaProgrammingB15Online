package day36;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        //create an Array list object of long and assign it to variable

        ArrayList<Long> lst=new ArrayList<>();
//C.R.U.D.
//Create, Read, Update, Delete

        //1. add item
        lst.add(12L);//12L is automatically converted to new Long(12L);because ArrayList only store object
        lst.add(100L);
        lst.add(200L);
        System.out.println("lst="+lst);

        //2.Counting items inside arrayList
        System.out.println("counting items using list.size()="+lst.size());

        //3. getting item inside ArrayList object
        System.out.println("First item is: lst.get(0)= "+lst.get(0));

        //TASK:Get the sum
        // Getting items inside ArrayList object
        System.out.println("First item is : lst.get(0) = " + lst.get(0));
        System.out.println("\nFirst item is : lst.get(0) = " + lst.get(0));
        System.out.println("Second item is : lst.get(1) = " + lst.get(1));
        System.out.println("Third item is : lst.get(2) = " + lst.get(2));
        System.out.println("Fourth item is : lst.get(3) = " + lst.get(3));

        for (int x = 0; x < lst.size(); x++) {

            System.out.println(" item " + lst.get(x));

        }
        // TASK : GET THE SUM OF ABOVE ARRAYLIST ITEMS
        long sum = 0;

        for (int x = 0; x < lst.size(); x++) {

            sum = sum + lst.get(x);

        }
        System.out.println("sum = " + sum);
        // TASK : GET THE MAX OF ABOVE ARRAYLIST ITEMS
        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {

            sum = sum + lst.get(x);
            if (lst.get(x) > max) {
                max = lst.get(x);
            }

        }
        System.out.println("sum = " + sum);

        System.out.println("max = " + max);

    }

    //i

}