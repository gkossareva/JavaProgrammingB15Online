package Repl;

import java.util.*;
public class Repl211 {


        public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel)
        {
            int numberRefuels=0;
            for (int i=0; i<deliveries.size();i++){

                numberRefuels=numberRefuels+deliveries.get(i);
            }
            int stops = (numberRefuels/ max_fuel);
            if (numberRefuels % max_fuel != 0) {
                stops++;
            }
            return stops;

        }


    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}