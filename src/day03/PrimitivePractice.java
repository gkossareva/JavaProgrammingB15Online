package day03;

public class PrimitivePractice {
    public static void main(String[] args) {
        byte letterCount = 26;
        System.out.print("The letter count is " + letterCount );
        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount);
        int catCount = 20;
        System.out.println("The cat count is " + catCount);
        long mileToSun = 100000000L;
        System.out.println("The miles to the Sun are " + mileToSun);
                // floating point
        float priceOfBanana = 1.99f; // you must add f at tthe end to indicate this is float data type
        float priceOfPotato = 2.99F;
        System.out.printf("The price of bananas in VA is " + priceOfBanana + "and the price of potatoes is " + priceOfPotato);
        //---------------- larger floating point numbers------

        double priceOfIpad1 = 355.99d;
        double priceOfIpadPro = 1024.99D;
        //compiler automatically assume its a double so its not required to have d
        //However for good programming habit, add them always
        double priceOfMac = 2299.99;
        System.out.println("The price of Ipad1 is " + priceOfIpad1 + "the price Of IpadPro is " + priceOfIpadPro + "and the price of Mac is " + priceOfMac);

        //if you have a whole number by itself, compiler automatically assume its an int
        //if you have a fractional number by itself, compiler automatically assume its a double


    }
}
