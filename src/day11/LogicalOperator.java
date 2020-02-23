package day11;

public class LogicalOperator {
    public static void main(String[] args) {
        //combining multiple condition together
        //in java there is no range check directly like math
        //for example int x=70
        // in math: 60<x<100----->true<100
        //in Java: x>60 && x<100

        //&& 2 ampersand & 1 ampersand------>>Logical AND operator
        //This is used to check both conditions are true at the same time


        //think about password login example- only when your login and password correct at the same time
        // ___>then you will be able to login
        /*
                True True
       int x=70 x>60&& x<100; true
                False      True
       int x=10  x>10 &&    x<100 false
                 true     false
       int x=110 x>60&& x<100;false
                 true   true
       int x= 99 x>60 && x<100;true

       ||2 pies or |1 pie is used for compiling 2 conditions: Logical orOperator
       if you have 2 conditions to check
       When will this be true : As long as one side is true, whole result will  be true
       As long as you found milk in one store , you got the milk then you get out
         */

        //as long as one side is true whole result will be true

        /*         true    false
        int x =70; x> 10 || x<5  ------>true

                  false    false
        int x =7; x> 10 || x<5----------->false

                   true    false
        int x =17; x> 10 || x<5----------->true

                    false    true
        int x =-8; x> 10 || x<5------->true
         */
       /* System.out.println("Truth table");
        System.out.println(true&&true);
        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);*/

       System.out.println("Truth table");
        System.out.println("Result of true && true is " +(true&&true));
        System.out.println("Result of false && true is" +(false&&true));
        System.out.println("Result of true && false is" +(true&&false));
        System.out.println("Result of false && false is " +(false&&false));

         System.out.println("Truth table");
        System.out.println("Result of true ||true is " +(true||true));
        System.out.println("Result of false || true is" +(false||true));
        System.out.println("Result of true || false is" +(true||false));
        System.out.println("Result of false || false is " +(false||false));


        //create a variable called num with type int
        //find out wether this number is more than 100 or less than 10
        //find out the number is withing the range of 10-60
        //and print out the result

        int num=80;
        System.out.println("the result is " +(num>10 && num<100));
        System.out.println("the result is " +(num>10 || num<100));

        //more than 2 conditions at the same time

        System.out.println(true||false||false);//------>true
        System.out.println(true&&true&&false);//------->false

        int x=55;      //false  ||false ||true ----> true
        System.out.println(x==50|| x==51||x==55);

        //check
        // x is more than 50
        //and x is not equal 52
        // or x equal to 57
                          //   true&&true
                                      //true||false---->true
        System.out.println(x>50 && x!=52||x==57);

        System.out.println(true||false&& false);

       /* System.out.println(9/0);//error
        System.out.println(9/0==3);
        conmine the result of
        checking 5 is more than 10
        and 9 divided by 0 is 3
        */
        System.out.println(5>10);

          /* System.out.println(9/0);//error
        System.out.println(9/0==3);
        conmine the result of
        checking 5 is more than 10
        and 9 divided by 0 is 3
        */
         /*System.out.println(10>5 && 9/0==3);
        System.out.println(5>10 & 9/0==3);

          */
        System.out.println(10>5 || 9/0==3);
        System.out.println(10>5 | 9/0==3);
    }
}
