package day08;
import java.util.Scanner;
public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your current speed?");
        int currentSpeed=scan.nextInt();

        System.out.println("What is speed limit ");
        int speeLimit=scan.nextInt();

        if (currentSpeed >=speeLimit);{
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points fom your licence");
            System.out.println("go to court");
        }
        System.out.println("The End of the Story");
    }
}
