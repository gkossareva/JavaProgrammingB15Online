package day17;
      import java.util.Scanner;
public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
       /* String name = "Cybertek School Java Program";//if you have a complain in life: call 1800-Alexander
        //get each and every character and print them out vertically
        int x = 0;
//in order to print each character of the a string
        //we need to start getting character
        //from index 0 till last index(name.length()-
        while (x < name.length()) { //(x<=name.length()-1;
            System.out.print("index "+x+": ");
            System.out.println(name.charAt(x));
            ++x;
        }            */
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.nextLine();
        int lastCharIndex=name.length()-1;
                while(lastCharIndex>=0) {
                    System.out.println(" index "+lastCharIndex+" : "+name.charAt(lastCharIndex));
                    --lastCharIndex;
                }




    }
}