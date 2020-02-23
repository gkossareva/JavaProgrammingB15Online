package day32;

public class NumberAction {
    public static void main(String[] args) {
       // reversePrintMyOwnName();

       // String name ="Akber";
        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tokun");
        printStringWithDashInBetween("Lisa");

    }
public static void printStringWithDashInBetween(String name){
    for (int i = 0; i <name.length() ; i++) {
        System.out.print(name.charAt(i));
        //if i m not at last index then i print-
        if (i!=name.length()-1){
            System.out.print("-");
        }
    }
    System.out.println();
}
    /*
    reversePrintMyOwnName
* create a method that has no parameter
	and print your name in reversed order
     */

    public static void reversePrintMyOwnName(){

        String name ="Akbar";
        //start from last character and print toward first character
        //
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));

        }
    }
}
