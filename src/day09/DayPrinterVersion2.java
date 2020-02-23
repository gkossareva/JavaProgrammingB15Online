package day09;

public class DayPrinterVersion2 {
    public static void main(String[] args) {
        int dayCode = 4;
        String dayName="";//assigning an empty String value
        if (dayCode == 1) {
            dayName="Monday";
        } else if (dayCode == 2) {
            dayName="Tuesday";
        } else if (dayCode == 3) {
            dayName="Wednesday";
        } else if (dayCode == 4) {
            dayName="Thursday";
        } else if (dayCode == 5) {
            dayName="Friday";
        } else if (dayCode == 6) {
            dayName="Saturday";
        } else if (dayCode == 3) {
            dayName="Sunday";
        } else {
            System.out.println("Unknown");
        }
    }
}

