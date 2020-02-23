package SelfPractice;
import java.util.Scanner;
public class StringTask6 {
    public static void main(String[] args) {
        //Task 6:
        //Ask user to enter full name
        //assuming full name is 2 word
        //Write a program generate email account as below:
        //it starts with first character of first name
        //and whole last name then @NightWatch.com
        //for example :
        //Jon Snow -->> JSnow@NightWatch.com
        Scanner scan=new Scanner(System.in);
        System.out.println("Please, enter your full name");
        String name=scan.nextLine();
        System.out.println("Your email address is "+name.charAt(0)+name.substring(name.indexOf(" ") + 1)+ "@NightWatch.com");
    }
}
