package day39;
//Create a Car Object template by creating a Car class
//	it  has these attributes
//		year , model , make , color
public class Car {
//attributes

    int year;
    String model;
    String make;
    String color;

    //create a method to print how old is this car
    public void printCarAge(){
        System.out.println("car age: "+(2020-year));
    }

    //to create a method to change the color
    //write bunch of code here to validate
    //user is actually passing correct color
    //for e.g. Red, Blue is valid color
    //ABG, EFG are nt valid
    public void changeColorTo(String newColor){
        color=newColor;

    }

    //instance method are tied to the object
    //it does not have static keyword
    //we need an object when we call them
    public void goForward(){
        System.out.println("Going forward ");
    }


   }