package Repl;

import java.util.Scanner;

public class Repl100Sandwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int breadCount = 0;
       // String bread1="";
        //String bread2="";
        int indexOfBread=str.indexOf("bread");
        int lastIndexOfBread=str.lastIndexOf("bread");

        if(lastIndexOfBread>indexOfBread){
            System.out.println(str.substring( indexOfBread+5, lastIndexOfBread   ));
        }
        else {
            System.out.println("nothing");
        }

    }
}

//   } else {
      //         System.out.println("nothing");

            //  if(str.contains("breadjambread")){
            //    System.out.println("jam");
            //}else{
            //  System.out.println("nothing");
         //   String bread1 = str.substring(i, i + 5);
            // String bread2 = str.substring(str.length() - 5);
         //   if (bread1.contains("bread") && breadCount == 2) {
                //   if (str.substring(0,5).equalsIgnoreCase(str.substring(str.length()-5)) && ){
           //     str = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
             //   System.out.println(str);


//}