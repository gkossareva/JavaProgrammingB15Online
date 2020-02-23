package day44;

public class Car extends Vehicle {
  // String make is not inhereted bc
    //it has default access modifier
    //private int year is not inherited!
    int milage;

    public static void main(String[] args) {

        Car c1=new Car();
        c1.milage=39637;
        System.out.println("c1.milage = " + c1.milage);
c1.setYear(2016);
c1.make="Corolla";
        System.out.println("c1.make = " + c1.make);

        System.out.println("c1.getYear() = " + c1.getYear());
    }
    }

