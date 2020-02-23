package extraPracticeOverriding;

public class Square extends Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    protected void Area(){
        double Area=side*side;
        System.out.println("Area of the Sqare is "+Area );
    }
    @Override
    protected void peremiter(){
        double peremiter=side*4;
        System.out.println("peremiter of the square is "+peremiter);
    }

}
