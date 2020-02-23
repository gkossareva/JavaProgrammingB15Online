package Repl;
import java.util.Scanner;
import java.util.Arrays;
public class Repl119 {
    public static void main(String[] args) {
        //Given a String variable email, write code using split method to print email id and domain in separate lines.
        //
        //Example:
        //email -> info@cybertekschool.com
        //Print:
        //Email id: info
        //Email domain: cybertekschool.com
        //
        //
        //If email contains no @ character or multiple @ characters then print invalid email:
        //
        //email -> hello-gmail.com
        //print:
        //invalid email
        //
        //email -> my@fancy@email.com
        //print:
        //invalid email

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        int emailLength=email.length();
        int count=0;
        for (int i = 0; i <emailLength ; i++) {
            String eachCharacter=email.substring(i,i+1);
            if (eachCharacter.equals("@")){
                count++;
            }
        }
 if (count==0|| count>1){
            System.out.println("invalid email");
        }else{
            System.out.println("Email id: "+email.substring(0,email.indexOf("@")));
            System.out.println("Email domain: "+email.substring(email.indexOf("@")+1,email.length()));
        }
    }
}
