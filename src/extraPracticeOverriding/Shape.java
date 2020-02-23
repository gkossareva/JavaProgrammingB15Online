package extraPracticeOverriding;

public class Shape {

    protected void Area(){
        System.out.println("Area is 0");
    }

    protected void peremiter(){
        System.out.println("perimeter is 0");
    }
    protected void capacity(){
        System.out.println("volume is 0");
    }


    public static void main(String[] args) {


        Rectangle rectangle1=new Rectangle(20,10);
        //rectangle1.width=10;
        //rectangle1.length=20;
        rectangle1.Area();
        Rectangle rectangle2=new Rectangle(40,30);
        rectangle2.Area();
        rectangle2.peremiter();
        rectangle2.capacity();//will be 0, bc no volume for this shape

        Square square1=new Square(10);
        square1.Area();//100
        square1.peremiter();
        rectangle1.capacity();//will be 0, bc no volume for this shape

        Circle circle1=new Circle(5);
        circle1.Area();
        circle1.peremiter();

        Cylinder cylinder1=new Cylinder(2,5);
        cylinder1.Area();
        cylinder1.peremiter();
        cylinder1.capacity();


    }


}
