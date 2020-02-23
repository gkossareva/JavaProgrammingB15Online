package Repl;
import java.util.Scanner;

public class Repl88CatandDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
//Print true if the string "cat" and "dog" appear the same number of times in the given string word.
       /*
    01234567890123456
    catgggdogcathhdog
    */
        //Print true if the string "cat" and "dog" appear the same number of times in the given string word.
        //Example:
        //input: catdog
        //output: true
        //
        //Example:
        //input: catcat
        //output: false
        //
        //Example:
        //input: cat-cheetah-dog-cat
        //output: false




                if( word.length() >= 3){
                    for( int i = 0 ; i < word.length()-2 ; i++){
                        if ( word.substring(i,i+3).equals("cat"))
                            countOfCats = countOfCats + 1;
                    }


                    for( int j = 0 ; j < word.length()-2 ; j++){
                        if ( word.substring(j,j+3).equals("dog"))
                            countOfDogs = countOfDogs + 1;
                    }}

                if (countOfDogs == countOfCats) {
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }


            }}
