package day11;

public class StringEqualityPractice_Condition {
    public static void main(String[] args) {

        //create a program to check wether myStr and assign value
        //check wether myStr value is Java
        //if true---->> correct word!
        //if false---->>Say Java!


        //update this program to add more condition
        //using else if in the middle
        /*
        check the value of myStr
        if it is Java------>correct word
        if it is Cava------>Pumpkin!!
        else say NOT JAVA NOR PUMPKIN
         */
        String myStr="Cava";
        if(myStr.equals("Java")){
            System.out.println("Correct Word!!");
        }
        else if (myStr.equals("Cava")) {
            System.out.println("Pumpkin!!");
        }
        else {
            System.out.println("Not Java Not Pumpkin!!");
        }


    }
}
