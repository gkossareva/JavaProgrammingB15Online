package day32;



public class MethodWithReturnIntro {
    public static void main(String[] args) {
        String name=giveMeMyName();
        System.out.println("name = " + name);
        //doubleTheNumber(int);
        int myResult=doubleTheNumber(10);
        System.out.println("myResult = "+myResult);
        System.out.println("result of doubling 100 is "+doubleTheNumber(100));
        System.out.println(add2Nubers(14,16)+5);
    }

    //create a method called add, accept 2 int parameter
    //and return the result as int

    public static int add2Nubers(int num1,int num2){
//int sum=num1+num2; other options
        //return sum;

        return num1+num2;
    }
    //create a method

    //create a static method that double the value of a number
    // it accepts one int parameter and return doubled value of the number

    public static int doubleTheNumber(int num){
        System.out.println("Iam going to double the value of "+num);
        int result=num*2;
        return result;
    }
    //i want to create a static method called giveMeMyName
    //it returns your name as a result
    //it has no parameters

    public static String giveMeMyName(){
       //assume getting my name
        //is multi steps complex operations
        return "My name is Galina";
    }

}
