package day49;
// Interface can achieve loosely coupling between implementing classes
// for example : When we say flyable
// all the implementing classes like Plane , Insects, Superman ....
// can be all Flyable and has nothing to do with each other
// and almost no knowledge about each other : known as loosely coupling
// This is why it's always preferred in design

public interface Juicy {

    public abstract void melt();
//ANOther type of method Interface can have it
    //static method, it must have a body
    //and its there to provide some utility methods
            //that does not belong to any class
    //STATIC METHODA OF interface ARE NOT INHERETED!!!!!!!!!!!
    //IT MUST HAVE A BODY

    public static void squeeze(){
        System.out.println("static squeezing");
    }


}
