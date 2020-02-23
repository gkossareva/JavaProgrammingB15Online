package day40;
//Create Offer class with
//instance fields :
//location, company, salary , isFullTime
//instance methods :
//displayOfferDetails -- print all info about offers
//Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
//Optionally : @channel
//Store them into List<Offer> then call the method.
//Optionally :
//Add 5000 to each offers less than 100K
public class Offer {
    //instance fields
    String location;
    String company;
    long salary;
    boolean isFullTime;

    public void displayInformation(){
        System.out.println("Location = " + location + " | " + "Company = " + company + " | "
                + "Salary = " + salary + " | " + "isFullTime = " + isFullTime);
    }

    //write a method called turnToFullTime
    public void tturnToFullTime() {
        if (isFullTime == false) {
            isFullTime = true;
        }else{
            System.out.println("ALREADY FULL TIME");
        }
    }

    //write a method to change the location of the offer
    //to the location user passed
    public void changeLocation(String newLocation){
        location=newLocation;
    }
    //WRITE A METHOD TO ACCEPT 4 PARAMETRS TO CHANGE ALL INFO
    //ABOUT OFFERS
    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime){
        company=newCompany;
        location=newLocation;
        salary=newSalary;
        isFullTime=newIsFullTime;
    }
    //write a method to chevck the offer belong to 100k club
    public boolean is100Koffer(){

        return salary>=100000;
    }
    /**
     * Create an instance method called toString
     * has no parameter
     *
     * @param
     * @return String representation of Offer Object
     * <p>
     * In below format
     * [Location = Virginia , Company = Amazon | Salary = 150000 $ | isFullTime = true]
     */
    public String toString() {

        String str = "[ Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime + " ]";
        return str;
    }

}