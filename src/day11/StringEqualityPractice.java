package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
//checking for String equality should be always
//done useing equals metghod of the string
//oneString.equals(anotherString)------>true or false
//just comparing 2 String literal directly using equals mehod

        System.out.println("Java".equals("java")  );
        String myStr="Java" ;
        System.out.println(myStr.equals("Java")  );

        String yourStr=new String("Java");
        System.out.println("is my string same as your string?" );
        //how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));

        //create a program to check wether myStr value is Java
        //if yes ---->> correct word!
        //if false---->>Say Java!

        if (myStr.equals("Java")){
            System.out.println("correct word!");
        }else{
            System.out.println("Say Java!");
        }
    }
}
