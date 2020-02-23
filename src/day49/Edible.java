package day49;
//interface is like a contract,once someone signs a contract he/she will provide all the details that she must do


//INTERFACE IS NOT a class!!!!!!!!!!!!!!!!
public interface Edible {

    //IN INTERFACE FIELDS ARE AUTOMATICALLY PUBLIC STATIC FINAL IF NOT DEFINED SO
    //PUBLIC STATIC FINAL FIELD NAMING CONVENTION IS ALL_CAPS!!!
    //YOU CAN HAVE AS MANY CONSTANTS AS YOU WANT
    public static final boolean IS_HUMAN_FOOD=true;

    //IF METHOD WITH NO BODY IS NOT DEFINED PUBLIC ABSTRACT,ITS AUTOMATICALLY PUBLIC ABSTRACT
     void eat();

    public abstract void drink();
//default method was added since java8 to provide default implementation not to break exsisting implemented classes
    //have option to use it as as is
    //or override it according to their own requirments
    //the defalut method only exists in interface
    //default keyword here is NOT AN ACSESS MODIFIER!!1
    public default void digest(){
        System.out.println("you implement code yourself");
    }
}
