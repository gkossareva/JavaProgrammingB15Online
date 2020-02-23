package Repl;
import java.util.Scanner;
public class Repl93 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
//String word1=word.substring(0,3);
//String word2=word.substring(1,4);
       //for (int i = 0; i <=word.length()-1 ; i++) {
     //   if (word.length()>=4){
            if  (word.length()>4 && (word.substring(0,4).equals("java") ||word.substring(1,5).equals("java") )){
                System.out.println(!exists);

     //   }else if (word.length()<=1){
       //     System.out.println(exists);
            }else{
                System.out.println(exists);
    }
}}