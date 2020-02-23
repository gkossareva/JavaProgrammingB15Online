package day43;
//Pet
//  attributes
//		type
//		name
//  constructor :
//  		no arg constructor
//  			set the breed to "unknown"
//  			set the name to "noname"
//  		2 args constructor
//  			set the name and breed to what the caller passed
// behaviours
// 		getters , setters , toString
// 		speak
// 			accept no parameter
// 			according to the type speak following
// 				cat --> meow
// 				dog --> woof
// 				cow --> mooo
// 				horse --> neinei
//Create another class called PetStore with main method
//	Create 8 Pet objects with initial value
//	Store them into a List<Pet>
//	1, print out all info
//	2, print out only name
//	3, print out only cats
public class Pet {
    private String type;
    private String name;

    public Pet() {
        this.type = "unknown";
        this.name = "no-name";
    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void speak() {

        //switch (type.toLowerCase()  ){
        switch (type) {

            case "cat":
                System.out.println("MEOW");
                break;
            case "dog":
                System.out.println("WOOF");
                break;
            case "horse":
                System.out.println("NEIGH");
                break;
            case "cow":
                System.out.println("MOOO");
                break;
            default:
                System.out.println("UNKNOWN ANIMAL!");

        }

    }

    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
public static void showGeneralPetInfo(){
    System.out.println("Pets are friends of humans");
}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
