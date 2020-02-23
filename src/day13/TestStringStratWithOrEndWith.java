package day13;

public class TestStringStratWithOrEndWith {
    public static void main(String[] args) {
        String name="Muge";

        //check if the String start with another string
//IT IS CASE SENSETIVE
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("Max"));
        //check if a sYTING ENDS with another string

        System.out.println( name.endsWith("ge"));
        System.out.println( name.endsWith("e"));
        System.out.println( name.endsWith("a"));
    }
}
