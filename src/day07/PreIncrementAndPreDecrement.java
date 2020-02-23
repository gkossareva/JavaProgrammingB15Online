package day07;

public class PreIncrementAndPreDecrement {

    public static void main(String[] args) {
        //increment a
        int apple=8;
        apple++;//incrementing by 1

        System.out.println(apple);//printing the increased value

      //  System.out.println(++apple);//increasing the value and print the value

        //apple++ when++ comes after the variable
        //it's called post increment
        //it will increase the value
        //but it will reflect the increased value next time the variable show up

        System.out.println(apple++);
        System.out.println(apple);

        int score=50;
        System.out.println(++score);//51
        System.out.println(score++);//51 and ready to be 52 when it shows up next time

        System.out.println(score);//52
        System.out.println(--score);//51
        System.out.println(score--);//51 and ready to be 50 when it shows up next time
        System.out.println(score);//50


    }
}
