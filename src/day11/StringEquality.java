package day11;

public class StringEquality {
    public static void main(String[] args) {

        String name="Rabia";//string literal
        String name2= new String("Rabia");
        String name3="Rabia";
        System.out.println(name);
        System.out.println(name2);

        System.out.println(name==name2);
        System.out.println(name==name3);

        //the correct way of comparing string to get consistant resut is
        //using one of the String object behavior / method called
        //equals method
        //str1.equals(str2)
    }
}
