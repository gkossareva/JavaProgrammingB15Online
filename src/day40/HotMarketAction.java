package day40;

import java.util.ArrayList;

public class HotMarketAction {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.changeLocation("DC");
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();
        o1.changeAllInfo("Amazon","Virginia",150000,true );
        o1.displayInformation();
//if this guy earn more than 100k
        //move him to Atlanta

        boolean result = o1.is100Koffer();
        if (result==true){
            o1.changeLocation("Atlanta");
        }
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = true;
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 98000;
        o3.displayInformation();
//i want to add 2k to tthe Amazon offer
        o3.salary=o3.salary+2000;
        System.out.println("new Amazon salary = " + o3.salary);
        Offer o4 = new Offer();
        // if we don't assign values for instance filed|variable
        // we get default value
        // for primitive numbers : 0 or 0.0
        // boolean : false
        // char    : ''
        // for any reference types :
        // null

        o4.displayInformation();
        o4.tturnToFullTime();
        o4.displayInformation();
        // creating ArrayList of Offer to store multiple offer objects
        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        String o1Str = o1.toString();
        System.out.println("o1Str = " + o1Str);

        System.out.println(o1.toString());
        // if you directly print out object , it will call toString() method automatically
        System.out.println(o1); // this is what is automatically happening behind the scene o1.toString()


        //set the salary value of o4 offer object to sum of all the offers

        o4.salary=o1.salary+o2.salary+o3.salary;
        o4.changeLocation("DC");
        o4.displayInformation();


        System.out.println("myOffers ---------------------------");

        for (Offer each : myOffers) {

            each.displayInformation();

        }
        System.out.println("myOffers==========================with loop");

        for (int x = 0; x < myOffers.size(); x++) {
            //store each item to a variable
          Offer  each=myOffers.get(x);
          each.displayInformation();
        }
        o1.toString();
    }}