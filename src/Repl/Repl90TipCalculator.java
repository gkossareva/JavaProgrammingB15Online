package Repl;



import java.util.Scanner;

public class Repl90TipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String splitNo=scan.next();
if (splitNo.equalsIgnoreCase("no")){
    System.out.println("Check amount:");
    double checkAmount=scan.nextDouble();

    double serviceQuality;
    System.out.println("Service Quality:");
    String quality=scan.next();

    if (quality.equalsIgnoreCase("poor")){
        serviceQuality=0.05;
      //  System.out.println("Poor");
        System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.05));
        System.out.println("Total tip: "+checkAmount*0.05);
    }
    if (quality.equalsIgnoreCase("fair")) {
        serviceQuality = 0.10;
        //System.out.println("Fair");
        System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.10));
        System.out.println("Total tip: "+checkAmount*0.10);
    }
    if (quality.equalsIgnoreCase("good")) {
        serviceQuality = 0.15;
        //System.out.println("Good");
        System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.15));
        System.out.println("Total tip: "+checkAmount*0.15);
    }
    if (quality.equalsIgnoreCase("great")) {
        serviceQuality = 0.20;
        //System.out.println("Great");
        System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.20));
        System.out.println("Total tip: "+checkAmount*0.20);
    }
    if (quality.equalsIgnoreCase("excellent")) {
        serviceQuality = 0.25;
        //System.out.println("Excellent");
        System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.25));
        System.out.println("Total tip: "+checkAmount*0.25);
    }
}else if (splitNo.equalsIgnoreCase("yes"))
        System.out.println("Number of people:");
        int peopleNo=scan.nextInt();

        System.out.println("Check amount:");
        double checkAmount=scan.nextDouble();

        double serviceQuality;
        System.out.println("Service Quality:");
        String quality=scan.next();
        System.out.print("Number of people entered: ");
        for (int i = 0; i <peopleNo; i++) {
            // if (peopleNo==1){
            System.out.print("&");
            //}
        }
      System.out.println();
        if (quality.equalsIgnoreCase("poor")){
            serviceQuality=0.05;
            //  System.out.println("Poor");
            System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.05));
            System.out.println("Total tip: "+checkAmount*0.05);
            System.out.println("Total per person: "+ (checkAmount+checkAmount*0.05)/peopleNo);
            System.out.println("Tip per person: "+ (checkAmount*0.05)/peopleNo);
        }
        if (quality.equalsIgnoreCase("fair")) {
            serviceQuality = 0.10;
            //System.out.println("Fair");
            System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.10));
            System.out.println("Total tip: "+checkAmount*0.10);
            System.out.println("Total per person: "+ (checkAmount+checkAmount*0.10)/peopleNo);
            System.out.println("Tip per person: "+ (checkAmount*0.10)/peopleNo);
        }
        if (quality.equalsIgnoreCase("good")) {
            serviceQuality = 0.15;
            //System.out.println("Good");
            System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.15));
            System.out.println("Total tip: "+checkAmount*0.15);
            System.out.println("Total per person: "+ (checkAmount+checkAmount*0.15)/peopleNo);
            System.out.println("Tip per person: "+ (checkAmount*0.15)/peopleNo);
        }
        if (quality.equalsIgnoreCase("great")) {
            serviceQuality = 0.20;
            //System.out.println("Great");
            System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.20));
            System.out.println("Total tip: "+checkAmount*0.20);
            System.out.println("Total per person: "+ (checkAmount+checkAmount*0.20)/peopleNo);
            System.out.println("Tip per person: "+ (checkAmount*0.20)/peopleNo);
        }
        if (quality.equalsIgnoreCase("excellent")) {
            serviceQuality = 0.25;
            //System.out.println("Excellent");
            System.out.println("Total to pay: "+ (checkAmount+checkAmount*0.25));
            System.out.println("Total tip: "+checkAmount*0.25);
            System.out.println("Total per person: "+ (checkAmount+checkAmount*0.25)/peopleNo);
            System.out.println("Tip per person: "+ (checkAmount*0.25)/peopleNo);
        }


    }
}