package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl137_138ArraysReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String []splitSentence=sentence.split(" ");


        //End your code here. do not modify below statement

       for (int i = splitSentence.length-1; i >=0 ; i--) {
           reversed = reversed+ splitSentence[i];
           if(i != 0){
               reversed += " ";
           }
       }
        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
     /*   String []splitSentence=sentence.split(" ");
     //   System.out.println(Arrays.toString(splitSentence));
        for (int i = splitSentence.length-1; i >=0 ; i--) {
            System.out.println(splitSentence[i]);
        }
    }
}*/
