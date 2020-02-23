package day64;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapPtactice {
    public static void main(String[] args) {//KEEPS THE INSERTION ORDER COMPARED TO HASH MAP WHICH DOES NOT
        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        //FOR LIKED HASH MAP NO ORDER
        //groceryPriceMap = {Tomato=1.99, Patato=2.99, Grape=3.99, Banana=1.99, Apple=1.89}
        //FOR HASH MAP KEEPS THE ORDER
//groceryPriceMap = {Apple=1.89, Grape=3.99, Patato=2.99, Tomato=1.99, Banana=1.99}
    }
}
