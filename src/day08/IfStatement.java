package day08;

public class IfStatement {
    public static void main(String[] args) {
        int speedLimit=60;
        int yourCurrentSpead=100;
        //if the current speed is more than speed limit
        //get pulled over by the police
        //given ticket by the police
        //taken away some points fom your licence
        //go to court
boolean amISpeeding=(yourCurrentSpead>speedLimit);
//inside parenthesis we can only put
        //boolean value
        //boolean variable
        //any expression that return boolean  value
//if(amISpeeding) {
       // if(true){
        if(yourCurrentSpead>speedLimit){
    System.out.println("get pulled over by the police");
    System.out.println("given ticket by the police");
    System.out.println("taken away some points fom your licence");
    System.out.println("go to court");
}else{
    System.out.println("go shopping");
    System.out.println("buy ice cream");
    System.out.println("enjoy your day");
}
        System.out.println("The end");
        //if not over the limit
        //go shopping

        //outside the statement say the end



    }
}
