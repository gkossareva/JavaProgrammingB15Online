package Repl;
import java.util.Scanner;
import java.util.Arrays;
public class Repl127 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
      int day=0;
        int totalPpl=0;
do {
    System.out.println("Day " + day + Arrays.toString(inhabitants));
    day++;
    for (int i = 0; i < inhabitants.length; i++) {
        inhabitants[i] /= 2;
        totalPpl = totalPpl + inhabitants[i];
       // if(inhabitants[i]==0){
         //   break;
       // }
    }
}while (totalPpl>0);

    System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
    System.out.println("---- EXTINCT ----");

    }
    }
       /* int count = 0;
        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
        for (int j = 0; j < inhabitants.length; j++) {
            while (inhabitants[j] != 0) {
                for (int k = j; k < inhabitants.length; k++) {
                    inhabitants[k] /= 2;
                }
                System.out.println("Day " + ++count + " " + Arrays.toString(inhabitants));
            }

        }
        System.out.println("---- EXTINCT ----");
    }
}*/
