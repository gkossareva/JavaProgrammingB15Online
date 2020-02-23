package SelfPractice;
import java.util.Scanner;
public class StringTask9 {
    public static void main(String[] args) {
        ////Task 9:
        //        //Ask user to enter a valid URL in below format
        //        //www.blackfriday.com
        //        //Write a program to print first Index of .(dot)
        //        //and last index of .(dot)
        //        //and eventually print the domain
        //        //for example :
        //        //www.nightwatch.com  --->> blackfriday
        Scanner scan=new Scanner (System.in);
        System.out.println("Please, enter a valid URL in below format");
        String validUrl=scan.next();

        System.out.println("First index of .(dot) is " +validUrl.indexOf('.')+" last index of .(dot) is " + validUrl.lastIndexOf('.'));

        String domain=validUrl.substring(validUrl.indexOf('.')+1, validUrl.lastIndexOf('.'));
        System.out.println("domain = " + domain);
    }
}
