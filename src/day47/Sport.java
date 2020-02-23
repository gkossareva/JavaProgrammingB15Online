package day47;

public class Sport  {
//cannot extend final class
    //it can be used as if in sub class Sport
    //just like family tradition it should stay the same in generation to come
    public final void doSomething(){
        System.out.println("doing regular sport");
    }

    public  void doSomethingElse(){
        System.out.println("something else");
    }
}
