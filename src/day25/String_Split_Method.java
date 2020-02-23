package day25;


import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        
        String sentence="I love java";
        
      String[] allWords= sentence.split(" ");

        System.out.println("Arrays.toString(allWords) = " + Arrays.toString(allWords));


        String sentence2="Everything is awesome!!!";
        //split by letter e

        String [] splitBy_e_Arr=sentence2.split("e");
        System.out.println("Arrays.toString(splitBy_e_Arr) = " + Arrays.toString(splitBy_e_Arr));

        for(String eachPieces: splitBy_e_Arr){
            System.out.println("eachPieces = " + eachPieces);
        }
//split sentence by is and print out your result
        String sentence3="split sentence by is and print out your result";
        String[] splitSentence3= sentence3.split("is");
        System.out.println("Arrays.toString(splitSentence3) = " + Arrays.toString(splitSentence3));

    }
}
