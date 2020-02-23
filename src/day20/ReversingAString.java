package day20;

public class ReversingAString {
    public static void main(String[] args) {

         //given a String variable with value
        //reverse this name and store reversed value into
        //another String variable reversedName
        //           01234567
        String name="Olesya Zakirova";
        String reversedName="";

        int lastCharIndex=name.length()-1;

      /*  System.out.print(name.charAt(7));
        System.out.print(name.charAt(6));
        System.out.print(name.charAt(5));
        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));*/

       // System.out.println();
        for (int x=lastCharIndex; x>=0;x--){

          //  System.out.print(x+ " index: ");
            char curentChar=name.charAt((x));
            //System.out.println(curentChar);
            reversedName=reversedName+curentChar;

            System.out.println( curentChar);
        }
        System.out.println(reversedName+"reversedName");
    }
}
