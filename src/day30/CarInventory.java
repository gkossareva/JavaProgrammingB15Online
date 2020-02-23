package day30;
import java.util.Arrays;
public class CarInventory {


    public static void main(String[] args) {
        String [] cars= {
                        "Acura-NSX",
                        "Chevrolet-Corvette",
                        "Chevrolet-Cavalier",
                        "BMW-3 Series",
                        "Pontiac-LeMans",
                        "BMW-7 Series",
                        "Oldsmobile-Achieva",
                        "Honda-Civic"};
      //  Create a class called CarInventory with main
// count how many Chevrolet is in this array
// and how many civic you have
        //task1: count chevrolet and civic
        int countChevrolet = 0;
        int countCivic = 0;
        for(String eachCar : cars){
            if(eachCar.toLowerCase().startsWith("chevrolet")){
                countChevrolet++;
            }else if(eachCar.toUpperCase().contains("CIVIC")){
                countCivic++;
            }
        }
        System.out.println("count Chevrolet"+countChevrolet);
        System.out.println("count Civic"+countCivic);


        //Task 2 PRINT ALL LOCATIONS OF CIVIC

        for (int x = 0; x < cars.length; x++) {
         //   if (cars[x].contains("Civic")){
              if (cars[x].equals("Honda-Civic")){
                System.out.println("Civic found at location: "+x);
            }
        }
        // Task 3 : PRINT Make and Model separately in this format
        //Honda-Civic  -->>
        // Car make is Honda and Model is Civic
        // print only Honda brand cars


//        String eachCar = "Honda-Civic" ;
//        String[] eachCarSplitted =  eachCar.split("-");
//
//        System.out.println("Car make is " + eachCarSplitted[0] +
//                            " Car Model is " + eachCarSplitted[1]   );

        // we want to go through each and every car
        // and we don't need index so we used for each loop
        for (String eachCar : cars) {
            // we want to do this action only for one type of car brand
            // so we used start with method to check car brand
            if (eachCar.startsWith("Honda")) {
                // we used split method to separate brand and model
                String[] eachCarSplitted = eachCar.split("-");
                // first part is brand , second part is model
                System.out.println("Car make is " + eachCarSplitted[0] +
                        " Car Model is " + eachCarSplitted[1]);
Arrays.sort(cars);
                System.out.println("cars = " + Arrays.toString(cars));
            }

        }
    }}