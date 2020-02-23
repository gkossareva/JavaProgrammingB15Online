package day30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        System.out.println("-----------car with model has only 2 characters--------------");
        //find all the cars with modelhas only 2 characters
        //print them out
        //get the count

     //   for (String eachCars : cars) {
      //      String[] eachCarsSplitted = eachCars.split("-");
      //      if (eachCarsSplitted[1].length() == 2) {

      //      }
      //  }
        String car = "Lexus-IS-F";
        String[] carSplitted = car.split("-",2);
        System.out.println("carSplitted= " + Arrays.toString(carSplitted));
        System.out.println("car = " + car);
        String model = carSplitted[1];
        System.out.println("model=" + model);

    }

}