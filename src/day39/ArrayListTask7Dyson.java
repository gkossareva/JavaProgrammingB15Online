package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask7Dyson {
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
                "Apple Watch,559,21.18"));
//         * Task 6 : Print all information about most expensive item.

        // assume first item price is max price before comparing
//        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]) ;

//        for (String eachProduct : productLst) {
//
//            double price = Double.parseDouble(eachProduct.split(",")[1]);
//            if(price> maxPrice){
//                maxPrice = price ;
//            }
//
//        }
//        System.out.println("maxPrice = " + maxPrice);
        System.out.println("\n-----------Task 6 ----------with product details");
        // above solution will not work
        // because we need the location of max price not the price itself
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;
        String maxPriceItem = "";

        for (int i = 0; i < productLst.size(); i++) {
            for (String eachProduct : productLst) {

                // this is how we get each price part of items details
                String priceStr = productLst.get(i).split(",")[1];
                // this is how we turn the priceString into double data type
                double price = Double.parseDouble(priceStr);
                price = Double.parseDouble(eachProduct.split(",")[1]);
                if (price > maxPrice) {
                    maxPrice = price;
                    maxPriceIndex = i;
                    maxPriceItem = eachProduct;
                }

            }
            System.out.println("maxPriceIndex = " + maxPriceIndex);
            System.out.println("maxPrice = " + maxPrice);
            System.out.println("expensive item detail = "
                    + productLst.get(maxPriceIndex));
            System.out.println("maxPriceItem = " + maxPriceItem);
            System.out.println("maxPriceItem is at index :  "
                    + productLst.indexOf(maxPriceItem));
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("\n-----------Task 6 ----------with product details");
            // above solution will not work
            // because we need the location of max price not the price itself
//        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
//        int maxPriceIndex = 0;
//
//        for (int i = 0; i < productLst.size(); i++) {
//
//            // this is how we get each price part of items details
//            String priceStr = productLst.get(i).split(",")[1];
//            // this is how we turn the priceString into double data type
//            double price = Double.parseDouble(priceStr);
//            if (price > maxPrice) {
//                maxPrice = price;
//                maxPriceIndex = i;
//            }
//        }
//        System.out.println("maxPriceIndex = " + maxPriceIndex);
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("expensive item detail = "
//                + productLst.get(maxPriceIndex));


            System.out.println("\n-----------Task 7 ----------");
//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
            System.out.println(productLst.contains("Dyson")); // false
            System.out.println(productLst.indexOf("Dyson")); // -1
            //    System.out.println(productLst.startWith("Dyson")); // COMPILER ERROR
            int dysonIndex = 0; // there is only one Dyson
            for (int x = 0; x < productLst.size(); x++) {

                if (productLst.get(x).startsWith("Dyson")) {
                    dysonIndex = x;
                }
            }

            System.out.println("dysonIndex = " + dysonIndex);
            String dysonDetails = productLst.get(dysonIndex);
            String name = dysonDetails.split(",")[0];
            double price = Double.parseDouble(dysonDetails.split(",")[1]);
            double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
            dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

            System.out.println("dysonDetails = " + dysonDetails);
            productLst.set(dysonIndex, dysonDetails);
            System.out.println("productLst = " + productLst);


            System.out.println("\n-----------Task 8 ----------");


    }
}}