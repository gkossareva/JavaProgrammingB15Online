package day22;

public class MultiplicationTable {
    public static void main(String[] args) {
        //  System.out.println("1 x 1="+1*1);
        //   System.out.println("1 x 2="+1*2);
        //  System.out.println("1 x 3="+1*13);
        System.out.println("Multiplication table of 2");

        for (int base = 1; base <= 12; base++) {
            System.out.println("2x" + base + " = " + 2 * base);
        }
//yhis loop is for iterating number from 1 to 10 to get multiplication table
        for (int timesTable = 1; timesTable < 10; timesTable++) {
            //i want to know which number i want to get the multipliction table
            System.out.println("Multiplication table of " + timesTable);
            //this loop will generate multiplication table for 1 number
            for (int base = 1; base <= 12; base++) {
                System.out.println(timesTable + "x" + base + " = " + timesTable * base);
            }
        }
    }
}
