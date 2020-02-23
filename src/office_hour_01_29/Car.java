package office_hour_01_29;

import java.util.Arrays;
import java.util.List;

public class Car {
    String brand;
    //car has Engine, so we are using Engine as instance variable
    Engine e;
    //i want car object has pessenger names attached to it
   // String [] passangers;
    List<String> passengers;
    public static void main(String[] args) {
        Car c1=new Car();
        //there is 2 way to create String object
        //and we are using new keyword by choice
        c1.brand=new String("Toyota");//"Toyota"
        c1.e=new Engine("V6",270);
     //   c1.passangers =new String[]{"Ziyoda","Aykokul","Mehtap", "Rauf"};
c1.passengers=Arrays.asList("Ziyoda","Aykokul","Mehtap","Rauf");
        System.out.println("c1 = " + c1);

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e.toString() +//"passangers "+ Arrays.toString(passangers)+
                '}';
    }


}
