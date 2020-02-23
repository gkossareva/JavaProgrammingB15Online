package day21;

public class NumberStairCase {
    public static void main(String[] args) {
        //1234  count from 1 to 4
        //1234 count from 1 to 4
        //1234  count from 1 to 4
        //1234  count from 1 to 4


  /*      for (int x = 1; x <= 5; x++) {
            System.out.println("x : " + x);
            for (int i = 1; i <= 4; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

        //1    count from 1 to 1
        //12    count from 1 to 1
        //123   count from 1 to 3
        //1234   count from 1 to 4
        //12345  count from 1 to 4
        for (int x=10; x>=1; x--){
          //  System.out.println("x : " + x);
            for (int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}