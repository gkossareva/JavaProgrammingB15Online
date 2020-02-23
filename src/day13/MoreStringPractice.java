package day13;

public class MoreStringPractice {
    public static void main(String[] args) {
//String is imutable-once created it cannot be chanfed
        //method that looks like changing the value
        // actually vreating a new String object
        String name ="Pumpkin";

        System.out.println(name);

      //  name="Cat";
      //  System.out.println(name);

        name.toUpperCase();
        System.out.println(name);
        System.out.println(name.toUpperCase());


        name=name.toUpperCase();
        System.out.println(name);
    }
}
