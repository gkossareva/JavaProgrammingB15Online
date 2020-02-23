package day07;

public class Casting {
    public static void main(String[] args) {

       // int num=10;

        //10 is automatically converted to double 10.0
        //and stored inside bigNum behind scene
        double bigNum=10;

        System.out.println(bigNum);
    //12.99 is double, double has much bigger range than int
        //so it just does not fit
        //int num=12.99;----->error!!!

        int num= (int) 12.99;
        System.out.println(num);

        //create a long variable and store int
        //create an int variable and try to store above long variable

        int num3= (int) 345678909988L;
        long num4=(long)167;
    }

}
