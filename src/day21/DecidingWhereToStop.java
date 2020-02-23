package day21;

public class DecidingWhereToStop {
    public static void main(String[] args) {
        //01234567890
        // String abc = "hello world"  ;   x <= charCount-n
        //I want to get 4 characters at a time
        //	WHAT IS MY CONDITION     x <= 11-4 = 7

        String msg="Hello World";
        int charCount=msg.length();

        int n =7;//countOfCharToIterate
        // x<=charCount-n
        for (int x=0; x<=charCount-n; x++){
            System.out.println(msg.substring(x,x+n));
        }
    }
}
