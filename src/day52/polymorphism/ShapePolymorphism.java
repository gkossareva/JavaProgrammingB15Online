package day52.polymorphism;

public class ShapePolymorphism {
    public static void main(String[] args) {
//        Circle  s1 = new Circle("penny",5);
        Shape s1 = new Circle("penny", 5);
        printAnyShapeArea(s1);
   //     Shape s2 = new Rectangle("Book", 10, 5);
//        printAnyShapeArea(s2);
        // here we are directly passing the sub class object
        // to a method that have Shape as parameter type
        printAnyShapeArea(new Square("Bob", 6));
      //  drawShape3Times(s2);
        drawShape3Times(s1);
        drawShape3Times(new Square("Bob", 6));
    }
    // Create a static method called drawShape3Times
    // it has Shape as parameter
    // return nothing
    // it will draw the shape 3 times
    public static void drawShape3Times(Shape anyShape) {
        anyShape.draw();
        anyShape.draw();
        anyShape.draw();
    }
    // create a method that accept any Shape and print out the calculated area
    public static void printAnyShapeArea(Shape anyShape) {
//        Shape anyShape = s1;
        anyShape.calculateArea();
        System.out.println(anyShape.name + "'s area is = " + anyShape.area);
    }
}
////ONLY the REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS WITH THAT VARIABLE
////for example, if we create object from Drawable then we can access only .draw() method because
////it is the only method inside the Drawable interface.
////If we create object from Circle class then we can access what ever available in the Circle class
////such as draw(), calculateArea(), radius and the ones from Circle's super class.
//// We are doing up-casting when we apply polymorphism.
// //for instance: when we write Shape s1 = new Circle (...)--> we are up-casting because Shape is a wider data type
// //than Circle, or when we write Object s1 = new Circle(...) --> we are up-casting because Object is more general
// //than Circle. ( just remember how we were able to store int type into double--similar logic)
//// Circle s2 = new Shape("shape");?????????? check out how this work or not work?? ----> ANSWer from Akbar:
// //Shape is not Circle to start with. and Shape is abstract , it would not matter even if it is not.
// //Shape is not A Circle.