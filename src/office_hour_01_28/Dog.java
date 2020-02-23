package office_hour_01_28;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("the dog is eating meat");


    }
    @Override
    public void call(){
        System.out.println("the dog is calling woof woof");
    }

    @Override
    public void run() {
        System.out.println("the dog is running fast");
    }

@Override
    public void sleep(){
    System.out.println("the dog is sleeping");
}

}