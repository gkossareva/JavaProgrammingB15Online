package day22;

public class ArraPractice1 {
    public static void main(String[] args) {

        double[] prices= new double[5];
        System.out.println( prices[0]);
        //cannot print out array variable directly
        //to see what is inside
        System.out.println( prices);

        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;
        //what happenes if i go over the range
       //RUN TIME ERROR
        // prices[5]=165.123;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);
    }
}
