package officeHour;

import java.util.Scanner;
public class Practice_11_20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("What is your age");
        int age=scan.nextInt();
        scan.nextLine();//to capture the enter
//if you need to make the program run without an issue, enter age and name on the same line
        System.out.println("What is your full name");
        String fullName=scan.nextLine();

        System.out.println("Your name is "+fullName+" , your age is "+age);
    }
}
