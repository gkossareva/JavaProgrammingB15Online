package day47;

public class FinalVariablePractice {
    public static void main(String[] args) {
        //declaring and initializing a varriable
        //declaring and assigning initial value
    int x =10;

        // reassigning initial value to the variable
        //changing the origional value of the variable
        //storing/giving new value of the variable
        x=100;

        //declaring and initializing a final veriable
        //declaring and assigning initial value to a final variable
        final int a = 20;
        //reassigning new value to the final variable--ERROR!!!!
        //a=200;

        final Student s1=new Student(101);
        System.out.println(s1.studentID);
        //cannot reassign the value because its final
        //s1=new Student(102);
    //   s1.studentID=200;
        System.out.println(s1.studentID);

        //static way
        System.out.println(Student.SCHOOL);
      //  Student.school="abc";

        System.out.println(Byte.MAX_VALUE);

        //PI in Java
        System.out.println(Math.PI);


        printDoubleNumber(12);
}
//aanywhere we declare a varriable we have option to make it final
// (including method parameter)
    //making method parameter final
    //it will make the method only use the argument user passed without modifying it
public static void printDoubleNumber(final int x){
   // x=x*2;
        System.out.println("x*2 ="+x*2);

    // can not reassign value because it's final
//        Student.school = "abc" ;

    // INTELLIJ AUTOMATICALLY RECOGNIZE CONSTANT (public static final field)
    // it will automatically make it italic (This can not be done by programmer)
    // easy way to distinguish between fields and methods is
    // by looking at () at the end

    System.out.println(Byte.MAX_VALUE);

    // PI in Java
    System.out.println(Math.PI);

  //  printDoubledNumber(12);

    final String name = "Michael";
    // name = "Zehra";  this will not work , can not be reassigned
}
}