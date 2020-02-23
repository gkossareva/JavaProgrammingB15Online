package day33;

public class NumberAction {
    public static void main(String[] args) {
        System.out.println(getSumFrom1toX(6));
        System.out.println(build_GOT_Email("Arya","Stark"));
        System.out.println(build_GOT_Email("Sam","Tarly"));

        String fullName="Susan Cure";
        String part1=fullName.split(" ")[0];
        String part2=fullName.split(" ")[1];
        String herEmail=build_GOT_Email(part1,part2);
        System.out.println("herEmail = " + herEmail);
    }

    /**
     * getSumFrom1toX
     * This method should calculate the sum of
     * the numbers from 1 to the positive number user passed.
     * including the number itself
     *
     * @param x final number to be added
     * @return the sum of numbers from 1 to x as int
     */
    public static int getSumFrom1toX(int x) {
        int sum = 0;
        //TODO: YOUR CODE GOES HERE
        for (int i = 1; i <= x; i++) {
            sum += i; // sum = sum + i ;
        }
        return sum;
    }


    /**
     * build_GOT_Email
     * This method should build email using user's first and last name
     * for example Jon Snow --->> JSnow@NightWatch.com
     * @param firstName user's first name
     * @param lastName  user's last name
     * @return the email created using
     * firstName initial + lastName + @NightWatch.com
     */

public static String build_GOT_Email(String firstName,String lastName){
    String email=firstName.charAt(0)+lastName+"@NightWatch.com";
    return email;
}
}