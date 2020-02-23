package extraPracticeOverriding;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected void Area(){
        double Area=length*width;
        System.out.println("Area is "+Area);
    }

    @Override
    protected void peremiter(){
double peremiter=(length+width)*2;
        System.out.println("perimeter of ractangle is "+peremiter);

    }
}
