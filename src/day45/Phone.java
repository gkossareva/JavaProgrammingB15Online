package day45;

public class Phone extends  Electronic{
    //sub class inherit every instance field, static field
    //sub class inherit every visable instance method and static method
    //by visible we mean when you say visible, you mean accessible
    //private is not inherited
    double size;
    double price;


    //bad idea to have main here
    //but we are doing it anyway for less screen to look at

    public static void main(String[] args) {

        Phone p1=new Phone();
        p1.size=12;
        p1.price=399;
        p1.brand="Apple";
        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        //directly accessing the static field of same class in static method
        System.out.println(useElectricity);
//it is accessible public in Electronic class
        p1.showBrabd();

        //static way
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();
    }

    public static class Fruit {
       //always add no arg constructor in super class to avoid unnecessary error
        public Fruit(){
            System.out.println("Fruit constractor message");

        }

        public Fruit(String str){
            System.out.println("One Arg Fruit Constructor");
        }
    }
}
