package officeHour;


import java.util.Arrays;

public class Practice_12_10 {
    public static void main(String[] args) {


    //               0     1     2
    String[] cars={"bmw","wv","audi"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        //for each loop
        //temporary variable : array name

        for (String carModel: cars){
        System.out.println("I am done assigning the car "+ carModel);
    }

        int [] ages ={23,43,5,7,87};
        System.out.println( ages[2]);
        System.out.println( ages[3]-ages[2]); // result=2

        System.out.println( ages[0]);
        System.out.println( ages[1]);
        System.out.println( ages[2]);
        System.out.println( ages[3]);
        System.out.println( ages[4]);

        for (int ageOfStudent : ages) {
            System.out.println("This student's age is "+ageOfStudent);
            System.out.println("I am done");
        }
        System.out.println(Arrays.toString(ages));
        /*
        int agesOfStudent = 23
        int agesOfStudent = 43
        int agesOfStudent = 5
        int agesOfStudent = 7
        int agesOfStudent = 87
         */

}

}
  /*
        String carModel: cars
               carModel: "bmw"
               carModel:"wv"
               carModel:"audi"
         */