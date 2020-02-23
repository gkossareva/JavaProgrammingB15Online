package day16;

public class WhileLoopPractice {
    public static void main(String[] args) {

        int x= 100;
        while(x<=105)  {
            System.out.println("Hello World");
            x++;//post increme. it will change the value next time x shows upnt
            ++x;//it will increase the value of x by 1 right away
        }

        /*
        iteration 1 1x=100
        check (100<=105)----->true "hello world"
        x=101
        iteration 2  x=101
        check (100<=105)----->true "hello world"
        x=102
        iteration 3 x=102
        check (100<=105)----->true "hello world"
        x=103
        iteration 4 x=103
         check (100<=105)----->true "hello world"
        x=104
        iteration 5 x=104
         check (100<=105)----->true "hello world"
        x=105
        iteration 6 x=105
         check (100<=105)----->true "hello world"
        x=106

        iteration 7
         check (100<=105)----->false get out of the loop
        x=107
         */
    }

}
