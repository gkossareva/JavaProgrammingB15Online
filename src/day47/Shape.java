package day47;

public abstract class Shape {

    String name;
    int area;

    public Shape(String color) {
        this.name = color;
    }
//add an abstract method called calculateArea
        public abstract void calculateArea();

      //i want to enforce sub class to provide toString method
        public abstract String toString();

 //add two concrete class of Shape
        //Triangle
        //instance field fields

   //implement calculateArea method


        //constructor
        //to set name hight base
        //implement calculateArea method area=hight*base/2


        //Rectangle
 //instance field: width and height
    }