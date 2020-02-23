package office_hour_01_28;

public abstract class Animal implements Zoo {
//1.rule for abstract class is NO OBJECT CREATION
    //defalt constructor
    public Animal(){

    }
    //information

    int age;
    String color;
    String breed;

    //Actions---> methods
    //CONCRETE MWETHOD
    public void eat(){
        System.out.println("The animal is eating");
    }
    public void call(){
        System.out.println("The animal is calling");
    }
    //ABSTRACT METHOD==I want this method to appear in both
    //cat and dog classes, yet thy should have different body and implwmenation
    public abstract void run();
}
