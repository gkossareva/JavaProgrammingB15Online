package day44;

public class Train extends Vehicle {

    int wagonCount;
    public void makeChoChoSound(){
        System.out.println("CHOO CHOO");
    }

    public static void main(String[] args) {

        Train t1=new Train();
        t1.makeChoChoSound();
      //these attributes we got from vehicle
        t1.make="Thomas";
        //t1.year = 1999; private is not inherited
        t1.setYear(1999);
        //calling the method
        t1.start();
        t1.goForward();

    }

}
