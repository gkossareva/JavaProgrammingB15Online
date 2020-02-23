package day39;

public class Garage {
    public static void main(String[] args) {

        // create an object usinng Class of Car class
        //or
        //get an instance

        Car car1= new Car();
car1.make="Toyota";
car1.model="4 Runner";
car1.color="white";
car1.year=2020;
car1.goForward();
car1.printCarAge();
car1.changeColorTo("Blue");
        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.year = " + car1.year);
        System.out.println("car1.color = " + car1.color);
        System.out.println("car1.model = " + car1.model);

        System.out.println(" ============");
        Car car2= new Car();
        car2.make="Hyundai";
        car2.model="SantaFe";
        car2.color="black";
        car2.year=2017;
car2.goForward();
car2.printCarAge();
            car2.changeColorTo("Blue");
        System.out.println("car2.make = " + car2.make);
        System.out.println("car2.year = " + car2.year);
        System.out.println("car2.color = " + car2.color);
        System.out.println("car2.model = " + car2.model);

        car2.year=2020;
        System.out.println("car2.year = " + car2.year);


        // I WANT TO CHANGE THE COLOR OF Hyundai TO THE COLOR OF Toyota
        car2.color = car1.color;  //car2.color = "white" ;
    }
}
