package day51.polymorphim;

public class AnimalShow {

    public static void main(String[] args) {

   //     Dog d1 = new Dog();
     //we are refering Dog object using Animal reference
        Animal a1= new Dog();
       a1.makeNoise();
//we are just reaasigning a1 to new object
        a1=new Horse();
        a1.makeNoise();

        Animal a2=new Horse();
        a2.makeNoise();

        Dog d1=new Dog();
        Animal a3=d1;
a3.makeNoise();
    }
}
