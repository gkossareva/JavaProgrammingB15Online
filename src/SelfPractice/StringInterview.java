package SelfPractice;

//Write a return method that can remove the duplicated values from String
//
//Ex:  removeDup("AAABBBCCC")  ==> ABC
public class StringInterview {
    public static void main(String[] args) {
//String str1="abc";
//String str2="cba";
String str="AAABBBCCC";
//String b="cba";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if (!result.contains("" + str.charAt(i)))

                result = result + "" + str.charAt(i);

        }
        System.out.println(result);


        //Write a return  method that can find the unique characters from the String
        //
        //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


    }
}