package day54;

public class AnimalShow {
    public static void main(String[] args) {
        // Dog IS-A Dog
// Dog IS-A Animal
// Dog IS-A IndoorPet
        //refer a dog obkect as a dog
        //it can do everything a dog can do (including Animal, IndoorPet stuff)
        Dog d1=new Dog();
        d1.play();
        //refer a dog object as an Animal
        //it can do only those things Animal can do
        //only the speak method in this case\

        Animal a1=d1;
        a1.speak();

        Object o1=d1;
        //refer a dog object as an IndoorPet\//it can only play
        IndoorPet p1=d1;
    }
}
