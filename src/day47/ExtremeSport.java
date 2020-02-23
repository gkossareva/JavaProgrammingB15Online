package day47;

public class ExtremeSport extends Sport {

//    @Override
  //  public void doSomething() {
    //    super.doSomething();
    //}

    //cannot overide
    //but you can do anything else
    //for e.g can overload it
      public void doSomething(int x) {
          System.out.println("doing extreme sport");
        }


    @Override
    //this final keword is
    //blocking sub class to ExtremeSport
    //to override this method
    public void doSomethingElse() {
  //      super.doSomethingElse();
        System.out.println("do smth else in extreme sport");
    }
}
