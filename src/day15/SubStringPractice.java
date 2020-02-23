package day15;

public class SubStringPractice {
    public static void main(String[] args) {
//getting the part of the String out of another String
//                    0123456789012345
        String movie="Lord Of The Ring";
        //sub string will return part of another string
        //starting from begining index until right before ending index
String wordOf=movie.substring(5,7);
        System.out.println("word of "+ wordOf);
        // i want to get the word of the String "of" from this movie

        String wordThe= movie.substring(8,11);
        System.out.println("wordThe "+wordThe);

        //get the second word till last word!
        //              0123456789012345
        //String movie="Lord Of The Ring"
 //       int startingPoint= movie.indexOf(" ")+1;
 //       int endingPoint=movie.length();
      //  assume we already know the location of starting point of second word
        //and the ending of the sentence
        String secondWordTillLast=movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);
        
        String wordLordOf=movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);

        //if you want to start from somewhere and just get the rest of the string
        //YOU KNOW THE INDEX ALREADY
        //above method will work , however there is even better method
        //it will just start from that location and get till the end
        String secondToLast=movie.substring(5);
      //  System.out.println("second word till last: "+movie.substring(startingPoint,endingPoint));

        //with this in mind
        //reverse lord of the ring---->ring of the lord
        System.out.println(movie.substring(12 )+" " +movie.substring(5,7)+" "+ movie.substring(8,11)+" "+movie.substring(0,4));
        String wordRing=movie.substring(12);
         String wordOfThe=movie.substring(4,12);
              String wordLord=movie.substring(0,4);
        System.out.println(wordRing+wordOfThe+wordLord);
        //
        //--------------------
        //String lord = movie.substring(0,4);
        //        System.out.println("lord = " + lord);
        //        String ring = movie.substring(12,16);
        //        String ofthe = movie.substring(5,11);
        //        System.out.println("ofthe = " + ofthe);
        //        System.out.println("ring = " + ring);
        //        System.out.println(ring+" "+ofthe+" "+lord);
        //
        //turn lord of the ring --->ring of the java lord
        System.out.println(wordRing+wordOfThe+"Java "+wordLord);
    }
}
