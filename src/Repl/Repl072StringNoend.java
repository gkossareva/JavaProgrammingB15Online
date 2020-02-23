package Repl;
import java.util.Scanner;
public class Repl072StringNoend {
    public static void main(String[] args) {
        //in this exercise you get a string called txt .
        //
        //output txt without its last letter.
        //
        //for example:
        //
        //txt = "foo"
        //
        //output will be:
        //fo
        //
        //hint
        //use substring() and length() togather to solve this.
        //substring will start at 0 and will end at txt length -1
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter your word");
       // String txt="Hello";
        String txt=scan.nextLine();
        
        String enteredText=txt.substring(0,txt.length()-1);
        System.out.println(enteredText);
        
    }
}
