package Repl;
//max function gets two ints, x and max.
//x is the test case, max is what we test against.
//
//if  x is bigger then max return max
//in any other case return x.
//
//for example:
//
//max(1,10)
//returns 1
public class Repl164ReturnMethod {
    public static void main(String[] args) {
        System.out.println( waterTax(151));
        System.out.println(threeLocks(true,true,false));
        System.out.println(threeLocks(false,false,true));
        System.out.println(threeLocks(true,false,true));
        System.out.println(threeLocks(true,true,true));
    }
    public int max(int x,int  max) {
        if (x > max) {
            return max;
        } else {
            return x;
        }
    }
//isEven method gets a number(int) if its even (2,4,8...) returns true.
//if its odd return false.
//
//for example:
//
//isEven(1) --> false
//
//isEven(8) --> true
public boolean isEven(int n) {
        if (n%2==0) {
            return true;
        }else{
            return false;
        }
}
//c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
//it returns a string value that can be "profit","loss","no loss"
//
//for example:
//c_profis(100,1500)
//returns : "profit"
    public String c_profits (int buyPrice,int sellPrice) {
        //your code here
        if (sellPrice>buyPrice){
            return "profit";
        }else if (buyPrice>sellPrice){
            return "loss";
        }else{
            return "no loss";
        }


    }
    public boolean hamletQuote(boolean toBe,boolean notToBe)
    {
        if (toBe==true || notToBe == true || (toBe==true && notToBe == true)){
            return true;
        }else{
            return false;
        }

    }
    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        if (units<=50){
            bill = units * 0.60;
        }else if (units>50 && units<100){
            bill = units * 0.90;
        }else if(units>=100 && units<150){
            bill = (units * 0.90)+50;
        }else if(units>=150){
            bill = (units * 0.90)+100;
        }



        //end your code here


        return bill;
    }//end waterTax

    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        if ((a==true&&b==true)||c==true){

            return true;
        }else {
            return false;
        }


    }//end threeLocks
}