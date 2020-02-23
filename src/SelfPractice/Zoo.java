package SelfPractice;

class Animal{
    public void talk(){
        System.out.println("Animal is talking");
    }
}
class Tiger extends Animal{
    public void hunt(){
        System.out.println("Tiger is hunting");

    }
    @Override
    public void talk(){
        System.out.println("Tiger is talking ---->RROAR");
    }
}
class Octopus extends Animal {
    public void swim() {
        System.out.println("Octopus is swimming");
    }
    @Override
    public void talk(){
        System.out.println("Octopus is talking----->gologol");
    }
}

public class Zoo {
    public static void main(String[] args) {
       Tiger tigerObj1=new Tiger();
        Tiger [] Tigers={ tigerObj1,   new Tiger() };
    //reference type
        Octopus octopusObj2=new Octopus();
        Octopus []octopus={ octopusObj2, new Octopus()};

        Animal             animal1=       new Tiger();
        //reference type    referenceName   object

        //REQUIRMENT ISA RELATIONSHIP

        //Is A relation is inhereted relationship between classes  e.g. class Dog extends Animal bc dog is animal
        //Husky extends Dog bc Husky is a dog

        //HAS A RELATION: INstance the class(obj) is used in another class
        //e.g.class Car{
        //Engine obj = newEngine();
        //}
        Animal animal2= new Octopus();
    }
}
