package day10;

public class WarmUpTask1 {
    public static void main(String[] args) {
        //create a class called Answer with main
        //create a variable called myAnswer as String with value of empty String
        //create a variable called myNumber and assign the value
        //if the number can be devided by 5 without remeainder Assign myAnswer value to FizzNumber
        //if not assignthe value to not a FizzNumber
        //outside if else statemnet: print my number is<>, It is<value of myAnswer>

        String myAnswer="";
        int myNumber=5;
        if (myNumber%5==0) {
            myAnswer = "Fizz Number";
        }else {
            myAnswer="No Fizz Number";
        }
        System.out.println("My number is "+myNumber+", it is "+myAnswer);
    }
}
