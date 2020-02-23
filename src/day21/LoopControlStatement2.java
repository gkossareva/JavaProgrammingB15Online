package day21;

public class LoopControlStatement2 {
    public static void main(String[] args) {
        //continue
        //if line contains break reaches, the loop will skip to next iteration

        //we can use break and continue for any type of loop
        for (int x=1; x<= 100; x++) {

            if (x/5!=0) {
                continue;
            }

            System.out.println(x);
        }
    }
}
