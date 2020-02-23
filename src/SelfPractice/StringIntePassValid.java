package SelfPractice;

public class StringIntePassValid {
    public static void main(String[] args) {
       //Write  a method which can identifies given number is even or odd
        //
        //EX:
        //
        //identify(5) ->  "Odd"
        //
        //identify(6) ->  "Even"
        System.out.println(identifyOddEven(21));

    }

    public static String identifyOddEven(int n) {
      if (n%2==0){
          return "Even";
      }else{
          return "Odd";
      }
    }
}
