package extraPracticeOverriding;

public class Circle extends Shape{
    double radius;
    final double PI=3.14;
    double diameter=radius*2;

    public Circle(double radius){
        this.radius=radius;
       this.diameter=radius*2;
    }

    @Override
    protected void Area (){
        double Area =radius*radius*PI;
        System.out.println("Area of the circle is "+Area);
    }
    @Override
    protected void peremiter() {
        double peremiter=PI*diameter;
        System.out.println("  circumference(perimeter) of the circle is "+peremiter);
    }
}
