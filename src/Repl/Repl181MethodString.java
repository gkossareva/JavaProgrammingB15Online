package Repl;

import java.util.ArrayList;

public class Repl181MethodString {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me")); //java [me]thods
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
        //System.out.println(mergeStrings("wooden", "spoon"));
    }

    public static String coverString(String main, String coverME) {
        if (main.contains(coverME)) {

            main = main.replaceAll(coverME, "[" + coverME + "]");

            return main;
        }else if (!main.contains(coverME)) {
        }
        main = "[" + main + "]";
        return main;


    }
    //uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.
    //
    //Examples:
    //
    //uniqueChars("java") ==> "jav"
    //
    //uniqueChars("mama") ==> "ma"
    //
    //uniqueChars("spoon") ==> "spon"
  public static String uniqueChars(String str) {
        //TODO: write your below
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(""+str.charAt(i))){
                result +=str.charAt(i);
            }

        }
        return result;
    }
//To book  a room first it needs to be available for rent and make sure its available at the date selected:
//
//the room is already booked between 7/1/2018 - 7/8/2018 and not available
//accepting bookings only for year of 2018
//
//example:
//
//simpleRoomBook(false,2,1,2018)
//return false
//
//simpleRoomBook(true,2,1,2018)
//return true
//
//simpleRoomBook(true,7,2,2018)
//return false
//public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
//{


}

