package Repl;

public class Repl178 {
    public static String mergeStrings(String one, String two) {
String mixedWord="";

        if (one.length() >=two.length()) {

            for (int i = 0; i < two.length(); i++) {
               mixedWord= mixedWord+ "" + one.charAt(i) + two.charAt(i);
            }
           mixedWord=mixedWord+ one.substring(two.length());
        } else {
            for (int i = 0; i < one.length(); i++) {
               mixedWord =mixedWord+ "" + one.charAt(i) + two.charAt(i);
            }
           mixedWord+=two.substring(one.length());
        }
        return mixedWord;
    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("java", "selenium"));
    }}