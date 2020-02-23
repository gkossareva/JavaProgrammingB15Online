package day16;

public class CountFrom10to1 {
    public static void main(String[] args) {
        //i want to start from 10 and the descrease the value by one
        //so i can get out of the loop

        int count=10;
    /*    while( count>=1 ) {
            System.out.println( count);
            --count;*/
    while (count!=0){
        System.out.println(count);
--count;
        }
        System.out.println("Final value of count is " + count);
    }
}
