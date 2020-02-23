package day21;

public class ClassTask1 {
    public static void main(String[] args) {
        //  // count from 1 to 10
        //        // print only odd numbers
        //repeat this 4 times

        for (int i = 1; i <= 4; i++) {
            for (int x = 1; x <= 10; x++) {
                if (x % 2 != 0) {
                    System.out.print(x + " ");
                }
                System.out.println();//if we dont have it, everything  will be in one line
            }
        }
    }}
//1234  count from 1 to 4
//1234 count from 1 to 4
//1234  count from 1 to 4
//1234  count from 1 to 4

    //1    count from 1 to 1
   //12    count from 1 to 1
   //123   count from 1 to 3
  //1234   count from 1 to 4
  //12345  count from 1 to 4