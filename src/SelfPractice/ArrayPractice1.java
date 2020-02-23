package SelfPractice;
import java.util.Arrays;
public class ArrayPractice1 {
    public static void main(String[] args) {
//1, loop through each grocery items and print them in one line
//          1.1 print each items at odd index
//          1.2 print all items in reverse order
//          1.3 find out the index location of strawberry
//          1.4 find out the count of groceries that contains berry in the name
//          1.5 print out all the character counts of the grocery items
//          1.6 print out only those items with even character count
//          1.7 print out only those items end with letter e
//          1.8 print out only last 3 characters of all the items
//          1.9 create String variable called allItems and store all the items inside array separated by comma.
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        int indexOfGroceryItems = 0;
        int countGroceryItems = 0;
        int charCountGroceryItems = 0;
        System.out.println("1. loop through each grocery item and print them in one line");

        for (int i = 0; i < groceryItems.length; i++) { // i: 0, 1, 2, 3, 4, 5
            if (i % 2 != 0) {
                System.out.println(groceryItems[i]);
            }
            System.out.println("1.2 print all items in reverse order");
            for (int x = groceryItems.length - 1; x >= 0; x--) {
                System.out.println(groceryItems[x]);

            }
            System.out.println("  1.3 find out the index location of strawberry");
            for (int y = 0; y < groceryItems.length; y++) {
                if (groceryItems[y].equals("strawberry")) {
                    System.out.println(groceryItems[y]);
                }
            }
            System.out.println(" 1.4 find out the count of groceries that contains berry in the name");
            for (int z = 0; z < groceryItems.length; z++) {
                if (groceryItems[z].contains("berry")) {
                    countGroceryItems++;
                }
            }
            System.out.println("Groceries that contains berry in the name: " + countGroceryItems);

        }
        System.out.println(" 1.5 print out all the character counts of the grocery items");
        for (int a = 0; a < groceryItems.length; a++) {
            charCountGroceryItems = groceryItems[a].length();
            System.out.println("Character count of " + groceryItems[a] + " : " + charCountGroceryItems);
        }
        System.out.println(" 1.6 print out only those items with even character count");
        for (int b = 0; b < groceryItems.length; b++) {
            if (groceryItems[b].length() % 2 == 0) {
                System.out.println("Grocery Items with Even Character: " + groceryItems[b]);
            }
        }
        System.out.println("1.7 print out only those items end with letter e");
        for (int c = 0; c < groceryItems.length; c++) {
            if (groceryItems[c].charAt(groceryItems[c].length() - 1) == 'e') {
                System.out.println(groceryItems[c]);
            }
        }
        System.out.println(" 1.8 print out only last 3 characters of all the items");

        for (int d = 0; d < groceryItems.length; d++) {
            int lastCharacter=groceryItems[d].length()-3;
            System.out.println(groceryItems[d].substring(lastCharacter));
        }
        System.out.println(" 1.9 create String variable called allItems and store all the items inside array separated by comma.");
        for (int e = 0; e <groceryItems.length ; e++) {
                String allItems = groceryItems[e] + ", ";
                System.out.print(allItems);
        }
    }
}