package day49;

public class TestVehicle {
    public static void main(String[] args) {

        
        Tesla t1=new Tesla(2020,460,"X");
        t1.selfDrive();
        t1.start();
        t1.goForward();
        System.out.println("t1 = " + t1);
    }
}