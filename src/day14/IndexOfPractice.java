package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        //indexof---->
        //find out index of another String inside This String
                  // 012345678
        String name="Game of Java";//length is 12, last char index is 11
        //find out the location of Java
        System.out.println("Find out the location of Java");
        System.out.println(name.indexOf("Java"));

        //find out the location of letter 0
        System.out.println("Find out the location of o");
        System.out.println(name.indexOf("o"));

        //IF THE location is not found we get -number
        System.out.println("Find out the location of O");
        System.out.println(name.indexOf("O"));

        //find out the location of first space
        System.out.println("Find out the location of first space");
        System.out.println(name.indexOf(" "));

    }
}
