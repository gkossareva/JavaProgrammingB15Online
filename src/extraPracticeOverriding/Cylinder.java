package extraPracticeOverriding;

public class Cylinder extends Shape{

    double radius;
    double height;
    final double PI =3.14;
    double diameter;


    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.diameter=radius*2;
    }
    @Override
    protected void Area(){
double Area =(2*PI*radius*radius)+(height*2*PI*radius);
        System.out.println("Area of the cylinder "+Area);
    }
    @Override
    protected void peremiter(){
        double peremiter=2*(PI*diameter+height);
        System.out.println("Perimeter of the cylinder is "+peremiter);
    }
    @Override
    protected void capacity(){
        double capacity =(3.14*radius*radius*height);
        System.out.println("Capacity of the cylinder "+capacity);
    }
}
