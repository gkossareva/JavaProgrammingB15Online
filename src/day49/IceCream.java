package day49;
//can a class both extend another class and implement an interface
public class IceCream extends Object implements Edible {
    @Override
    public void eat() {
        System.out.println("eat with the spoon!!!");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted in the cup");
    }
    @Override
    public void digest() {
        System.out.println("Chew harder");
    }
    public static void main(String[] args) {


    IceCream i1= new IceCream();
    i1.eat();
    i1.drink();
        System.out.println(i1.toString());
        //since Object class exists, we can create object out of it
        //Object o1=new Object();
        i1.digest();

}
}
