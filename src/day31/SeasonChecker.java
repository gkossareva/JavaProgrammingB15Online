package day31;

public class SeasonChecker {
    public static void main(String[] args) {

        String season = " Winter";
        decideSeasonAction("winter");
        decideSeasonAction("Spring");
        decideSeasonAction(season);
}


/*
write a static method called decideSeasonAction
it has one String parameter called season
iside method:
according to what user passed it should print correct action
 */
public static void decideSeasonAction( String season) {

    switch (season) {
        case "Spring":
            System.out.println("Hiking");
            break;
        case "Summer":
            System.out.println("swimming");
            break;
        case " Fall":
            System.out.println("Pumpking picking");
            break;
        case "winter":
            System.out.println("Go snowboarding");
            break;
        default:
            System.out.println("Invalid season");
    }
}}