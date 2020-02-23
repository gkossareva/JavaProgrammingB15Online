package day06;
 import java.util.Scanner;
import java.sql.SQLOutput;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber=300;
        int yourFavouriteNumber=myFavoriteNumber;

        System.out.println("My favorite number "+myFavoriteNumber);
        System.out.println("Your favorite number "+yourFavouriteNumber);

        yourFavouriteNumber=100;
        System.out.println("My favorite number "+myFavoriteNumber);
        System.out.println("Your favorite number "+yourFavouriteNumber);


        //create a variable called yourOrder, type String and assign value

        //create another variable called myOrder and assign the value
        //to same value as yourOrder by coping
        //and just print them out


        /*String yourOrder = "Chicken";
        String myOrder = yourOrder;

        System.out.println("My order is " + myOrder+"\n" +"Your order is " + yourOrder);
*/
        Scanner input=new Scanner(System.in);
        System.out.println("What is your order? I want the same");
        String yourOrder = input.next();








    }
}
