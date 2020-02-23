package mentoring;

public class Con101 {
    //gets the object of the class ready for use
    //1.initialize instance variables
    //2.call the method

    int number1;
    int number2;

    //CONSTRUCTOR
    //access modifier+ class name (data type +new variable){
    //instance=new variable
    //}
    //THERE are NO VOID NON-VOID BC constractor must be without date type---->
    // we cannot say boolean, char,byte,short


    public Con101(int num1,int num2){
        number1=num1;
        number2=num2;
        displayMenu();
    }
    public void displayMenu(){
        System.out.println("Please select something fromm the menu");
    }
}
