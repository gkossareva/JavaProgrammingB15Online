package day24;

public class ShoppingWithArray {
    public static void main(String[] args) {
        //Create a String array of 6 items to store groceryItems
        //{"apple","banana","grape","strawberry","blueberry","kiwi"}
        //Create a float array of 6 float values to store prices
        //{ 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
        //assume that the order of grocery Items match the prices in same order.

        //     String [] groceryItems= new String [6];
        //String [] groceryItems= new String[]{"apple","banana","grape","strawberry","blueberry","kiwi"};
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
//print everything in 1 line with arrow and do not put arrow after last one
       // for (String eachFruit : groceryItems) {
         //   System.out.print(eachFruit);
           // System.out.print("---->");

            int itemCount = groceryItems.length;
            int lastItemIndex = itemCount - 1;
            String lastFruit = groceryItems[lastItemIndex];

            for (String eachFruit:groceryItems) {

                System.out.print(eachFruit);
                if (!eachFruit.equals(lastFruit)){

                    System.out.print("---->");
            }
        }
    }
}