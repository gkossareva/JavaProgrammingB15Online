package office_hour_01_27;
class Test{
    public Test(){
        System.out.println("Hola");
    }
    public Test (int a){
        this();
        System.out.println("Hello");
    }
}
public class Super_Keyword {
    int a =100;
    public void method1(){
        System.out.println(this.a);
       // this.This_Super_Keyword
    }
    public void method2(){
        this.method2();
    }

    public static void main(String[] args) {

        Super_Keyword obj = new Super_Keyword();

    }
}
