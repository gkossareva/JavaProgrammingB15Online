package day10;

public class WarmUpTask2 {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonalds, what can I get for you?");

        //11 burger
        // 5 French fry
        //8 nuggets
        //35 ice cream
        //55 coke

        String order="";
        int itemNumber=7;

        if (itemNumber==11){
            System.out.println("You have selected 11");
            order="Burger";
        } else if(itemNumber==5){
            System.out.println("You have selected 5");
            order="French fry";
        } else if(itemNumber==8){
            System.out.println("You have selected 8");
            order="nuggets";
        } else if(itemNumber==35){
            System.out.println("You have selected 35");
            System.out.println("Yan!Yam!");
            System.out.println("Enjoy");;
            order="ice cream";
        } else if(itemNumber==55) {
            System.out.println("You have selected 55");
            order = "coke";
        }else{
            System.out.println("You have selected unknown number!!");
            order = "unknown";
        }
        System.out.println("Your order is "+order);
    }
}
