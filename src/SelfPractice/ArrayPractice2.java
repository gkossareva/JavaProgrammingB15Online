package SelfPractice;

import org.w3c.dom.ls.LSOutput;

public class ArrayPractice2 {
    public static void main(String[] args) {
        //• 2, loop through each prices  and print them in one line
        //            2.1 print each prices in even index
        //            2.2 print only prices less that 3 dollars
        //            2.3 print the sum of all the prices and get average
        //            2.4 print only the second half of prices (last 3)
        //            2.5 print the sum of the middle two prices
        //            2.6 print only prices more than average price
        //            2.7 find out max price and print out max price and  index of max price
        //            2.8 find out the minimum price and index of minimum price
        //            2.9 find out second max price and index(challenging)
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float sum = 0.00f;
        float max = prices[0];
        int index = 0;
        float min = prices[0];
        float secondMax = prices[0];
        int count = 0;
        System.out.println("2.1 print each prices in even index");
        for (count = 0; count < prices.length; count++) {
            if (count % 2 == 0) {
                System.out.print(prices[count] + ", ");
            }

        }
        System.out.println(" 2.2 print only prices less that 3 dollars");
        for (count = 0; count < prices.length; count++) {
            if (prices[count] < 3.00f) {
                System.out.print(prices[count] + ", ");
            }
        }
        System.out.println("2.3 print the sum of all the prices and get average");
        for ( count = 0; count < prices.length; count++) {
                   sum=sum+prices[count];
            float average=sum/prices[count];
        }
        System.out.println("sum = " + sum);
        System.out.println(sum/6);

      //  System.out.println("2.4 print only the second half of prices (last 3)");
        //for (count = 0; count < prices.length; count++) {
          //  System.out.println(prices[count].);
        System.out.println(" ");
        }
    }
