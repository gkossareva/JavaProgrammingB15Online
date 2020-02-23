package Repl;
import java.util.Arrays;
import java.util.Scanner;
public class Repl128 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

      //  System.out.println(Arrays.toString(temps));
        k=temps.length;
        for (int i = 0; i < k; i++) {
total=total+temps[i];
        }
        avgTemp=total/k;
        System.out.println(avgTemp);

    }
}

