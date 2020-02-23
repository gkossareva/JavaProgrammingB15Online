package day31;

public class DailyRoutine {
    public static void wakeUp(){

        System.out.println("Open your eyes");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm?Open them again");
        System.out.println("================");
    }
public static void drinkCoffee(){
    System.out.println("Put coffee in your coffee machine");
    System.out.println("Make your coffee");
    System.out.println("================");
}
public static void prepareKidsForSchool(){
    System.out.println("Kids your kids to wake up");
    System.out.println("Wake them up for 10 times");
    System.out.println("Prepare their breakfast and lunch");
    System.out.println("Eat with them");
    System.out.println("==================");
    }

    public static void takeThemToSchool(){
        System.out.println("Take them to school");
        System.out.println("Say good bye");
        System.out.println("=====================");
    }
public static void studyJava(){
    System.out.println("Thinking about java waking up");
    System.out.println("Thinking about java drinking coffee");
    System.out.println("Thinking about java preparing kids to school");
    System.out.println("Thinking about java taking them to school");
    System.out.println("eventually sit and study java,practice practice");
    System.out.println("============");
}
public static void sayILoveJava300Times(){
    for (int i = 0; i <=300 ; i++) {
        System.out.println("I love Java!");
    }
    System.out.println();
}
    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        takeThemToSchool();
                studyJava();
        sayILoveJava300Times();
        /*
        wakeUp
        drinkCoffee
        prepareKidsForSchool
        takeThemToSchool
        goToWork
        groceryShopping
        cooking
        studyJava
        goToSleep
         */


    }

}
