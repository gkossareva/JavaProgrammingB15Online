package day11;

public class Warmup1 {
    public static void main(String[] args) {
        /* Create a variable called targerOption as String and assign one of the below option; for ex Bd
        you have 4 switches in your home to turn on
       Bd -bedroom
        Lr-living room
        ki-kitchen
        Ha-hallway
        use switch statement to write a program to print which room light is turned on. For ex if Bd was targerOption
        then print you have turned on bedroom light
         */
        String targetOption="Lr";

        switch(targetOption){

            case "Bd" :
                System.out.println("You have turned on bedroom light");
                break;
            case "Lr" :
                System.out.println("You have turned on living room light");
                break;
            case "Ki" :
                System.out.println("You have turned on kitchen light");
                break;
            case "Ha" :
                System.out.println("You have turned on hallway light");
                break;
            default:
                System.out.println("No such room light");
                break;
        }
    }
}

