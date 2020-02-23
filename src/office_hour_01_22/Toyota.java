package office_hour_01_22;

public class Toyota extends Car{

    public void start(){
        System.out.println("push the botton");

    }

    public static void main(String[] args) {
        Toyota car1=new Toyota();
        car1.start();

        Car car2=new Car();
        car2.start();

        Car car3=new Car();
        car3.start();
    }
}
