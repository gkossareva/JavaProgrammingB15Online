package day16;

public class WarmUpTaskReverse {
    public static void main(String[] args) {
        //task 1
        //Given a word with 4 character stored in a  String  varible word
        //create a string variable called word2
        //store the reversed word1 into word2
        //and print out
        //For ex. : word1---->JAVA ------> WORD2 AVAJ
        //OPTIONALLY ask this word from scanner

        String word1="Java";
      String word2="";
   // word2=""+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
   //     word2=word2+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        word2+=word1.charAt(3)+""+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        System.out.println(word2);
        System.out.println("word2 is: "+word1.charAt(3)+word1.charAt(2)
                +word1.charAt(1)+word1.charAt(0));
        //System.out.println(word1.charAt(3)+" "+word1.charAt(2)+" "+word1.charAt(1)+" "+word1.charAt(0));

   // word1.equals(word2);

     //   System.out.println(word1.equals(word2));
    }
}
