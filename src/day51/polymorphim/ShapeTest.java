package day51.polymorphim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {


        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();
//please create Array of Shape to store 5 concrete Shape object
        //and call the draw method on each of them

        //also try to create ArrayList of Shape
        //and store 4 concrete Shape objects
        //and call the draw method on each of them

        //create a different clas
        //and try to use the shape circle, triangle class from day50
        //create list of shape and calculate thteir area

        Shape []allShape={s1,s2,s3, new Triangle(),s2};

        for (  Shape each : allShape){
            each.draw();
        }
        System.out.println("======================");
        for (int i = 0; i <allShape.length ; i++) {
            allShape[i].draw();
        }
        System.out.println("========for each with list==========");
   //quick way to create a List----->
    List<Shape>shapeList=Arrays.asList(s1,s2,s3,s2,s1);
        for (Shape each: shapeList
             ) {
            each.draw();
        }
        System.out.println("============for loop with list");
        for (int i = 0; i <shapeList.size() ; i++) {
            shapeList.get(i).draw();
        }
    }


}