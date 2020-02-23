package day14;

public class StringReview {
    public static void main(String[] args) {
        //string methods we know so far:
        /*
        equals: check for equality 2 strings
        equalsIgnoreCase: check for quality without caring abiut the case
        toUpperCase
        toLowerCase
        length(char count)
         */

        String str="Pumpkin";

        System.out.println( str.equals("pumpkin") );

        //contains:
        //it checks wether a string exists in another string
        //and return true or false result
        System.out.println("does it contain Pumpkin");
        System.out.println( str.contains("Pumpkin") );
                               //true
        boolean gotPumpkin=str.contains("Pumpkin");
//shortcut to print variable value in a nice formart soutv+tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        //startsWith    endsWith
        //check wether a string srats with another string
        //check wether a string ends with another string
        //and return true or false

        boolean startedWithI= str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin= str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);

        //Task1
        //passwordValidator
        //minimum 8 char max 16 char
        //it must contain _ or $
        //it must not contain space
        //it must start with Ab


    }
}
