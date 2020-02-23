package day10;

public class MultyBranchWithSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonalds, what can I get for you?");

        //11 burger
        // 5 French fry
        //8 nuggets
        //35 ice cream
        //55 coke

        String order="";
        int itemNumber=35;
        //what data type i can use here?- byte, short, int, char, string
 switch(itemNumber){
        case 11:
            System.out.println("You have selected 11");
            order="Burger";
            break;// if break does not show up here it will just move on to next case
     case 5:
            System.out.println("You have selected 5");
            order="French fry";
            break;
     case 8:
            System.out.println("You have selected 8");
            order="nuggets";
            break;
       case 35:
            System.out.println("You have selected 35");
            System.out.println("Yan!Yam!");
            System.out.println("Enjoy");;
            order="ice cream";
            break;
     case 55:
            System.out.println("You have selected 55");
            order = "coke";
        break;
     default:
            System.out.println("You have selected unknown number!!");
            order = "unknown";
            break;
        }
        System.out.println("Your order is "+order);
    }
}


