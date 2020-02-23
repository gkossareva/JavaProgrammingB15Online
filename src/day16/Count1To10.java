package day16;

public class Count1To10 {
    public static void main(String[] args) {
        int counter=1;
        while (counter<11) {
            System.out.println(" Counter value: "+counter);
//smh has to be done to change the condition along the way
            //or it just keep running forever
            ++counter;
        }
    }
}
//10<=10--->true 11<=10 false
//10<11---->false