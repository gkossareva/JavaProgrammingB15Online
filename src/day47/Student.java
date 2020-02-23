package day47;

public class Student {


    final int studentID;

//CONSTANT
    //public static final FIELD WITH INITIAL VALUE
    //tHIS type of field name always suggested to make all uppercase
    //to make it clear that this is a public static field that never change
    //other language has specific term call CONSTANT for this
    //IF THE interviewr asks how do I define CONSTANT in java
    //you would say will create public static final field

    public static final String SCHOOL ="Cybertek";

    public Student(int studentID) {
        this.studentID = studentID;

    }
}
