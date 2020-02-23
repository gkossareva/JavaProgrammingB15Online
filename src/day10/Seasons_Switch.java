package day10;
import java.util.Scanner;
public class Seasons_Switch {
    public static void main(String[] args) {
        //what do you do in each season
        //spring - hike
        //summer-swim
        //fall-black friday
        //winter- ski
Scanner scan=new Scanner(System.in);

        // byte , short , int , char , String
        System.out.println("Hey!What is your favourite season?");
        String season  = scan.next();

        switch(season){

            case "Spring" :
                System.out.println("Hike ! Easter , Nawruz, Blossom");
                break;
            case "Summer" :
                System.out.println("Swim , Vacation , BBQ , Holiday");
                break;
            case "Fall" :
                System.out.println("Black Friday , Hiking , Harvest , Halloween , Shopping");
                break;
            case "Winter" :
                System.out.println("Snowboarding , Ski , Chritmas , New Year");
                break;
            default:
                System.out.println("Error");
        }
    }
}
