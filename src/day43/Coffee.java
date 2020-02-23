package day43;

public class Coffee {
//Class and Object
//Class is a template for Object
//it can define what kind of attribute and behaviour an object should have
//attrinute : -->> instance variables | fields
//behaviour : -->> instance methods
//Object is the actual thing created out of this template
//and any object created out of same template will have the attribute and behaviours defined in the template
//Protecting the data|attribute of the object
//we can encapsulate the instance field by making it private and provide public getters and setters
//we have 4 access modifier :
//	public , protected , default , private
//(IGNORE protected for now until inheritance topic comes in )
//public -->> accessible anywhere
//default -->> no access modifer
//		--> only within the package , also known as package private
//private -->> only accessible within the same class
//outside of the class when we create object we can give a object any name we want , like p1, p2  or any other name
//if we want to refer the object in the template itself , we can use the keyword -->> this --> the current object we are working on
//so outside the template it would look like  :
//	Person p1 = new Person() ;
//	p1.age = 18 ;
//	p1.eat() ;
//inside your template it would look like  :
//	this.age -->> to point to the instance field age
//	this.name -->> to point to the instance field name
//	this.eat();  // optional , usually it will just work without
//public class Person{
//	private int age ;
//	private String name;
//	public int getAge(){
//		return age ; // return this.age;
//	}
//	public void setAge(int newAge){
//		// YOU HAVE OPTION HERE TO ADD BUNCH OF VALIDATION OR COED
//		// TO MAKE SURE WE DONT HAVE INVALID AGE HERE
//		age = newAge ;
//	}
//	public String getName(){
//		return name; // return this.name;
//	}
//	public void setName(String name){
//		// BUNCH OF VALIADITON I CAN USE HERE ....
//		this.name = name ;
//	}
//	public void eat(){
//		print(name + "eating") ;
//	}
//}
//Computer
//	attributes:  make it private
//		brand, ram (1-128) , price
//	behaviour
//		runProgram
//			--> print brand is running program with the ram  (size)
//		calculate
//			-->> print brand is calculating
//		add getters and setters to all the fields
//		ram can not be less than 1 more than 128
//		price can not be less than 20
//		toString method
//Scanner scan = new Scanner(System.in);
//String str = new String("abc");
//Integer i1 = new Integer("12");
//Integer i2 = new Integer(12);
//Computer c1 = new Computer() ;
//--- Constructor Review ---
//Integer i1 = new Integer(12);
//// how the constructor for Integer might look like
//public Integer(int num){
//	// some code here
//}
//Integer i1 = new Integer("12");
//public Integer(String num){
//	// some code here
//}
//Constructor is a block of code that run when object is being created
//	it has same name as class name
//	and has no return type
//	it can be overloaded
//Most use case of constructor is
//	to provide inititial state (attribute values)
//	for the object while being created
//public Coffee {
//	private String type;
//	private int caffeineLevel
//	private double price;
//	// getters and setters here omitted
//	// no arg constructor
//	public Coffee(){
//		//print("no arg constructor")
//	}
//	// 2 args constructor to set type and caffine level
//	public Coffee(String type, int caffeineLevel){
//		this.type = type;
//		this.caffeineLevel = caffeineLevel ;
//	}
//	// WAKE UP TASK TO CREATE 3 ARGS CONSTRUCTOR
//	// DO NOT LET THE PRICE GO BELOW 0
//	// IF IT's less than 0 make it 1$
//}
    /**
     * A Blueprint for Coffee object
     * With 3 constructors
     * getters and setters
     * Price should never be less than 0
     * No Coffee object with minus price should be created
     * No one should change the price
     * to minus for any existing coffee object
     */
    private String type;
    private int caffeineLevel;
    private double price;

    public Coffee() {
        System.out.println("no arg constructor");

    }

    public Coffee(String type, int caffeineLevel) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        System.out.println("2 args constructor");
    }

    public Coffee(String type, int caffeineLevel, double price) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        // only set the value if the price is valid


       // if (price > 0) {
         //   this.price = price;
        //} else {
          //  this.price = 1;
        //}
    //}
    setPrice(price);
}


    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }
    // we want to block the caller of this method
    // to set invalid price less than 0
    // if invalid we just set it to 1
    // for protection


    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }}

