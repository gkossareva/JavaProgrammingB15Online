package day06;

public class CompoundOperator2 {
    public static void main(String[] args) {

        //+=  ,-=, *=, /=, %= are called shorthand operator, compound operation;
        //it can simplify the operation if you have the same variable
        //on both side of the assignment

        int StudentOnline=263;
        StudentOnline+=5;
        System.out.println("5 people joined the class: "+StudentOnline);

        StudentOnline-=3;
        System.out.println("3 people left the class:"+StudentOnline);
        StudentOnline *= 2;
        System.out.println("the student count doubled: " + StudentOnline);
        StudentOnline /= 3;
  System.out.println("the student dropped to 1/3:  " + StudentOnline);

    }
}
