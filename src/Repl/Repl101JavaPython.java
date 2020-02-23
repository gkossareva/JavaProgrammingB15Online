package Repl;

import java.util.Scanner;

public class Repl101JavaPython {
    public static void main(String[] args) {
        //Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
        //Example:
        //input: We study java not python
        //output: true
        //
        //Example:
        //input: What's the difference between java, javascript and python?
        //output: false

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int pythonCount=0;
        int javaCount=0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i).startsWith("java")){
                javaCount++;

                    }else if (sentence.substring(i).startsWith("python")){
                pythonCount++;
            }

            }
        if (pythonCount==javaCount){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
