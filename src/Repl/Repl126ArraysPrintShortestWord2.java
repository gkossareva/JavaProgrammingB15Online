package Repl;
import java.util.Arrays;
import java.util.Scanner;
public class Repl126ArraysPrintShortestWord2 {
    public static void main(String[] args) {
        //Write a program that will find out shortest words in the given string str.
        // If there are few words that are evenly short, print them all.
        // Use split method in order to split str string variable and create an array of strings.
        // Print array with Arrays.toString() method. Sort array before printing.
        //Split values by comma: split(", ");
        //input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        //output: [cat, old, ray]

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");

        int[] wLength = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            wLength[i] = words[i].length();
        }

        int count = 0;
        int shortest = wLength[0];
        for (int x = 0; x <wLength.length; x++) {
            if (wLength[x]<shortest) {
                shortest = wLength[x];
            }
        }

        for(int eachItem : wLength){
            if (eachItem == shortest){
                count++;
            }
        }

        String[] newArr = new String [count];
        int l=0;
        for (int m = 0; m <words.length ; m++) {
            if (words[m].length() == shortest) {
                newArr[l] = words[m];
                l++;
            }

        }
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
    }
}