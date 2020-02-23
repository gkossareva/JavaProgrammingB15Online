package office_hour_01_15;

import day45.Phone;

public class Apple extends Phone.Fruit {
//FIRST LANE OF ANY INSTRUCTOR IS AUTOMATICALLY CALL SUPER() IF WE DONT EVEN CALL IT
//if we dont have any constructor we will get e defoult constructor
    //no arg constructor of super class by inserting super();
    public Apple(){
        //i want ro reuse functuanality
        // already written in super class constractor

        //we can use super()
// or super(arg here)
//to call super class constructor
  //  super();


        //how to call constructor with 1 argument
        super("test");

        //CAN WE USE SUPER() CALL MORE THAN ONCE
        //NOOOOOOOO!!!!!
        System.out.println("Message from appl constructor");
        System.out.println();
    }

    public static void main(String[] args) {

        Apple a1=new Apple();
    }
}
