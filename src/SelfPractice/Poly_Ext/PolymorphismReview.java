package SelfPractice.Poly_Ext;

class A{
  protected void methodA(){
      System.out.println("method A from class A");
  }
}

class B extends A {
    public void methodB() {
        System.out.println("method B from sub class B");
    }

    @Override

    public void methodA(){
        System.out.println("Overriden method A in B class");
    }
}
public class PolymorphismReview {
    public static void main(String[] args) {
        A obj=new A();
   //   obj.methodA();
        A obj2=new B();
      obj2.methodA();

      //  obj2.methodA();
        B obj3=new  B();
        obj3.methodB();
        obj3.methodA();
//    obj3.methodA();
 //   obj2.methodA();
//        obj3.methodB();
  // obj2.methodB();
        //C obj4=new C(); CANNOT CREATE OBJ FROM ABSTRACT CLASS
      //  C obj5=new D(){

       // }
  //   E obj6=new D();
    }

    abstract class C{

    }
 class D extends C implements E{

    }
    interface E{

    }
}
