package Repl;

import java.util.Scanner;

public class Repl94ShopingList {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String shoppingListReport = "";
    String item = "";
    String countinue = "";
    double price = 0;
    int count = 1;
    double totalProce = 0;

    //output: Enter Item1 and its price:
        //input: Tomatoes
        //input: 5.5
        //output: Add one more item?
        //input: yes

        do{
            System.out.println("Enter Item "+count+" and its price:");
            item=scan.next();
            price=scan.nextDouble();
            System.out.println("Add one more item?");
            countinue= scan.next();
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price +", ";
            totalProce=totalProce+price;
            if (countinue.equalsIgnoreCase("yes")) {
                count++;
                continue;
            }else {
                break;
            }
        }  while (count <= 10);
        String shoppingListReportV2 = "";

        if(shoppingListReport.endsWith(", ")) {

            shoppingListReportV2 = shoppingListReport.substring(0, shoppingListReport.length()-2);
        }

        System.out.println(shoppingListReportV2);
        System.out.println("Total price: "+totalProce);






    }
}