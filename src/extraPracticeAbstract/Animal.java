package extraPracticeAbstract;

public abstract class Animal {

    public abstract void eat();

    public abstract void sleep();
}

//concrete
class Cat extends Animal {

    @Override
    public void eat(){
        System.out.println("Cats eat Fish");
    }
    @Override
    public void sleep(){
        System.out.println("Cats sleep 14 hours");
    }
}
class KingKong extends Animal{
    @Override
    public void eat(){
        System.out.println("King Kongs eat humans");
    }
    @Override
    public void sleep(){
        System.out.println("King Kongs sleeps 5 hours");
}}
class Test{
    public static void main(String[] args) {
        KingKong k1=new KingKong();
        k1.eat();
        Cat obj= new Cat();
        obj.eat();
    }
}