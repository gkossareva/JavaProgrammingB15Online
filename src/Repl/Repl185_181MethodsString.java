package Repl;


public class Repl185_181MethodsString {
    public static void main(String[] args) {
        biggerS("apple","orange");
        System.out.println(biggerS("apple","orange"));
        System.out.println(removeFirst("aaa"));
        System.out.println(at3("longword","foo"));
       System.out.println(limit("bla bla",3));
        System.out.println(clean ("he said bla bla bla","bla"));
        System.out.println(wordCount("one two three"));
    }

    public static String biggerS(String a, String b) {

            if (a.length()>b.length()){
                return a;
            }
            return b;
        }
        //The method gets a string and returns a string minus the first string.
        //
        //for example:
        //
        //removeFirst("aaa")
        //returns "aa"
    public static String removeFirst(String target) {
String removedWord="";
removedWord=target.substring(1);


        return removedWord;
    }
    public static String at3(String target,String word)
    {
        String at3="";
        String word1="";
        String word3="";
        for (int i = 0; i <target.length() ; i++) {
         word1=target.substring(0,3);
         word3=target.substring(3);
            at3=word1+word+word3;
        }
        //at3=word1+word+word3;

        return at3;
    }
    //at3 gets two strings and returns a string.
    //
    //the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.
    //
    //example use:
    //
    //at3("longword","foo")
    //will return: "lonfoogword"
    //
    //at3("blabla","a")
    //will return: "blaabla"

    public static String limit(String text, int maxLength)
    {
        String output="";
        for (int i = 0; i < text.length(); i++) {
      //  output=output+    text.substring(0,maxLength);
        }
        output=output+    text.substring(0,maxLength);
        return output;
    }
   /* public static String clean (String text ,String badWord) {
        int count=0;
        String  updatedText="";
        for (int i = 0; i <text.length() ; i++) {
            if (text.contains(badWord)){
                count--;
        }
            updatedText=updatedText+text;
//return updatedText;

    }
        return updatedText;
}*/
//Instructions from your teacher:
//This method gets a string and an int, it returns a string.
//
//what it dose is limit the inputted string to a cretin number of characters.
//
//for example:
//
//limit("abcd",2)
//returns "ab"
//
//limit("bla bla",3)
//returns "bla"
//
//hint:
//
//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)
public static String clean (String text ,String badWord) {

    String cleanedSentence = "";
 //   for (int i = 0; i <text.length() ; i++) {
        if (text.contains(badWord)) {
            text.replaceAll(badWord, "");
           cleanedSentence=text.replaceAll(badWord, "");
        }else{

return text;

    }

    return cleanedSentence;

//181. Methods with String 4
    //This method gets a string and returns the word count of that string.
    //
    //example:
    //
    //wordCount("foo bar")
    //returns 2
    //
    //wordCount("one two three")
    //returns 3
    //
    //wordCount("bla")
    //returns 1
    //
    //hint:
    //
    //https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)



    }
    public static int wordCount(String words) {

        String[] arrWords=words.split(" ");


        return arrWords.length;

    }


}


