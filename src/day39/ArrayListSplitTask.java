package day39;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSplitTask {
    public static void main(String[] args) {
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18") );

        String itemDetails = "iPhone 6s,449,18.71";
        String[] itemSplitArr = itemDetails.split(",");

        String name = itemSplitArr[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble(itemSplitArr[1]);
        System.out.println("price = " + price);

        double monthly = Double.parseDouble(itemSplitArr[2]);
        System.out.println("monthly = " + monthly);


        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price = " + Double.parseDouble(itemDetails.split(",")[1]));
        System.out.println("item monthly = " + Double.parseDouble(itemDetails.split(",")[2]));

//        System.out.println("item name = " + itemDetails.split(",") [0] );
//        System.out.println("item price = " + itemDetails.split(",") [1] );
//        System.out.println("item monthly = " + itemDetails.split(",") [2] );

        //         * Task 1 : print only items name
        // This is for each version
        for (String eachProduct : productLst) {
            // we get each product , then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);

        }
        // This is for loop version
        for (int i = 0; i < productLst.size(); i++) {
            // we get each product by using get method of ArrayList in for loop
            // then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }


//         * Task 2 : print all the prices more than 500
        System.out.println("Task 2 : print all the prices more than 500");
        for (String eachProduct : productLst) {

            double price1 = Double.parseDouble(eachProduct.split(",")[1]);

            if (price1 > 500) {
                System.out.println("price1 = " + price1);
            }

        }
//         * Task 3 : print average price
        double sum = 0;
        double average = 0;

        for (String eachProduct : productLst) {

            double price1 = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price1; // sum += price ;

        }
        average = sum / productLst.size();

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);


//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        System.out.println("Task 4 : print all the items name that has less than 20$ monthly payment");
        for (String eachProduct : productLst) {

             name = eachProduct.split(",")[0];
          monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (monthly < 20) {
                System.out.println(name + " " + monthly);
            }

        }

//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        System.out.println("Task 5 : Print the monthly payments of all the iPhone no matter what model.");
        for (String eachProduct : productLst) {

             name = eachProduct.split(",")[0];
            monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }

        }

//         * Task 6 : Print all information about most expensive items.
        System.out.println("Task 6 : Print all information about most expensive items.");

        // above solution will not work
        // because we need the location of max price not the price itself
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;

//         * Task 6 : Print all information about most expensive items.
        for (int i = 0; i < productLst.size(); i++) {

            // this is how we get each price part of items details
            String priceStr = productLst.get(i).split(",")[1];
            // this is how we turn the priceString into double data type
            price = Double.parseDouble(priceStr);
            if (price > maxPrice) {
                maxPrice = price;
                maxPriceIndex = i;
            }
        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("expensive item detail = "
                + productLst.get(maxPriceIndex));

//         * Task 8 : Count the items prices more than average price.
        System.out.println("Task 8 : Count the items prices more than average price.");
        int cnt=0;
        for (String eachProduct:productLst) {
            price=Double.parseDouble(eachProduct.split(",")[1]);
            if (price>average){
    ++cnt;
            }
        }
        System.out.println("cnt = " + cnt);

        System.out.println("Task 9 : Remove all the items has more than average price.");
        for (int i = 0; i <productLst.size() ; i++) {
            price=Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price>average){
                productLst.remove(i);
                --i;
            }
        }
        System.out.println("productLst.size() = " + productLst.size());
        //Create 3 more ArrayList objects to separately store  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        System.out.println("Create 3 more ArrayList objects to separately store  itemNames(String), prices(Double) , monthlyPayments(Double)  : ");
        //         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
//         * Task 9 : Remove all the items with prices more than average price.
        for (int i = 0; i < productLst.size(); i++) {

        price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price > average) {

                productLst.remove(i);
                --i;
            }

        }
        System.out.println("productLst count  after removing = " + productLst.size());
        // You may also store all the items with more than average into another list
        // then use remove all method :  productLst.removeAll( newListHere)

        System.out.println("\n-----------Task 3 ArrayList Objects ----------");
        System.out.println("\n-----------Task Three ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for (String eachProduct : productLst) {
            // store the name part into ItemName list
           name = eachProduct.split(",")[0];
            itemNames.add(name);
            // store the name price into prices list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            // store the name monthlyPart into monthlyParts list
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);

        }

        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);


    }}
