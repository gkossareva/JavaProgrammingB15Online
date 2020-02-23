package day47;

public class Garage {

    public static void main(String[] args) {


        //abstract canno be instantiated
        //it means we cannot create object

ElectricCar c1 = new ElectricCar();
c1.start();
c1.goBackward();
c1.goForward();
c1.turn("-");

//create another subclass of Car
        //GasCar
        //add a field called gasLevel
        //implement all the abstract method of Car class

      //  Create GasCar object here
        //call all the method TO TEST
        GasCar c2=new GasCar();
        c2.start();
        c2.goBackward();
        c2.turn("RIGHT");
    }
}
