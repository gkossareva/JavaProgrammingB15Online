package SelfPractice;
//interface can have abstract static and default methods
public interface AbstrInterfacePractice {

    public abstract void methodA();

}
interface Data{

}

class Test implements AbstrInterfacePractice, Data
{

    @Override
    public void methodA() {

    }
}