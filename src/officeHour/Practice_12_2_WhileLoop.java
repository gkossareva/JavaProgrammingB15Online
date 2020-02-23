package officeHour;
import java.util.Scanner;
public class Practice_12_2_WhileLoop {
    public static void main(String[] args) {
       // String name="Zehra Aygun";
        System.out.println("Enter your name");
Scanner scan=new Scanner(System.in);
String name=scan.next();

        //getting each character using charAt(index)
        //generate sequential number0___>10

        //is there any chance that while loop does not execute

        int x=0;
       /* while (x<15){
            System.out.println("WOALA");
        }*/

       while (x<name.length()){

           System.out.print("index: "+x+" ");
           System.out.println(name.charAt(x));
           ++x;
       }
   //     System.out.println("The End");
    }
}
