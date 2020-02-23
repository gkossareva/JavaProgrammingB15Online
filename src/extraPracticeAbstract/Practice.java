package extraPracticeAbstract;

abstract class shape{
    public abstract void Area();

}
abstract class T extends shape{
    // public abstract void Area(); inherited
}
class triangle extends shape{

    public void Area(){
        System.out.println("Area of triangle is ....");
    }
}
public class Practice {
}
