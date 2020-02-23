package Repl;
import java.util.*;
public class Repl53VehicleRecall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = scan.nextInt();
        //SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
        if ((vehicleYear >= 1995 && vehicleYear <= 1998) || (vehicleYear == 2001 || vehicleYear == 2002) || (vehicleYear >= 2004 && vehicleYear <= 2006) || (vehicleYear >= 2015
                && vehicleYear <= 2017)) {
            System.out.println("Your vehicle needs to be recalled!");
        } else {
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}