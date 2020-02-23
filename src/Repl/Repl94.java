package Repl;

public class Repl94 {
    public static void main(String[] args) {
        String word = "XCybertek";
       if ((word.startsWith("x")|| word.startsWith("X")) && ((word.endsWith("x")|| word.endsWith("X")))){
            System.out.println(word.substring(1, word.length() - 1));
        }else if (word.startsWith("x")|| word.startsWith("X") ){
            System.out.println(word.substring(1));
        }else if (word.endsWith("x")|| word.endsWith("X")){
            System.out.println(word.substring(0, word.length() - 1));
      }else{
            System.out.println(word);
        }
    }
}
