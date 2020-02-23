package day06;

public class CoinConverter {
    public static void main(String[] args) {
        // you have $2
        //how many dimes you can get
        //how many quarters you can get
        //how many nickle you can get
        //how many penny you can get

        int cent=200;

        //you have purchased candle for 0.74 cent, what will be your remainder

        cent -=74;
        int quarter=cent/25;
int penny =cent%25;
        System.out.println(quarter);
        System.out.println(penny);
    }
}
