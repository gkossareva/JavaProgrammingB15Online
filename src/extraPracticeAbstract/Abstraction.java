package extraPracticeAbstract;

public abstract class Abstraction {
    public abstract void startTheCar();
}

class Toyota extends Abstraction{

    @Override
    public void startTheCar(){
        System.out.println("Hit the break");
        System.out.println("Push the start button");
        System.out.println("Release the brake");
    }
    public static void main(String[] args) {
      //  Abstraction obj=new Abstracton();


    }
}
class Tesla extends Abstraction{
    //regular class MUST implement the abstract method from the abstract
    public void startTheCar(){
        System.out.println("voice control");
        System.out.println("Drive");
    }
}
