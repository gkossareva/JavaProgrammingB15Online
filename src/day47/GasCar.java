package day47;
//create another subclass of Car
//GasCar
//add a field called gasLevel
//implement all the abstract method of Car class

//  Create GasCar object here
//call all the method TO TEST
//this is called a concrete class
public class GasCar extends Car {

    int gasLevel;
    //implementing an abstract  mehod in sub
    //providing body for the method in sub class
    @Override
    public void start(){
        System.out.println("Starting GasCar");
    }
    @Override
    public void goForward() {
        System.out.println("GasCar is going forward");
    }
    @Override
    public void goBackward(){
        System.out.println("GasCar is going backwards");
    }
    @Override
    public void turn(String direction){
        System.out.println("GasCar is turning to the "+ direction);
}

}