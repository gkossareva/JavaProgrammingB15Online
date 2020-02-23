package day49;

//you are building super-sub relationship, IS-A RELATIONSHIPublic class Burger {
//a clss can only extend 1 class but interface you can extend more than one
public class Burger implements Edible, Juicy{
   // public Burger() {
     //   super();
    //}

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }

    @Override
    public void eat(){
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {

    }
}