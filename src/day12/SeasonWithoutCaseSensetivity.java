package day12;
import java.util.Scanner;
public class SeasonWithoutCaseSensetivity {
    public static void main(String[] args) {
        //create String variable season
        //assign value by asking user question : ""Enter your season , please"
        //chech the season using if statements without caring about the case
        //if Spring ---> Hiking, Navruz, Allergy,Season, Cool Weather
        //If summer ----> Pool, Swimming, Beach, Vacation
        //If Fall--->BBQ, Riding Bike, JUST CODE!
        //IF Winter----> Code, Skiing

        String season;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enteryour season please");
         season = scan.next();

         if (season.equalsIgnoreCase("spring")){
             System.out.println("Hiking, Navruz, Allergy,Season, Cool Weather");
         }else if(season.equalsIgnoreCase("summer")){
             System.out.println("Pool, Swimming, Beach, Vacation");
         }else if (season.equalsIgnoreCase("Fall")) {
             System.out.println("BBQ, Riding Bike, JUST CODE!");
         }else if (season.equalsIgnoreCase("Winter")){
             System.out.println("Code, Skiing");
         }else {
             System.out.println("Not Valid");
         }
    }
}
