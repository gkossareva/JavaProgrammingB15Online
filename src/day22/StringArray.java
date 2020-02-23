package day22;

public class StringArray {
    public static void main(String[] args) {
        //create to store your hosehold member names
        String members[]= new String[4];
        members[0]="mom";
        members[1]="husband";
        members[2]="daughter";
        members[3]="son";
        System.out.println( members[0]);
        System.out.println( members[1]);
        System.out.println( members[2]);
        System.out.println( members[3]);

        //immutable means you cannot change the internal subject of the object
        //if you have String abc="Hello'
        //if you do abc.toUpperCase----> it will create new string object"HELLO"
        //and it does not change original hello at all

        //not resizable----> specifically for array
        //we cannot change the size of array once we create them with certain size
        //however, we can change the elements inside this array
        //and it means IT IS NOT IMMUTABLE
    }
}
